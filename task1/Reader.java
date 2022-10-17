import java.util.Scanner; 


public class Reader { 
    public static void main(String[] args) {
        int input = 0; // Input for checking prompted int
        int int_counter = 0; // Prompted intiger for the longest sequence
        int previous_counter = 0; // Storing the longest sequence
        int counter = 0; // Checking sequence for every new prompted int
        int previous = 0; // Previous prompted int

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list of numbers (press 0 to stop)");
        while ((input = scan.nextInt()) != 0) {
            if (input == previous) {

                counter++;
                if (counter > previous_counter){
                    int_counter = input;
                }

            } else {

                previous = input;
                if (counter > previous_counter) {
                    previous_counter = counter;
                }
                counter = 1;
            }
        }
        scan.close();
        
        if (previous_counter > counter){
            counter = previous_counter;
        }
        
        System.out.println("Longest squence " + counter + " times " + int_counter);
    }   
    
}
