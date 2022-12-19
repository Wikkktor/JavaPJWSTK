import java.util.Arrays;

public class FuncStat {
    public static void main(String[] args) {
        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fiboI(45));
        System.out.println(FuncStat.factR(12));
        System.out.println(FuncStat.factI(12));
        System.out.println(FuncStat.gcdR(12125, 40643));
        System.out.println(FuncStat.gcdI(12125, 40643));
        int[] a = {3, 8, 2, 9, 7, 4};
        System.out.println("Max: " + FuncStat.maxElem(a, 0));
        System.out.println("Num even: " + FuncStat.numEven(a, 0)); 
        System.out.println("Before: " + Arrays.toString(a));
        FuncStat.reverse(a,0);
        System.out.println("After : " + Arrays.toString(a));
        System.out.println("Is 'radar' a palindrom? " +
                            FuncStat.isPalindrom("radar"));
        System.out.println("Is 'java' a palindrom? " +
                            FuncStat.isPalindrom("abba"));
        System.out.println("Is 'racecar' a palindrom? " +
                            FuncStat.isPalindrom("rover"));
    }
    
    public static int fiboR(int n) {
        if (n <= 1) {
            return n;
        } else {
        return fiboR(n-1) + fiboR(n-2);
        }
    }
    
    public static int fiboI(int n) {
        int int_first = 0, int_second = 1;
        for (int i = n; i >= 1; --i) {
            int next = int_first + int_second;
            int_first = int_second;
            int_second = next;
        }
       return int_first;
    }
    
    public static int factR(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factR(n-1);
        }
    }
    
    public static int factI(int n) {
        int fact = 1;
        for (int i = 1; i <= n; ++i) {
            fact *= i;
        }
       return fact;
    }
    
    public static int gcdR(int a, int b) {
        if (a == b) return a;
        else if (a > b) {
            a -= b;
            return gcdR(a, b);
        }
        else {
            b -= a;
            return gcdR(a, b);
        }
    }
    
    public static int gcdI(int a, int b) {
        int dividor = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a%i == 0 && b%i == 0) dividor = i;
        }
        return dividor;
    }
    
    public static int maxElem(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        else {
            int ref = maxElem(arr, i + 1);
            if (arr[i] > ref) return arr[i];
            else return ref;
        }
    }
    
    public static int numEven(int[] arr, int i) {
       if (i == arr.length - 1) {
           if (arr[i] % 2 == 0) return 1;
           else return 0;
       }
       
       if (arr[i] % 2 == 0) return numEven(arr, i + 1) + 1;
       else return numEven(arr, i + 1);
    }
    
    public static void reverse(int[] arr, int i) {
        if (i < arr.length / 2) {
            int ref = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = ref;
            
            reverse(arr, i + 1);
        }
    }
    
    public static boolean isPalindrom(String s) {
        if (s.length() <= 1) return true;
        else return
                s.charAt(0) == s.charAt(s.length() - 1) &&
                isPalindrom(s.substring(1, s.length()-1));
    }
}
