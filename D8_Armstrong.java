package DSA.MathProb;
import java.util.Scanner;

public class Armstrong {
    static boolean armstrong(int n){
        int sum = 0;
        int orgno = n;
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp = temp/10;
            count++;
        }
        while (n != 0) {
            int ld = n % 10;
            sum = sum + (int) Math.pow(ld,count);
            n = n/10;
        }
        return (orgno==sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        System.out.println(armstrong(n));
    }
}
