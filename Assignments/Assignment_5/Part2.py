##
# Author        :   Fowzy Alsaud
# Assignment    :   # 5 Part 2 
# Date          :   Nov, 25th, 2021 - 11/25/2021
# Description   :   Find the duplication parenthesis from the expression.
##

### Input test:
    #   str = '((x+y))+z'
    #       >> duplication parenthesis? NO so it's TRUE expression
    #   strs = (x+y)
    #       >> duplication parenthesis? NO so it's FALSE expression
    #   strs = '((x+y)+((z)))'
    #       >> duplication? YES so it's TRUE expression

# Experssion is false by default
expression=False
# Taking an input from the user
usrInput = input(str())
# Count left side Parenthesis
leftParenthesis = 0
# Count right side Parenthesis
rightParenthesis = 0
# reading the user input
for i in usrInput:
    if (i == '('):
        leftParenthesis+=1
    if(i == ')'):
        rightParenthesis+=1

# So if we have duplication of parenthesis then it should be an even number and is TRUE else is FALSE
if leftParenthesis%2 == 0 and rightParenthesis%2 == 0:
    expression=True
    print(expression)
else:
    print(expression)