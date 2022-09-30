
# Create your views here.
from django.shortcuts import render,redirect
from .models import Dojo
from .models import Ninja

def index(request):
    context = {
    	"all_the_dojo_names": Dojo.objects.all(),
        "all_the_ninja_names": Ninja.objects.all(),
        
    }
    return render(request,"index.html",context)

def show1(request):

    Dojo.objects.create(name=request.POST['name'],city=request.POST['city'],state=request.POST['state'])
    
    return redirect("/")

def show2(request):
    y=request.POST['dojos']
    c=Dojo.objects.get(name=y)
    Ninja.objects.create(first_name=request.POST['first_name'],last_name=request.POST['last_name'],dojo=c)
    
    return redirect("/")