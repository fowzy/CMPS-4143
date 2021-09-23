import javax.naming.InsufficientResourcesException;

public class CheckingAccount {
    double balance;
    int accNumber;

    public CheckingAccount(int myAccNumber){
        accNumber = myAccNumber;
    }

    public double getBalance(){
        return balance;
    }

    void setBalance(int myBalance){
        balance = myBalance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount <= balance){
            balance-=amount;
        }
        else{
            throw new InsufficientFundsException(amount);
                
        }
    }
    public void deposit(double amount){
        balance+=amount;
    }
}
