# Countdown
str=[]
num=int(input("please enter the number: "))
while (num>=0):
    str.append(num)
    num=num-1
print(str)
# Print and Return
str=[]
def choose(str):
    print(str[0])
    return str[1]
choose([3,4])
# First Plus Length
str=[]
def plus(str):
    num=str[0]+len(str)
    print(num)
plus([4,3,6,3,7])
# Values Greater than Second
str=[]
str1=[]
num=0
def greater(str):
    if len(str)>2:
        while num<len(str):
            if str[num]>str[1]:
                str1.append(str[num])
                num=num+1
        print(str1)
greater([3,4,5,3,7,2,7,9,8])
# This Length, That Value
str=[]

def lt(a,b):
    x=0
    while x<a:
        str.append(b)
        x=x+1
    print(str)
lt(4,7)