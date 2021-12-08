# Checking account (child class)
from account import Account
class Checking(Account): # This class inher. from Account class
    accountType=None
    def __init__(self,num,bal):
        super().__init__(num,bal)
        self.accountType='Checking Account'
        print('Type: Checking account.')
    # Getter
    def getInfo(self): # Method overriding (Polymorphism: Runtime)
        print(f'Account Type is : {self.accountType}')
        print(f'Account Number is {self.accountNumber}')
        print(f'Balance is ${self.balance}')