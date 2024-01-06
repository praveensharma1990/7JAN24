package Java_Practice;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        System.out.println("please enter the row of array");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("please enter the column of array");
        int column=sc.nextInt();
        int array_1[][] = new int[row][column];
        System.out.println("please enter the array element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array_1[i][j] = sc.nextInt();
            }
        }
        System.out.println("You entered the array elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array_1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("do you want to find any value from array yes/No");
        String user_input=sc.next();
        if(user_input.equals("yes") || user_input.equals("YES"))
        {
            System.out.println("which number do you want to find out");
            int find_num=sc.nextInt();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if(array_1[i][j]==find_num)
                    {
                        System.out.println("your num was present at the index "+i+ "," +j);
                    }
                }
                }

            }
    }
}