package Java_Practice;
import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter number for Fibonaci series");
        int userInput= input.nextInt();
        System.out.println("Here is your Fibonaci series");
        fibonaci(userInput);
    }
      public static void fibonaci(int num) {
        if(num<0) return;
          System.out.print("0 ");
        if(num==0) return;
          System.out.print("1 ");
        int num1=0,num2=1,num3=0;
        while(num1+num2<=num){
             num3=num1+num2;
            System.out.print(num3 + " ");
            num1=num2;
            num2=num3;
        }

}

}