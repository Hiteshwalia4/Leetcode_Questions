package Placement_Ques;
import java.util.Scanner;
public class D1_String_reverse {

//    ***** Through Stack *****
    static char[] stack=new char[5];
    static int n=stack.length;
    static int top=-1;
    static void push(char el){
        top++;
        stack[top]=el;
    }
    static char pop(){
        char ch=stack[top];
        top--;
        return ch;
    }
    public static void main(String[] args) {
        String rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
            push(str.charAt(i));
        for(int i=top;i>=0;i--){
            char ch=pop();
            rev+=ch;
        }
        System.out.println(rev);


//        ***** Through StringBuilder *****
        StringBuilder sb=new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str=sc.nextLine();
        for (int i = str.length()-1; i >=0 ; i--)
            sb= sb.append(str.charAt(i));
        System.out.println(sb);
    }
}
