import java.util.Scanner; 


public class NumberSort { 
    public static void main(String[] args) {
        Scanner ints = new Scanner(System.in);
        System.out.println("Enter 3 integers");
        int a = ints.nextInt();
        int b = ints.nextInt();
        int c = ints.nextInt();
        ints.close();
        int helper;
        System.out.println(a + " " + b + " " + c);
        if (a > b) {
            helper = a;
            a = b;
            b = helper;
        }
        if (b > c) {
            helper = b;
            b = c;
            c = helper;
        }
        if (a > b) {
            helper = a;
            a = b;
            b = helper;
        }
        System.out.println("a " + a + " b " + b + " c " + c);
    }   
    
}