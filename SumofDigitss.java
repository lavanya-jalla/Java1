import java.util.Scanner;

public class SumofDigitss {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        int n;
        int d;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        
        System.out.println("The Sum of the Digit is: "+sum);
        sc.close();

    }
    
}
