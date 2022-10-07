import datetime
from xmlrpc.client import DateTime
from django.db import models
import re

class ShowManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        if len(postData['title']) < 2:
            errors["title"] = "Show Title should be at least 2 characters"
            
        TITLE_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+[a-zA-Z0-9.+_-]')
        if not TITLE_REGEX.match(postData['title']):         
            errors['title'] = "Invalid email address!"
            
        if len(postData['network']) < 3:
            errors["network"] = "Show Network should be at least 3 characters"
        if len(postData['description']) > 0:
            if len(postData['description']) < 10:
                errors["description"] = "Show Description should be at least 10 characters"
        return errors

class Show(models.Model):
    title = models.CharField(max_length=45)
    network = models.CharField(max_length=45)
    release_date = models.DateTimeField()
    description = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = ShowManager()