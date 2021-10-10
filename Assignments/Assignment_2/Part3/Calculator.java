import java.util.*;
import java.io.*;
import java.io.Serializable;

public class Calculator{
    // public int addition(int _a, int _b){
    //     return (_a+_b);
    // }
    // public int subtraction(int _a, int _b){     
    //     return (_a-_b);
    // }
    // public int multiplication(int _a, int _b){
    //     return (_a*_b);
    // }
    // int division(int _a, int _b){
    //     return (_a/_b);
    // }
    // public int modulo(int _a, int _b){
    //     return (_a%_b);
    // }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
        try {
            System.out.println("Enter the first item: ");
            int n1 = input.nextInt();
            System.out.println("Enter the second item: ");
            int n2 = input.nextInt();
            int sum = n1/n2;
            System.out.println(sum);    
        }
        catch (RuntimeError r) {
            System.out.println("You cann't do that.");
        }
    }
}
}

