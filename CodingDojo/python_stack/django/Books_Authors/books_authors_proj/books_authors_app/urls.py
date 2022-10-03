from django.urls import path
from . import views

urlpatterns = [
    
    path('', views.index),
    path('books', views.show1),
    path('books/<int:view>', views.show2,),
    path('addauthor/<int:view>', views.show3),
]