##
# Author        :   Fowzy Alsaud
# Assignment    :   # 5 Part 3 
# Date          :   Nov, 25th, 2021 - 11/25/2021
# Description   :   Description in the instructions of the homework
##

## Class for Queue
class Queue:
    # Our default constructor will create an empty list
    def __init__(self):
        self.qu = []
    # Enqueue function which will basically will add the new element to the list
    def enqueue(self, data):
        self.qu.append(data)
        return data
    # Dequeue function which will remove or pop out the first element in the list
    def dequeue(self):
        return self.qu.pop(0)
    # Rear function which will return the last element in the queue
    def rear(self):
        return self.qu[-1]
    # Front function which will return the first element in the queue
    def front(self):
        return self.qu[0]
    # isEmpty function which will return length of the queue and check if it's empty or not
    def isEmpty(self):
        return len(self.qu) == 0
    # printOut function to print out whats in this queue
    def showQueue(self):
        return self.qu
    # Size function to print out the size of the queue
    def Size(self):
        return len(self.qu)
# Hard code the list because our test cases are the same 
streamList = [1,10,3,5]
# Taking the size of the window from the user
windowSize = int(input('Window Size = '))
# Make an object for the queue that we gonna store our own temp Queue which basically will copy the orig. list into a queue
tempQueue = Queue()
# Make an object for the queue that we gonna store the results
resultQueue = Queue()
# Store my totals in queue
totals = Queue()
# temporary var. to store sum of the elements
total =0
# going to loop the same times as the size of the list: let's say we have 4 elements so we have to loop four times 
# for i in range(0,counter):
for i in streamList:
    # we should have two condition:
    # if the queue size NOT equal to windowSize then add the element to the queue and get the sum of the elements in that queue
    if tempQueue.Size() != windowSize:
        tempQueue.enqueue(i)
        total+=i
        totals.enqueue(total)
    # if the queue size is equal to window size then pop front and remove the first element from the queue and then remove the value from the sum
    elif tempQueue.Size() == windowSize:
        total-=tempQueue.dequeue()
        tempQueue.enqueue(i)
        total+=i
        totals.enqueue(total)
# This helps me store the window size plus one
count = 1
for x in totals.showQueue():
    # my counter started from one and it will increase one by one and it will stop when it hit the window size
    # if the count is bigger than my window size reset the counter and make it equal to the window size
    if count > windowSize:
        count = windowSize
        # push my result to the result queue
        resultQueue.enqueue(x/count)
    else:
        # push my result to thre result list/queue
        resultQueue.enqueue(x/count)
        # increase the counter by one as long as the counter not bigger than the window size
        count+=1
# print my results 
print('[',end='')
for i in resultQueue.showQueue():
    print(i, '', sep=' ',end='', flush=True)
print(']')