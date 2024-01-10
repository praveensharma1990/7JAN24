package Java_Practice;
import java.util.Scanner;
public class Number_check {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter your number");
        int number=input.nextInt();
        if(number<0){
            System.out.println("Number is Negative "+ number);
        } else if (number>0) {
            System.out.println("Number is Positive "+number);
        }
        else System.out.println("Number is Zero "+number);
    }
}
