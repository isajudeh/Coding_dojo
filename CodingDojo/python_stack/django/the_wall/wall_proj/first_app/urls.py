from django.urls import path
from . import views

urlpatterns = [
    path('wall', views.roots),
    path('postmessage', views.message),
    path('postcomment/<int:name>', views.comment),
]