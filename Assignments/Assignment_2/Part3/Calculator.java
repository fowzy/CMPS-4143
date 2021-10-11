import java.util.*;

public class Calculator {
    static int addition(int _a, int _b) {
        return (_a + _b);
    }
    static int subtraction(int _a, int _b) {
        return (_a - _b);
    }
    static int multiplication(int _a, int _b) {
        return (_a * _b);
    }
    static int division(int _a, int _b) {
        return (_a / _b);
    }
    static int modulo(int _a, int _b) {
        return (_a % _b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the calculation: ");
        // Taking an input from user and removing spaces
        String in = (input.nextLine()).replaceAll("\\s", "");
        // Filter the string from operators 
        String[] numbers = in.split("\\+|\\-|\\*|\\%|\\=|\\(|\\)|\\/");
        String[] operators = in.split("\\d");
        for(int i=0;i< numbers.length;i++){
            // System.out.print(numbers[i]);
        }
        // System.out.println("\n\n\n");
        for(int i=0;i<operators.length;i++){
            // System.out.print(operators[i]);
        }
        

        
    }
}
