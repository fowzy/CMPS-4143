import re

def NumFilter(s):
    # removing double quotes
    wordWithNoSymbols = re.sub(r"[“”\"]", '', s)
    if(re.search(r"([A-Za-z])+\s\d+", wordWithNoSymbols)):
    # return 0 because is in wrong format! should start with numbers then letters
        return 0
    else:
        # removing the letters because is in the right format
        conv2int = int(re.sub('([A-Za-z\s\"])', '', wordWithNoSymbols))
        # if the number is minus and out of range of 32 bit return negative -2^31
        if (conv2int < (-2 ** 31)):
            return int(-2 ** 31)
        elif(conv2int > (2 ** 31-1)):  # if the number is positive and out of range of 32 bit return 2^31-1
            return int(2 ** 31-1)
        else:                       # else means if the number is normal and in the right range just return match which is an integer as required
            return conv2int


ss = str(input('enter an input: '))
NumFilter(ss)
