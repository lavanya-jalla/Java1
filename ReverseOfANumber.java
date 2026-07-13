import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        int d;
        int rev=0;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int original=n;
         while(n>0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("The reverse of a number is: "+rev);


    }
    
}
