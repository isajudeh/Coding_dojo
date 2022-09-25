from django.shortcuts import render,redirect
import random
computer=random.randint(1, 100) 

def index(request):
    request.session['computer']=computer
    return render(request,"index.html")     
def play(request):
    user_input= int(request.POST['gusee'])
    if user_input == request.session['computer']:
        request.session["result"]="correct"
    elif user_input < request.session['computer']:
        request.session["result"]="to low"
    else:
        request.session["result"]="to high"
        
   
    return redirect("/")

