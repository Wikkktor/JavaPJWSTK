import java.util.*;

public class Accounts {
    public static void main (String[] args) {
        int[][][] opers = {
            { {100, -50, 25}, {150,-300}, {300,-90,100}, {300,20,-100}, {300,20,-100} },
            { {90, -60, 250}, {300,20,-100}, {150,-300}, {150,-300} },
            { {20, 50}, {300}, {100,-200} }
            };
            int sum = 0;
            for (int i = 0; i < opers.length; i++ ) {
                for (int l = 0; l < opers[i].length; l++ ) {
                    for (int m = 0; m < opers[i][l].length; m++) {
                        sum += opers[i][l][m];
                    }
                }
                System.out.println(sum);
                sum = 0;
            }
    }
}
