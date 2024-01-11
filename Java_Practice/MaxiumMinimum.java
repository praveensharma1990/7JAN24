package Java_Practice;
public class MaxiumMinimum {
    public static void main(String[] args) {
        int arr[]=ArrayUtility.Inputarray();
        if(arr.length==0){
            System.out.println("Your array is empity");
        }
        int maximum=max(arr);
        System.out.println("the maximum value in the array is "+maximum);
        int minimum=min(arr);
        System.out.println("the Minimum value in the array is "+minimum);

    }  public static int max(int arr[]){
        int i=0,max=Integer.MIN_VALUE;
        while(i<arr.length){
            if (arr[i]>max) {
                max=arr[i];
            } i++;
        }
        return max;

    } public static int min(int arr[]){
        int i=0,min=Integer.MAX_VALUE;
        while(i<arr.length){
            if (arr[i]<min) {
                min=arr[i];
            } i++;
        }
        return min;

    }
    }
