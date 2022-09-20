# x = [ [5,2,3], [10,8,9] ] 
# students = [
#      {'first_name':  'Michael', 'last_name' : 'Jordan'},
#      {'first_name' : 'John', 'last_name' : 'Rosales'}
# ]
# sports_directory = {
#     'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
#     'soccer' : ['Messi', 'Ronaldo', 'Rooney']
# }
# z = [ {'x': 10, 'y': 20} ]
# x[1][0]=15
# print(x)
# students[0]["last_name"]="Bryant"
# print(students)
# sports_directory["soccer"][0]="Andres"
# print(sports_directory)
# z[0]["y"]=30
# print(z)
# students = [
#          {'first_name':  'Michael', 'last_name' : 'Jordan'},
#          {'first_name' : 'John', 'last_name' : 'Rosales'},
#          {'first_name' : 'Mark', 'last_name' : 'Guillen'},
#          {'first_name' : 'KB', 'last_name' : 'Tonel'}
#     ]
# def iterateDictionary(students):
#     i=0
#     for x in students:
#         print("first_name - ",students[i]['first_name'],", last_name - ",students[i]['last_name'])
#         i=i+1
# iterateDictionary(students)
# should output: (it's okay if each key-value pair ends up on 2 separate lines;
# bonus to get them to appear exactly as below!)
# first_name - Michael, last_name - Jordan
# first_name - John, last_name - Rosales
# first_name - Mark, last_name - Guillen
# first_name - KB, last_name - Tonel
# def iterateDictionary2(key_name, some_list):
#     i=0
#     for x in some_list:
#         print(some_list[i][key_name])
#         i=i+1
# iterateDictionary2("first_name", students)
# some_dict={}
# def printInfo(some_dict):
#     for x in some_dict:
#         print(len(some_dict[x]),x)
#         i=0
#         for y in some_dict[x]:
#             print(y)
# dojo = {
#    'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
#    'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
# }
# printInfo(dojo)
