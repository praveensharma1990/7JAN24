package Java_Practice;
import java.util.Scanner;
public class arrayoccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the array occurance program\n");
        int[] array=ArrayUtility.Inputarray();
        System.out.println("Please Enter the number to find");
        int num= input.nextInt();
        int ocr=arrayOccurance(array,num);
        System.out.println("your number found "+ocr +" times in the array");
    }
    public static int arrayOccurance(int []array,int num)
    { int occurance=0, i=0;
        while(i<array.length) {
            if (array[i]==num){
            occurance++;
            }
         i++;}
        return occurance;
    }
}
