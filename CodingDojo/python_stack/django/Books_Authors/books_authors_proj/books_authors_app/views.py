

# Create your views here.
from django.shortcuts import render,redirect
from .models import Book
from .models import Author

def index(request):
    context = {
    	"all_the_book_names": Book.objects.all(),
    }
    return render(request,"index.html",context)

def show1(request):

    Book.objects.create(title=request.POST['title'], desc=request.POST['description'])
    
    return redirect("/")

def show2(request, view):
    
    c= Book.objects.get(id=view)
    context = {
    	"all_the_book_names": Book.objects.all(),
        "all_the_author_names": Author.objects.all(),
        "the_book": Book.objects.filter(id=view).values(),
        "the_author": c.authors.all().values()
    }
    return render(request,"books.html",context)

def show3(request, view):
    this_author = Author.objects.get(id=request.POST['auth'])
    this_book = Book.objects.get(id=view)
    this_book.authors.add(this_author)
    return redirect("/books/"+str(view))

