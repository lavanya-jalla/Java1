import java.util.*;

public class MultiDemo {
    public static void main(String[] args) throws Exception {
        List<Integer> al1=new ArrayList<Integer>();
        List<Integer> al2=new ArrayList<Integer>();

        Numbers n=new Numbers();
        PrimeThread t1=new PrimeThread(n);
        t1.start();
        t1.join();

        FibThread t2=new FibThread(n);
        t2.start();
        t2.join();
        al1=t1.getList();
        al2=t2.getList();

        al1.retainAll(al2);
        System.out.println("\nCommon in both primes and fib series: ");
        System.err.println(al1);
    }
    
}
class Numbers{
    public List<Integer> primes(){
        int primesCount=0;
        List<Integer> l=new ArrayList<Integer>();
        for(int i=2;i<1000;i++){
            int count=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    if(count>1)
                        break;
                }
            }
            if(count==1){
                System.out.print(i+"\t");
                primesCount++;
                l.add(i);
            }
        }
        System.out.println("\n No of Primes: "+primesCount);
        return l;

    }
    public List<Integer> fibs(){
        int a=0,b=1,c;
        List<Integer> l =new ArrayList<Integer>();
        l.add(0);
        l.add(1);
        System.out.print(a+"\t"+b);
        for(int i=1;i<=15;i++){
            c=a+b;
            System.out.print("\t"+c);
            l.add(c);
            a=b;
            b=c;
        }
        return l;


    }
}
class PrimeThread extends Thread{
    Numbers n;
    List<Integer> l;
    public PrimeThread(Numbers n){
        this.n=n;

    }
    public void run(){
        l=n.primes();
    }
    List<Integer>getList(){
        return l;
    }
}
class FibThread extends Thread{
    Numbers n;
    List<Integer> l;
    public FibThread(Numbers n){
        this.n=n;
    }
    public void run(){
        l=n.fibs();
    }
    List<Integer> getList(){
        return l;
    }
}
