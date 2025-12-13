import java.util.ArrayList;
import java.util.Scanner;

public class LastElePost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        ArrayList<Integer> al=new ArrayList();
       
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
           int p=al.getLast();
           al.removeLast();
           al.add(0,p);
        }
        System.out.println(al);
        
    }
    
}
