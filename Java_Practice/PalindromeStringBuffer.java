package Java_Practice;
import java.util.Scanner;
 class PalindromeStringBuffer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the string to check: " );
        String name=input.nextLine();
        boolean result= ispalindrome(name);
        if(result) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    private static boolean ispalindrome (String name){
        StringBuffer sc=new StringBuffer(name);
        String orginalStirng=name;
        String ReverscString=sc.reverse ().toString();
        return orginalStirng.equalsIgnoreCase(ReverscString);
    }

}
