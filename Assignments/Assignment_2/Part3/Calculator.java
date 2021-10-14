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

    static int division(int _a, int _b) throws RuntimeError {
        if (_b == 0) {
            throw new RuntimeError();
        }
        return (_a / _b);
    }

    static int modulo(int _a, int _b) {
        return (_a % _b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the calculation: ");
        int equal = 0;
        try {
            // Processing the data that user inputs through the Scanner
            // Taking an input from user and removing spaces using regex

            String in = (input.nextLine()).replaceAll("\\s", "");
            // Filter the numbers out the string using regex and removing math symbols like:
            // +*-/%= and other symbols and letters () a-z and A-Z
            String[] numbers = in.split("\\+|\\-|\\*|\\%|\\=|\\(|\\)|\\/|[A-Z]|[a-z]");
            // Now we are filtering our operations so we could see what kind of math
            // operations are we doing and it will in order
            String[] operators = in.split("\\d|[A-Z]|[a-z]|\\^");
            
            // String[] brackets = in.split("\\d|\\+|\\-|\\*|\\%|\\=|\\/|[A-Z]|[a-z]");
            // filtering the string again to get the variable so we could use it later in
            // our SyntaxError Exceptions
            String[] variables = in.split("\\d|\\+|\\-|\\*|\\%|\\=|\\(|\\)|\\/");
            // Now this if statement telling the program: if there are more than one
            // variable then throw an error and tell the user that they are more than one
            // variables, according to the instructions.
            if (variables.length > 1) {
                throw new SyntaxError("Syntax error: more than one variable");
            }
            // if statement to do the following: if you can't find an equal sign means there
            // 
            int counterBRACKET = 0;
            for (String ops: operators) {
                System.out.println(ops);
                if(ops.contains("=")) {
                    equal++;
                }
                if(ops.contains("(")){
                    counterBRACKET++;
                }
                if(ops.contains(")")){
                    counterBRACKET--;
                }
            }
            if(counterBRACKET != 0){
                throw new SyntaxError("Syntax error: ‘)’ expected");
            }

            // if(!bracketNOTFOUND){
            //     throw new SyntaxError("Syntax error: ‘)’ expected");
            // }
            if (equal > 1) {
                throw new SyntaxError("Syntax error: unexpected ‘=’");
            }
            if (equal == 0) {
                throw new SyntaxError("Syntax error: ‘=’ expected");
            }

            // if statement do the following: if you can't find all () prenthesis then throw
            // an error

            // Last if statement to see if we're deviding by zero if YES then through an
            // eerror

            // for (String num : numbers)
            //     System.out.print(num + " ");
            // System.out.println("\n");
            // for (String ops : operators)
            //     System.out.print(ops + " ");
            // System.out.println("\n");
            // for (String var : variables)
            //     System.out.print(var + " ");
            // System.out.println("\n");

        } catch (SyntaxError e) {
            System.out.println(e.getMessage());
        }

        // String add = "+";
        // String min = "-";
        // String mult = "*";
        // String div = "/";
        // String mod = "%";
        // for (int i = 0; i<numbers.length;i++) {
        // for(String ops: operators){
        // // for (int x=0; x<operators.length;x++) {
        // if (ops.equals("+")) {
        // System.out.println(addition(Integer.parseInt(numbers[i]),
        // Integer.parseInt(numbers[i + 1])));
        // } else if (ops.equals("-")) {
        // System.out.println(subtraction(Integer.parseInt(numbers[i]),
        // Integer.parseInt(numbers[i + 1])));
        // } else if (ops.equals("/")) {
        // System.out.println(division(Integer.parseInt(numbers[i]),
        // Integer.parseInt(numbers[i + 1])));
        // } else if (ops.equals("*")) {
        // System.out.println(multiplication(Integer.parseInt(numbers[i]),
        // Integer.parseInt(numbers[i + 1])));
        // } else if (ops.equals("%")) {
        // System.out.println(modulo(Integer.parseInt(numbers[i]),
        // Integer.parseInt(numbers[i + 1])));
        // }
        // // System.out.print(operators[x]);
        // }
        // // System.out.println("\n\n");
        // // System.out.print(numbers[i]);
        // }
        // for(String num: numbers)
        // System.out.print(num+" ");
        // System.out.println("\n");
        // for(String ops: operators)
        // System.out.print(ops+" ");
        // System.out.println("\n");
        // for(String var: variables)
        // System.out.print(var+" ");
        // System.out.println("\n");
    }
}
