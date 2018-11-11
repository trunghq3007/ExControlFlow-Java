/**
 * 
 */
package common;

import java.util.Scanner;

/**
 * @author HQTrung
 *
 */
public class Util {

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 11, 2018
         * Modifier: HQTrung
         * Modified date: Nov 11, 2018
         * Description: nhập số nguyên dương
         * Version 1.0
         * @return
         */
        public static int enterIntegerNumber() {
                // i/o instance
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number: number = ");
                int number = scanner.nextInt();
                while (number < 0 || number > 9) {
                        System.out.println("Enter number: number = ");
                        number = scanner.nextInt();
                }
                return number;

        }
}
