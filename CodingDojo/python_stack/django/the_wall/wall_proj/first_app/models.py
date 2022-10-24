from email import message
from django.db import models
from login_app.models import User

class Message(models.Model):
    user= models.ForeignKey(User, on_delete = models.CASCADE)
    message = models.TextField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

class Comment(models.Model):
    user= models.ForeignKey(User, on_delete = models.CASCADE)
    comment = models.TextField(max_length=255)
    message = models.ForeignKey(Message, related_name="comment", on_delete = models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    
    
    