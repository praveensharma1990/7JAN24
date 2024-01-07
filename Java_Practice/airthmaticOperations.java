package Java_Practice;
import java.util.Scanner;
public class airthmaticOperations {
    public static void main(String[] args) {
        System.out.println("Today we will do +,-,*,/,%");
        Scanner input= new Scanner(System.in);
        System.out.print("Plz enter 1st number ");
        int a=input.nextInt();
        System.out.print("Plz enter 2nd number ");
        int b=input.nextInt();
  int sum= a+b;
  int multi=a*b;
  double div=a/b;
  int sub=a-b;
        System.out.println(" sum is "+sum +" \n multiplication is "+multi +" \n Division is "+div+ " \n substraction is "+sub);

    }
}
