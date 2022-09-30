from django.urls import path
from . import views

# urlpatterns = [
#     path('', views.root),
# ]

urlpatterns = [
    
    path('', views.index),
    path('result1', views.show1),
    path('result2', views.show2),
]