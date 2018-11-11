/**
 * 
 */
package start;

import java.util.Scanner;

/**
 * @author HQTrung
 *des: Write a program in Java to display the pattern like right angle triangle with a number.
 */
public class Exercise16 {

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
                int i, j, n;
                System.out.print("Input number of rows : ");
                Scanner in = new Scanner(System.in);
                n = in.nextInt();

                for (i = 1; i <= n; i++) {
                        for (j = 1; j <= i; j++)
                                System.out.print(j);

                        System.out.println("");
                }

        }

}
