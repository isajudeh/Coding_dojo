# from django.shortcuts import render

# Create your views here.
from django.shortcuts import render,redirect
from favo_app.models import Book
from multiprocessing import context
from login_app.models import User

def index(request):
    context={
    "user": User.objects.all(),
    "all_books": Book.objects.all(),
    }
    return render(request,'books.html', context)

def add(request):
    y=request.session['userid']
    c=User.objects.get(id=y)
    Book.objects.create(title=request.POST['title'],desc=request.POST['desc'], users_who_like=c, uploaded_by=c)
    return redirect('/books')