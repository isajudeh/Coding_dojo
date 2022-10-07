from turtle import title
from django.shortcuts import render ,redirect

from show_app.models import Show
from django.contrib import messages
   
   
   
from .models import Show
def update(request):
    errors = Show.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect("/shows/new")
    Show.objects.create(title = request.POST['title'], network = request.POST['network'], release_date = request.POST['release_date'], description = request.POST['description'])
    last_show=Show.objects.last().id
    messages.success(request, "Show successfully updated")
    return redirect("/shows/"+str(last_show))



def fun1(request):
    context = {
    	"all_the_shows": Show.objects.all()
    }
    return render(request,"show1.html", context)

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
    context = {
        "one_show": Show.objects.get(id=int(view))
    }
    return render(request,"show4.html", context)


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