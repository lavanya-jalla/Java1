import java.util.Scanner;

public class AmstrongEx {
    
    public static void main(String[] args) {
      
        
        System.out.println("Enter a three digit number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int d;
        int sum=0;
        while(n>0){
            d=n%10;
            sum=sum+d*d*d;
            n=n/10;

        }
        if(sum==original){
            System.out.println("This is an Amstrong Number");
        }
        else{
            System.out.println("Not an amstrong");
        }


    }
    
}
