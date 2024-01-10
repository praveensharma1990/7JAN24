package Java_Practice;
import java.util.Scanner;
public class FactorailFunction {


    public static void main(String[] args) {
        System.out.print("Please enter the number for Factorial :");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
       long fact= factorial(userInput);
        System.out.println("Factorial of " + userInput + " " + fact);
    }

    public static long factorial(int a) {
        long fact = 1;
        for (int i = 2; i <= a; i++) {
            fact = fact * i;
        }

        return fact;
    }
}