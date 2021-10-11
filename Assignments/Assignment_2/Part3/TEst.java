import java.util.*;

public class TEst{
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
        // Split string and store it into different var.
        String[] operators = in.split("");
        String[] numbers = in.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        //     // System.out.print(splitString.length);
        // }
        for(int x=0;x<numbers.length;x++){
            System.out.println(numbers[x]);
        }

        // if(in == 0){
        // throw new RuntimeError();
        // }
        // System.out.println(division(first_input,second_input));
        // catch (RuntimeError e) {
        // System.out.println(e.getMessage());
        // }
        // catch (SyntaxErrorException e){

        // }

    }
}
