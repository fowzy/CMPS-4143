# Author        =   Fowzy Alsaud
# Date          =   Oct, 20th, 2021
# Class         =   CMPS 4143 - Dr. Das
# Assignment    =   Assignment #3 - Part 3
# Descirption   =   Creating a program that will has a function that converts a string to a 32 bit signed integer
import re       # import re for regex

def myAtoi(s):  # my string called s as we see here
    # using regex(regular experssion) to filter my data out
    # removing spaces and words and double quotes, explain:
    #   -\d digits [0-9]
    #   - or use [0-9]
    #   -\s means white spaces
    #   -[A-za-z] remove range from A-Z CAPS and small letters a-z
    #   -\" removing double quotes"
    # removing different type of double quotes
    wordWithNoSymbols = re.sub(r"[“”\"]", '', s)
    if(re.search(r"([A-Za-z])+\s\d+", wordWithNoSymbols)):
        # return 0 because is in wrong format! should start with numbers then letters
        return 0
    else:
        # removing the letters because is in the right format and then convert it to integer
        conv2int = int(re.sub('([A-Za-z\s\"])', '', wordWithNoSymbols))
        # if the number is minus and out of range of 32 bit return negative -2^31
        if (conv2int < (-2 ** 31)):
            return int(-2 ** 31)
        elif(conv2int > (2 ** 31-1)):  # if the number is positive and out of range of 32 bit return 2^31-1
            return int(2 ** 31-1)
        else:                       # else means if the number is normal and in the right range just return match which is an integer as required
            return conv2int

# taking the input from the user as string
sInput = str(input('Please enter an input: '))
# pass the string to myAtoi function which I will explain later
output = myAtoi(sInput)
print(f'Output: {output}')