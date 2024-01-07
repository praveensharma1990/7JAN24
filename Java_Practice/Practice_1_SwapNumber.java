package Java_Practice;
import java.util.Scanner;
class SwapNumber {

    static int firstNumber;
    static int secondNumber;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter the First Number -" );
        firstNumber=input.nextInt();
        System.out.print("Please Enter the Second Number -");
        secondNumber=input.nextInt();
        int temp;
        System.out.println("your First Number is "+ firstNumber );
        System.out.println("your Second Number is "+ secondNumber );
        temp=firstNumber;
        firstNumber=secondNumber;
        secondNumber=temp;
        System.out.println("Number swamped ");
        System.out.println("your First Number is "+ firstNumber );
        System.out.println("your Second Number is "+ secondNumber );
      input.close();
    }

}
