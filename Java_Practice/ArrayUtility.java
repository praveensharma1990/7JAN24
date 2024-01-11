package Java_Practice;
import java.util.Scanner;
public class ArrayUtility {
    public static int[] Inputarray() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array");
        int num = input.nextInt();
        int arr[] = new int[num];
        int i = 0;

        while (i < num) {
            System.out.println("please enter the number for " + (i+1) +" Element ");
            arr[i] = input.nextInt();
            i++;


        } return arr;
    }
}
