import java.util.*;
public class ArrayListDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList(5);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            al.add(sc.nextInt());
        }
        for(int i=0;i<al.size();i++){
            for(int j=i+1;j<al.size();j++){
                if(al.get(i).equals(al.get(j))){
                    al.remove(j);
                    j--;

                }
                
            }
        }
        System.out.println(al);
    }
    
}
