/**
 * 
 */
package start;

import java.util.Scanner;

/**
 * @author HQTrung
 * Write a program in Java to print such pattern like a pyramid with a number which will repeat the number in the same row.

       1
      2 2
     3 3 3
    4 4 4 4  
 */
public class Exercise19 {

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 11, 2018
         * Modifier: HQTrung
         * Modified date: Nov 11, 2018
         * Description: ....
         * Version 1.0
         * @param args
         */
        public static void main(String[] args) {
                int n, s;
                System.out.print("Input number of rows : ");
                Scanner in = new Scanner(System.in);
                n = in.nextInt();

                s = n;
                for (int i = 1; i <= n; i++) {
                        for (int x = s; x != 0; x--) {
                                System.out.print("*");
                        }
                        for (int j = 1; j <= i; j++) {
                                System.out.print(i + "@");
                        }
                        System.out.println();
                        s--;
                }

        }

}
