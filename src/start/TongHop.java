/**
 * 
 */
package start;

import common.Util;

/**
 * @author HQTrung
 *
 */
public class TongHop {

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 11, 2018
         * Modifier: HQTrung
         * Modified date: Nov 11, 2018
         * Description: tong hop control flow draw shape
         * Version 1.0
         * @param args
         */
        public static void main(String[] args) {
                int a = Util.enterIntegerNumber();
                int j = a;
                for (int i = 1; i <= a; i++) {
                        for (int x = j; x > 0; x--) {
                                System.out.print("$");
                        }
                        for (int z = 1; z <= i; z++) {
                                System.out.print("*" + "H");
                        }
                        for (int x = j; x > 0; x--) {
                                System.out.print("^");
                        }

                        System.out.println();
                        j--;
                }

                for (int i = a - 1; i != 0; i--) {
                        for (int x = i - 1; x < a; x++) {
                                System.out.print("?");
                        }
                        for (int z = 1; z <= i; z++) {
                                System.out.print("*" + "H");
                        }
                        for (int x = i - 1; x < a; x++) {
                                System.out.print("#");
                        }
                        System.out.println();
                        j--;

                }
        }
}
