import java.util.Scanner;

public class PalindromeEx {
    public static void main(String[] args) {
        System.out.println("Enter the value: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int d;
        int rev=0;
        while(n>0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;

        }
        if(rev==original){
            System.out.println("Given number is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
