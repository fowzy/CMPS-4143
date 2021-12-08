##
# Author        :   Fowzy Alsaud
# Assignment    :   # 5 Part 1 
# Date          :   Nov, 25th, 2021 - 11/25/2021
# Description   :   A stack data structure has like empty, size, top, push, pop and implemnt it with linked list.
##
class Stack():
    # Default constructor that will create an empty stack/list
    def __init__(self):
        self.stack = []
    # Function that will push data 
    def push(self, data):
        self.stack.append(data)
    # Function to pop up the data 
    def pop(self):
        self.stack.pop()
    # Function that returns if it empty or not
    def empty(self):
        return len(self.stack) == 0
    # Function that will get the size of the stack
    def size(self):
        return len(self.stack)
    # Function that will get the top of the stack
    def top(self):
        return self.stack[-1]

# Creating a node
class Node(object):
    # data = NULL and next node = NULL as well.
    def __init__(self, data, next=None):
        self.data = data
        self.next = next
    # Get the data of the node
    def get_data(self):
        return self.data
    # Get next 'where is the pointer points for'
    def get_next(self):
        return self.next
    # set next to point at another Node
    def nextNode(self, new_next):
        self.next = new_next

# Creating a stack
stack = Stack()
# Creating Linked List and making three different nodes 
first = Node(3)
second = Node(5)
three = Node(4)

# points at the next element: first > second > third
first.nextNode(second)
second.nextNode(three)

# print out my linked list
print(f'{first.get_data()}->\t\'{first.get_next()}\'\n{second.get_data()}->\t\'{second.get_next()}\'\n{three.get_data()}->\t\'{three.get_next()}\'')


# Check whether my stack is empty now or not?
print(f'Is my stack empty? {stack.empty()}')

# Add my nodes to the stack using push
stack.push(first.data)
stack.push(second.data)
stack.push(three.data)

print(f'the top of my stack is {stack.top()}')

# Check it again after adding few nodes
print(f'Is my stack empty? {stack.empty()}')
