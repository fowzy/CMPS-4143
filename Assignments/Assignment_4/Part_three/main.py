###############################################################################################################################
#   Author      :   Fowzy Alsaud
#   Date        :   Nov, 10th, 2021
#   Class       :   CMPS 4143 - Dr. Das
#   Assignment  :   #4 Part #3
#   Description :   Write a program that implement the scenario of OOP and program will have FOUR classes 
#                       - Bank Account which will be the parent class and will hold the basic information like balance and account number and it will have two child:
#                       - First child is the checking class which it will hold the type of the account
#                       - Second child is the saving class which it will hold the type of the account
#                       - Customer class which it will holds the first name, last name, age and account list or in another word list of object that I created for checking or saving account
# In this program I define a class and then instantiate an object, and that main class (parent class) I inherited my parent class Bank Account to Saving and Checking account class which these two classes.
# Abstraction   :   Abstract the bank account class.
# Encapsulation :   It's basically making a class and encapulate my variable and methods into  a class. Which is described as It describes the idea of wrapping data and the methods that work on data within one unit. Like my 'Account class','Checking class','Saving class', and 'Customer class'
# Polymorphism  :  
#   - Runtime (Overriding): getInfo(self) is method overriding which I basically used in my child class and my parent class and the child class invoked the main the function in the parent class and printed the one in the child class
#   - Compile time(Overloading): Method Overloading, a way to create multiple methods with the same name but different arguments, is not possible in Python according to programiz.com.
# Inheritance   :   Class Saving(child 1) and class Checking(child 2) both inherited from class Bank Account(parent)
###############################################################################################################################

from saving import Saving
from checking import Checking
from customer import Customer
# Created a checking account for myself
checkingAcct1 = Checking(1, 100)
print('-'*50)
# Created an object to make a profile as customer
Customer1 = Customer('Fowzy','Sas',26,checkingAcct1)
# Customer1.addAccount(checkingAcct1)
print('-'*50)
# Withdraw money
checkingAcct1.withdraw(150)
# Deposite money
checkingAcct1.deposite(1000)
print('-'*50)
# Created a saving account for myself again
savingAcct1 = Saving(2,100000)
# Add account to my list of my accounts
Customer1.addAccount(savingAcct1)
# Print first name, last name, age, list of accounts
print('-'*50)
Customer1.getCustomerDetails()
# Print Fowzy' accounts List and details
Customer1.getAccounts()