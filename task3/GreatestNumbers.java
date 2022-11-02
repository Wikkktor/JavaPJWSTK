import java.util.Scanner;


public class GreatestNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int the_biggest;
        int second_biggest;
        int helper;
        the_biggest = scan.nextInt();
        second_biggest = scan.nextInt();
        if (second_biggest > the_biggest) {
            helper = the_biggest;
            the_biggest = second_biggest;
            second_biggest = helper;
        }
        
        helper = scan.nextInt();
        if (helper >= second_biggest) {
            if (helper > the_biggest) {
                second_biggest = the_biggest;
                the_biggest = helper;
            }
            else {
                second_biggest = helper;
            }
        }

        helper = scan.nextInt();
        if (helper >= second_biggest) {
            if (helper > the_biggest) {
                second_biggest = the_biggest;
                the_biggest = helper;
            }
            else {
                second_biggest = helper;
            }
        }
        
        helper = scan.nextInt();
        if (helper >= second_biggest) {
            if (helper > the_biggest) {
                second_biggest = the_biggest;
                the_biggest = helper;
            }
            else {
                second_biggest = helper;
            }
        }
        scan.close();

        System.out.println("The Biggest: " + the_biggest + " Second biggest " + second_biggest);
    }
}