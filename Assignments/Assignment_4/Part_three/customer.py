# Customer class
class Customer:
    first_name=None     # First Name
    last_name=None      # Last Name
    age=None            # Age
    accountList=[]
    # Constructor
    def __init__(self,fname,lname, ag,account):
        self.first_name = fname
        self.last_name = lname
        self.age = ag
        self.accountList.append(account)
        print('Profile for the customer has been created.')
    # Getter get the first name, last, name and age
    def getCustomerDetails(self):
        print(f'First Name {self.first_name}')
        print(f'Last Name {self.last_name}')
        print(f'Age : {self.age}')
        print(f'Number of Accounts: {len(self.accountList)}')
    # Accessor to set info like first name, last name, and age
    def setInfo(self, fname, lname,ag):
        fname = self.first_name
        lname = self.last_name
        ag = self.age
    # Getter to add a account
    def addAccount(self, account):
        self.accountList.append(account)
    def getAccounts(self):
        for i in self.accountList:
            print(i.getInfo())