# Author        =   Fowzy Alsaud
# Date          =   Oct, 20th, 2021
# Class         =   CMPS 4143 - Dr. Das
# Assignment    =   Assignment #3 - Part 2
# Description   =   this program basically store and view data like: first name, last name, age, occupation,
# and address as required. Also in the requirements I have to ask the user multiple questions about their data

import re

# Function to check if any string contains any numbers: to check if the first name or last name is a valid input
def notValid(_anyString):
    for i in _anyString:
        if i.isdigit():
            return True
# Function to check if the address is valid or NOT using regex or Regular Expression
# Source : https://regexlib.com/Search.aspx?k=us%20address and https://regexlib.com/Search.aspx?k=street+address&c=-1&m=-1&ps=20
def notAddress(address):
    regex = "\d{1,3}.?\d{0,3}\s[a-zA-Z]{2,30}\s[a-zA-Z]{2,15}"
    regex = re.compile(regex)
    match = regex.match(address)
    if not match:
        return True # return TRUE is NOT an address

people = []  # dictionary of people o store as much people as we can
numOfPeople = int(input('How many people to enter: '))
for i in range(numOfPeople):
    while True:
        # Ask user for string of 'first name'
        fname = str(input('Please enter the first name: '))
        if notValid(fname):
            print("Invalid Input, insert first name again: ")
        else:
            break
    while True:
        # Ask user for string of 'last name'
        lname = str(input('Please enter the last name: '))
        if notValid(lname):
            print("Invalid Input, insert last name again: ")
        else:
            break
    while True:
        # Ask user for int 'age'
        age = int(input('Please enter the age: '))
        if age >= 150:
            print("Invalid Input, insert correct age again: ")
        elif age <= 0:
            print("Invalid Input, insert correct age again: ")
        else:
            break
    while True:
        occupation = str(input('Please enter the occupation: '))      # Ask user string 'occupation'
        if notValid(occupation):
            print("Invalid Input, insert correct occupation again: ")
        else:
            break
    while True:
        # Ask user for string 'address'
        address = str(input('Please enter the address: '))
        if notAddress(address):
            print("Invalid Input, insert correct address again: ")
        else:  # if not TRUE means the address is VALID so we're going to move on
            break
    # Add all the elements to our 
    # each element in my dictionary store first name, last name, age, occupation, and address
    people.append({"first_name": fname, 
               "last_name": lname,
               "age": age,
               "occupation": occupation,
               "address": address})

# Print out the fianl output
for i in people:
    print(f'{i["first_name"]} {i["last_name"]}, aged {i["age"]} years, worked as a/an {i["occupation"]} lives in {i["address"]}.')
