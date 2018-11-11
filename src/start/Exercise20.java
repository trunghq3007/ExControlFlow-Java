/**
 * 
 */
package start;

import java.util.Scanner;

/**
 * @author HQTrung
 *
 */
public class Exercise20 {

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
                int i, j, n, p, q;
                System.out.print("Input number of rows : ");
                Scanner in = new Scanner(System.in);
                n = in.nextInt();

                for (i = 1; i <= n; i++) {
                        if (i % 2 == 0) {
                                p = 1;
                                q = 0;
                        } else {
                                p = 0;
                                q = 1;
                        }
                        for (j = 1; j <= i; j++)
                                if (j % 2 == 0)
                                        System.out.print(p);
                                else
                                        System.out.print(q);
                        System.out.println("");
                }

        }

}
