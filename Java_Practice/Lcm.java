package Java_Practice;
import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("welcome to LCM Program");
        System.out.print("Please Enter first Num: ");
        int first_no= input.nextInt();
        System.out.print("Please Enter second Num: ");
        int second_no= input.nextInt();
      int lcm=lcm(first_no,second_no);
        System.out.println("LCM of "+first_no +" and "+second_no+" is " +lcm);
    }
    public static int lcm(int num1,int num2)
    { int i=1;
        while(true)
        { int factor= num1*i;
            if(factor%num2==0)
                return factor;
          i++;
        }

    }
}
