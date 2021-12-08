public class InsufficientFundsException extends Exception {

    double needs;

    public InsufficientFundsException(double myAmount){
        needs = myAmount;
    }

    public double  getAmount(){
        return needs;
    }
    
}
