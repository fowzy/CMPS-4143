words_list = [] # Creating a list to store my words
dic1 = dict()   #Creating a dictionary
our_sent = str(input('Enter the sentance: ')) # Taking a string input from the user
# or use some of these sentances 
sent1 = 'Writing programs (or programming) is a very creative and rewarding activity.  You can write programs for many reasons ranging from making your living to solving a difficult data analysis problem to having fun to helping someone else solve a problem.  This book assumes that everyone needs to know how to program and that once you know how to program, you will figure out what you want to do with your newfound skills.'
sent2 = 'We are surrounded in our daily lives with computers ranging from laptops to cell phones.  We can think of these computers as our “personal assistants” who can take care of many things on our behalf.  The hardware in our current-day computers is essentially built to continuously ask us the question, “What would you like me to do next?”'
sent3 = 'Our computers are fast and have vast amounts of memory and could be very helpful to us if we only knew the language to speak to explain to the computer what we would like it to do next.  If we knew this language we could tell the computer to do tasks on our behalf that were repetitive. Interestingly, the kinds of things computers can do best are often the kinds of things that we humans find boring and mind-numbing.'
words_list = our_sent.split(' ') # Split the string and store it in words list
maxWord = str() # a var. to store the most freq word
for i in words_list:    # for loop to count the most freq words
    if i in dic1:
        dic1[i] +=1
    else:
        dic1[i] = 1
max =list(dic1.values())[0]
for key, value in dic1.items():
    if value > max:
        max = value
        maxWord = key
print(f'The most freq word is "{maxWord}" and counted this many times: "{max}".')
#slaeh fowzy sl fowzy