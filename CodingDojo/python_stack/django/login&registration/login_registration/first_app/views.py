from django.shortcuts import render, HttpResponse, redirect
from django.contrib import messages
from .models import *
import bcrypt

def root(request):
    return render(request,'login_registration.html')

def register(request):
    errors = User.objects.basic_validator(request.POST)
    users=User.objects.all()
    for user in users:
        if user.email==request.POST['email']:
            errors['email']="this email aleady exsist"
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect('/')
    else:
        Password = request.POST['password']
        pw_hash = bcrypt.hashpw(Password.encode(), bcrypt.gensalt()).decode()
        User.objects.create(
            first_name=request.POST['first_name'],
            last_name=request.POST['last_name'],
            email=request.POST['email'],
            Password = pw_hash )
        user=User.objects.last()
        request.session['rename']=user.first_name
        request.session['userid']=user.id
    return redirect('/success')

def register1(request):

            return render(request,'success.html')


def login(request):
    user = User.objects.filter(email=request.POST['email'])
    if user:
        logged_user = user[0]
        if bcrypt.checkpw(request.POST['password1'].encode(), logged_user.Password.encode()):
            request.session['userid'] = logged_user.id
            return redirect('/success')
    return redirect("/")


def delete(request):
        del request.session['rename']
        del request.session['userid']
        return redirect("/")