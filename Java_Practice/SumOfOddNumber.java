package Java_Practice;
import java.util.Scanner;
public class SumOfOddNumber {
    public static void main(String[] args) {
        System.out.print("Please Enter the Number");
        Scanner user_input = new Scanner(System.in);
        int num = user_input.nextByte();
        int sum=sumOfodd(num);
        System.out.println("sum of odd number till " +num +" is "+ sum);
    }

    public static int sumOfodd(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i+=2) {
                sum+=i;
            }
         return sum;

    }
}
