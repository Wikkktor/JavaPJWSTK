
public class DifferentNumber {
    public static void main(String[] args) {
        int arr[] = { 2,3,4,3,2,6,3,6,8,2,9 };
        int arr_lenght = arr.length;
        int counter = 0;
        int helper;
        for ( int i = 0; i < arr_lenght; i++) {
            helper = 0;
            for ( int l = 0; l < arr_lenght; l++) {
                if (arr[i] == arr[l]) {
                    helper++;
                }
            }
            if (helper == 1) {
                counter++;
                System.out.print(arr[i]);
            }
        }
        System.out.println("\nThere were " + counter + " different numbers");
    }
}
