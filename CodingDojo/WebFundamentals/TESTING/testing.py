# LEAP YEAR .....
def is_leap_year(year):
    if year%400==0:
        print("true")
    elif year%100==0:
        print("false")  
    elif year%4==0:
        print("true")
    else:
        print("false")
is_leap_year(1600)
#Find a String
def count_substring(string,sub_string):
    
