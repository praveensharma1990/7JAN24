import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class numswap {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of a & b");
     int a=sc.nextInt();
     int b=sc.nextInt();
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a & b after swaping ");
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
    }

}
