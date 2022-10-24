from django.urls import path
from . import views

urlpatterns = [
    
    path('shows', views.fun1),
    path('shows/new', views.fun2),
    path('showss', views.update),
    path('shows/<int:view>', views.fun4),
    path('shows/<int:view>/edit', views.fun5),
    path('showsssss/<int:view>/edit', views.update2),
    path('dele/<int:view>', views.fun7),
]