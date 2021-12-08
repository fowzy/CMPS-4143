public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount obj1 = new CheckingAccount(4005);
        System.out.println("Depositing...");
        obj1.deposit(1000000);
        try{
            System.out.println("Withdrawing $100...");
            obj1.withdraw(100);
            System.out.println("Withdrawing $1000000...");
            obj1.withdraw(1000000);
        }
        catch(InsufficientFundsException e){
            System.out.println("Sorry! You are broke, try less than"+e.getAmount());
            e.printStackTrace();
        }
    }
}
