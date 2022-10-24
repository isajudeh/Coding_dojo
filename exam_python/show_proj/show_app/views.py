from django.shortcuts import render

# Create your views here.
from turtle import title
from django.shortcuts import render ,redirect

from show_app.models import Show
from django.contrib import messages
   
from login_app.models import User

   
from .models import Show

def fun1(request):
    if 'userid' in request.session:
        context = {
            "user": User.objects.all(),
            "all_the_shows": Show.objects.all()
        }
        return render(request,"show1.html", context)
    else:
        return redirect("/")
def update(request):
    errors = Show.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect("/shows/new")
    Show.objects.create(
        title = request.POST['title'], 
        network = request.POST['network'], 
        release_date = request.POST['release_date'], 
        description = request.POST['description'],
        user=User.objects.get(id=request.session['userid']))
    
    last_show=Show.objects.last().id
    messages.success(request, "Show successfully updated")
    return redirect("/shows/"+str(last_show))


def fun2(request):
    return render(request,"show2.html")

# def fun3(request):
#     Show.objects.create( title = request.POST['title'], network = request.POST['network'], release_date = request.POST['release_date'], description = request.POST['description'])
#     last_show=Show.objects.last().id
#     return redirect("/shows/"+str(last_show))

def fun4(request, view):
    
    context = {
        "one_show": Show.objects.get(id=int(view))
    }
    return render(request,"show3.html", context)

def fun5(request, view):
    if 'userid' in request.session:
        context = {
            "one_show": Show.objects.get(id=int(view))
        }
        return render(request,"show4.html", context)
    else:
        return redirect("/")

def update2(request, view):
    errors = Show.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect("/shows/new")
    
    c=Show.objects.get(id=view)
    c.title=request.POST['title']
    c.network = request.POST['network']
    c.release_date = request.POST['release_date']
    c.description = request.POST['description']
    c.save()
    # Show.objects.create(title = request.POST['title'], network = request.POST['network'], release_date = request.POST['release_date'], description = request.POST['description'])
    # last_show=Show.objects.last().id
    messages.success(request, "Show successfully updated")
    return redirect("/shows/"+ str(view))

# def fun6(request ,view):
    
#     c=Show.objects.get(id=view)
#     c.title=request.POST['title']
#     c.network = request.POST['network']
#     c.release_date = request.POST['release_date']
#     c.description = request.POST['description']
#     c.save()
    
#     return redirect("/shows/"+ str(view))

def fun7(request ,view):
    c=Show.objects.get(id=view)
    c.delete()
    return redirect("/shows")