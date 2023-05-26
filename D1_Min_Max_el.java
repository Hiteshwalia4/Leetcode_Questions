package Placement_Ques;
import java.util.Arrays;
import java.util.Scanner;
public class D1_Min_Max_el {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i <n ; i++)
            arr[i]=sc.nextInt();
        System.out.println("Array is: " + Arrays.toString(arr));
        int max=arr[0],min=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max)
                max=arr[i];
            else if (arr[i]<min)
                min=arr[i];
        }
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
    }
}
