from django.shortcuts import HttpResponse, redirect
from django.http import JsonResponse
def root(request):
    return redirect("/blogs")
# def index(request):
#     return HttpResponse("placeholder to later display a list of all blogs")
def new(request):
    return HttpResponse("placeholder to display a new form to create a new blog")
def create(request):
    return redirect("")
def show(request,number):
    return HttpResponse(f"placeholder to display blog number:{number}")
def edit(request,number):
    return HttpResponse(f"placeholder to edit blog {number}")   
def destroy(request,number):
    return redirect("/blogs")
def josn(request):
    return JsonResponse({"response": "JSON response from redirected_method", "status": True})

# -------------------------------
from django.shortcuts import render
# def index(request):
#     return render(request, "index.html")
def index(request):
    context = {
    "name": "Noelle",
    "favorite_color": "turquoise",
    "pets": ["Bruce", "Fitz", "Georgie"]
    }
    return render(request,"index.html", context)