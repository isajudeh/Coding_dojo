from django.urls import path
from . import views
urlpatterns = [
    path('timedisplay', views.index),
]