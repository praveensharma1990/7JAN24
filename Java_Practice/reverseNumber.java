package Java_Practice;
import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number ");
        int userInput= input.nextInt();
        boolean ispalendrom=ispalendrome(userInput);

        if(ispalendrom)
        {
            System.out.println("palindrome");
        }
        else System.out.println("not palindrome");
    }
    public static boolean ispalendrome(int num)
    { int reverse=reverse(num);
        return reverse==num;


    }
    public static int reverse(int num1)
    { int reminder=0,reverse=0;
        while(num1>0){
        reminder=num1%10;
        reverse=(reverse*10)+reminder;
        num1=num1/10;
            System.out.println("reversed number is "+reverse );
    } return reverse;
    }
}
