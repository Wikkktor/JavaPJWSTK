import java.lang.Math;

public class Cards {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            /*
             * Define two integers using only Math.random():
             *   col is a random integer from range [1,  4]
             *   rnk is a random integer from range [2, 14]
             */

            int col = (int) (Math.random() * (5 - 1 ) + 1 );
            int rnk = (int) (Math.random() * (15 - 2 ) + 2 );

            String color;
            switch(col) {
                case 1:
                    color = "Clubs";
                    break;
                case 2:
                    color = "Diamonds";
                    break;
                case 3: 
                    color = "Hearts";
                    break;
                case 4: 
                    color ="Spades";
                    break;

                default:
                    color = "error";
                };

            String rank;
            switch(rnk) {
                case 2:
                    rank = "Double";
                    break;
                case 3:
                    rank =  "Three";
                    break;
                case 4:
                    rank =  "Four";
                    break;
                case 5:
                    rank = "Five";
                    break;
                case 6:
                    rank = "Six";
                    break;
                case 7:
                    rank = "Seven";
                    break;
                case 8:
                    rank = "Eight";
                    break;
                case 9:
                    rank = "Nine";
                    break;
                case 10:
                    rank = "Ten";
                    break;
                case 11:
                    rank =  "Jack";
                    break;
                case 12:
                    rank = "Queen";
                    break;
                case 13:
                    rank = "King";
                    break;
                case 14:
                    rank = "Ace";
                    break;

                default:
                    rank = "error";
            };

            System.out.println(rank + " of " + color);
        }
    }
}