package Java_Practice;
import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        System.out.println("Please Enter the String to Reverse ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        String reverse = reverseString(userInput);
        System.out.println("Reverse String is: " + reverse);
    }

    private static String reverseString(String input) {
     StringBuffer sc = new StringBuffer(input);
     String rverse = sc.reverse().toString();
     return rverse;
    }

}