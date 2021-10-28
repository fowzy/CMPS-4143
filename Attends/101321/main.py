# Author        :   Fowzy Alsaud
# Date          :   Oct 13th, 2021
# Class         :   CMPPS 4143 - Dr. Das
# Topic         :   Attends program.
# Description   :   Today' class we have covered: #1 if and else, #2 if elif, else, #3 try & except, #4 while loops in Python


#example #3 shows how try and except
try:
    # example #1: if and else
    x= int(input('Please enter a value: '))
    if (x>2):
        print('x is greater than 2.')
    else:
        print('x is NOT greater than 2.')

    # example #2: if, elif, else
    y= int(input('Please enter a value: '))
    if(y<2):
        print('y is smaller than 2.')
    elif(y>1):
        print('y is greater than 2.')
    else:
        print('else condition.')
except:
    print('You entered invalid value.')

#example #4 looping using while and for loops
z = int(input('Please enter the value that you\'re trying to loop: '))
while z>0:
    print(z)
    z-=1

