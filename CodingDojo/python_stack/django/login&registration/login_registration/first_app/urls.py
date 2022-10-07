from django.urls import path
from . import views

urlpatterns = [
    path('', views.root),
    path('register', views.register),
    path('success', views.register1),
    path('login', views.login),
    path('logout', views.delete),
]