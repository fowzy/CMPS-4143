# Bank account (Parent)
from abc import ABC, abstractclassmethod
class Account(ABC):
    #class attribute
    accountNumber=None
    balance=None
    # instance attribute or Constructor
    def __init__(self,num,bal):
        self.accountNumber = num
        self.balance = bal
        print('Account has been created.')
    # Getter
    # Method overriding (Polymorphism: Runtime)
    @abstractclassmethod
    def getInfo(self): # get info like first, last name, account number, and balance
        print(f'Account Number {self.accountNumber}')
        print(f'Balance is {self.balance}')
    # Accesser
    def withdraw(self, amount): #withdraw money
        # Check if the account has this amount if not decline the transication
        if self.balance < amount:
            print("You are broke")
        else:
        # If yes go ahead and withdraw the money
            self.balance-=amount
            print(f'you withdraw this amount {amount}')
    # Accesser
    def deposite(self, amount): # deposite money
        self.balance+=amount
        # print out a message
        print(f'you withdraw this amount {amount}')
