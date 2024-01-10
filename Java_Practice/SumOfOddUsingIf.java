package Java_Practice;
import java.util.Scanner;
public class SumOfOddUsingIf {

            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt();

            // Calculate and display the sum of odd numbers
            int sum = calculateSumOfOddNumbers(userInput);
            System.out.println("Sum of odd numbers up to " + userInput + " is: " + sum);
        }

        // Function to calculate the sum of odd numbers
        private static int calculateSumOfOddNumbers(int n) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                // Check if the number is odd using the if statement
                if (i % 2 != 0) {
                    sum += i; // Add the odd number to the sum
                }
            }

            return sum;
        }


}
