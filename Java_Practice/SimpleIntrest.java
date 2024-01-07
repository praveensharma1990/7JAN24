package Java_Practice;
import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        System.out.println("welcome to the simple interest calc");
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter your principle amount Rs.");
        int amount= input.nextInt();
        System.out.print("Now tell me your rate of interest ");
        float rate_of_interest= input.nextFloat();
        System.out.print("Please enter number of years you borrowed money");
        float years= input.nextFloat();
        float interest;
        interest=(amount*rate_of_interest*years)/100;
        System.out.println("\n\n your simple interest is INR "+interest);

    }


}
