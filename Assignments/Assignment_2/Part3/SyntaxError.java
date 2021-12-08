/** 
 * A SyntaxError exception should be thrown when an illegal character is found,
 * a closing ) is not found, or a = is not used twice in an expression or an
 * unwanted alphanumeric character inside the equation.
*/

public class SyntaxError extends Exception{
    // public SyntaxError(){ // Constructor
    //     super("Syntax error: Dafualt message from the constructor.");
    // }
    public SyntaxError(String message){ // Constructor 
        super(message);
    }
}
