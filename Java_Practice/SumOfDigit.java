package Java_Practice;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        System.out.print("please enter the number ");
        Scanner input = new Scanner(System.in);
        int inputFromUser = input.nextInt();
        int sum = sumofDigit(inputFromUser);
        System.out.println("sum of digit is " + sum);
    }

    public static int sumofDigit(int user_input) {
        int i = 1;
        int sum = 0;
        while (user_input > 0) {
            sum = sum + (user_input % 10);
            user_input = user_input / 10;
        }
        return sum;


    }
}