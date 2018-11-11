/**
 * 
 */
package start;

import java.util.Scanner;

/**
 * @author HQTrung
 *
 */
public class Triangle {

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
                for (int i = n; i >0 ; i--) {
                        for (int x = s; x != 0; x--) {
                                System.out.print("*");
                        }
                        
                        System.out.println();
                        s--;
                }

        }

}
