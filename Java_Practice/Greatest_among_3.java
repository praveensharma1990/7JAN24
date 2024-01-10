package Java_Practice;
import java.util.Scanner;
public class Greatest_among_3 {
    public static void main(String[] args) {
        System.out.println("Please Enter 3 Numbers to check which one is greatest");

        Scanner input = new Scanner(System.in);
        int user_input1 = input.nextInt();
        int user_input2 = input.nextInt();
        int user_input3 = input.nextInt();
    if (user_input1>user_input2 && user_input1 > user_input3)
    {
        System.out.println(user_input1+ " is the Greatest");

    } else if (user_input2>user_input1 && user_input2 > user_input3) {
        System.out.println( user_input2 +" is the Greatest");

    } else if (user_input1==user_input2 && user_input1==user_input3 && user_input2==user_input3) {
        System.out.println("Your Enter all 3 Number same");
    }else System.out.println(user_input3+ " is the Greatest");
    }
}
