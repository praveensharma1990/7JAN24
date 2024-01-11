package Java_Practice;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
    int array[]=ArrayUtility.Inputarray();
    long sumofarray=sum(array);
    int average=average(array);
        System.out.println("sum of array " +sumofarray);
        System.out.println("average of array " +average);
    }
    public static long sum(int[]a){
        long sum=0;
        int i=0;
        while(i<a.length)
        {
            sum=sum+a[i];
            i++;
        } return sum;
    } public static int average(int[]a) {
        long sum = sum(a);
        int average= (int)sum/a.length;
        return average;

    }
    }



