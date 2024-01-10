package Java_Practice;
import java.util.Scanner;
import java.util.Scanner;
public class Leap_year_program {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter the Year");
        int Year= input.nextInt();
        if (Year % 400 == 0 ||(Year%4==0  ) && Year%100!=0) {

            System.out.println(Year +" is Leap Year");

        }else System.out.println(Year +" is not a Leap year");
    }
}
