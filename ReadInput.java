import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) throws IOException{
        //command line input
        // String name=args[0];
        // int age=Integer.parseInt(args[1]);
        // System.out.println(name+" "+age);


        //Reading input using scanner class
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the country");
        // String country=sc.next();
        // System.out.println("Enter the code");
        // int code=sc.nextInt();
        // System.out.println("The county code is: "+code+"The country is: "+country);
        // sc.close();

        //TReading input using buffer reader throws IO exception
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter your City");
        // String city=br.readLine();
        // System.out.println("Enter Code");
        // int code=Integer.parseInt(br.readLine());
        // System.out.println(city + " " +code);


        Console c=System.console();
        System.out.println("Enter your Fav Lang: ");
        String lang=c.readLine();
        System.out.println("Enter your CGPA: ");
        double cgpa=Double.parseDouble(c.readLine());
        System.out.println("Your Fav Lang: " +lang+" CGPA: "+cgpa);

    }

    }
    

