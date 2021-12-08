/**
 * A RuntimeError exception should be thrown when a divide by zero occurs
 */
public class RuntimeError extends Exception{
    public RuntimeError(){
        super("Runtime error: Divide by zero occurred.");
    }
    public RuntimeError(String message){
        super(message);
    }
}
