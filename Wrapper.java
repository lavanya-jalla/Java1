public class Wrapper{
    public static void main(String[] args) {
        
        int c=Integer.parseInt(args[0]);
        System.out.println(c);

        double d=Double.parseDouble(args[1]);
        System.out.println(d);

        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.BYTES: " + Integer.BYTES);
        System.out.println("Integer.SIZE: " + Integer.SIZE);


        System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Character.BYTES: " + Character.BYTES);
        System.out.println("Character.SIZE: " + Character.SIZE);

        Integer e=Integer.valueOf(10);
        Integer f=Integer.valueOf("20");
        System.out.println("Sum: " + (e+f));
    }
}        