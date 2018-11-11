/**
 * 
 */
package start;

import java.util.Scanner;

import common.Util;

/**
 * @author HQTrung
 *
 */
public class Exercise25 {

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

                int n = Util.enterIntegerNumber();

                int count = 1;
                int no_of_spaces = 1;
                int start = 0;

                for (int i = 1; i < (n * 2); i++) {
                        for (int spc = n - no_of_spaces; spc > 0; spc--) {
                                System.out.print("*");
                        }

                        if (i < n) {
                                start = i; // for number
                                no_of_spaces++; // for spaces
                        } else {
                                start = n * 2 - i; // for number
                                no_of_spaces--; // for space
                        }

                        for (int j = 0; j < count; j++) {
                                System.out.print(start);
                                if (j < count / 2) {
                                        start--;
                                } else {
                                        start++;
                                }
                        }

                        if (i < n) {
                                count = count + 2;
                        } else {
                                count = count - 2;
                        }

                        System.out.println();
                }

        }

}
