import java.util.*;
import java.io.Console;
public class PackagesEx {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Enter your Name: "+name);


        Console c=System.console();
        System.out.println("Enter your age: ");
        int age=Integer.parseInt(c.readLine());
        System.out.println("Enter your age: "+age);

        java.util.Date d=new java.util.Date();
        System.out.println("Date: "+d);

    
}
}
