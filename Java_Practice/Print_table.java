package Java_Practice;
import java.util.Scanner;
public class Print_table {

    public static void main(String[] args) {
        printTable();
    }
    public static void printTable()
    {
        System.out.println("Please Enter the Number you want the Table for");
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        for(int i=1;i<=10;i++)
        {
            int table_final=number*i;
            System.out.println("Table of "+number +" "+number+"X"+i+"= " +table_final);
        }

    }
}


