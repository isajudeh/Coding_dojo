from multiprocessing import context
from xml.etree.ElementTree import Comment
from django.shortcuts import render,HttpResponse,redirect

from first_app.models import Message,Comment
from login_app.models import User

def roots(request):
    context={
        "all_messages": Message.objects.all(),
        "all_comments": Comment.objects.all(),
    }
    return render(request,'wall.html',context)


def message(request):
    y=request.session['userid']
    c=User.objects.get(id=y)    
    Message.objects.create(user=c,message=request.POST['message'])
    message=Message.objects.last()
    request.session['mess']=message.message
    return redirect('/wall')

def comment(request,name):
    y=request.session['userid']
    c=User.objects.get(id=y)
    Comment.objects.create(user=c,comment=request.POST['comment'],message=Message.objects.get(id=name))
    return redirect('/wall')

