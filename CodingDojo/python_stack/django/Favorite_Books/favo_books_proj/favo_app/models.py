# from django.db import models

# Create your models here.
from email import message
from django.db import models
from login_app.models import User
import re

class BookManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        if len(postData['title']) < 1:
            errors["title"] = "Title is Required"
        if len(postData['desc']) < 5:
            errors["desc"] = "description should be at least 2 characters"
        return errors

class Book(models.Model):
    title = models.TextField(max_length=255)
    desc = models.TextField(max_length=255)
    users_who_like = models.ManyToManyField(User, related_name="liked_books")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    uploaded_by = models.ForeignKey(User, related_name="books_uploaded", on_delete = models.CASCADE)
    objects=BookManager()