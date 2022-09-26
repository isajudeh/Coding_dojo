# Biggie Size
str=[]
def big(str):
    i=0
    for x in str:
        if str[i]>0:
            str[i]='BIG'
        i=i+1
    return str
print (big([4,2,-6,3,-6,3]))
# Count Positives
str=[]
count=0
def positive(str):
    count=0
    i=0
    for x in str:
        if str[i]>0:
            count=count+1
        i=i+1
    str[-1]=count
    return str
print(positive([-1,-3,5,2,7,-4]))
# Sum Total
str=[]
def sum(str):
    add=0
    for x in str:
        add=x+add
    return add
print(sum([3,6,4,-5,-3,-9]))
# Average
str=[]
def avg(str):
    add=0
    i=0
    for x in str:
        i=i+1
        add=x+add
    return (add/i)
print(avg([1,2,3,4]))
# Length
str=[]
def length(str):
    i=0
    for x in str:
        i=i+1
    return (i)
print(length([]))
# Minimum
str=[]
def min(str):
    i=0
    minn=str[i]
    for x in str:
        if i!=(len(str)-1):
            if minn>str[i+1]:
                minn=str[i+1]
            i=i+1
    return (minn)
print(min([3,5,-4,3,-1,6,0]))
# Maximum
str=[]
def max(str):
    i=0
    maxx=str[i]
    for x in str:
        if i!=(len(str)-1):
            if maxx<str[i+1]:
                maxx=str[i+1]
            i=i+1
    return (maxx)
print(min([3,5,-4,3,-1,6,0]))
# Ultimate Analysis
str=[]
def ultimate(str):
    def sum(str):
        add=0
        for x in str:
            add=x+add
        return add
    def avv(str):
        add=0
        i=0
        for x in str:
            i=i+1
            add=x+add
        return(add/i)
    def min(str):
        i=0
        minn=str[i]
        for x in str:
            if i!=(len(str)-1):
                if minn>str[i+1]:
                    minn=str[i+1]
                i=i+1
        return (minn)
    def max(str):
        i=0
        maxx=str[i]
        for x in str:
            if i!=(len(str)-1):
                if maxx<str[i+1]:
                    maxx=str[i+1]
                i=i+1
        return (maxx)
    def length(str):
        i=0
        for x in str:
            i=i+1
        return (i)
    p={
        'sumTotal':(sum(str)),
        'average':(avv(str)),
        'minimum':(min(str)),
        'maximum':(max(str)),
        'length':(length(str))
        }
    return p
print(ultimate([4,3,6,3,-8,-4,2,-9]))
# Reverse List
str=[]
strR=[]
def reverse(str):
    i=0
    n=-1
    for x in str:
        strR.append(str[n])
        i=i+1
        n=n-1
    return strR
print(reverse([1,2,3,4,5]))
