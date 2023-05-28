package Placement_Ques;

import java.util.Scanner;

public class D3_ReverseNo {
    public static void main(String[] args) {
        int rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n =sc.nextInt();
        while(n>0){
            int i=n%10;
            n=n/10;
            rev=rev*10 + i;
        }
        System.out.println("Reverse of number is: "+rev);
    }
}
