/**
 * 
 */
package start;

import java.util.Scanner;

import common.Util;

/**
 * @author HQTrung
 * Description: Write a program in Java to display the cube of the number upto given an integer
 */
public class Ex13Cube {

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
                // call enterIntegerNumber method and return value as number
                int number = 0;
                boolean isContinue = false;

                // display manu
                while (!isContinue) {
                        number = Util.enterIntegerNumber();
                        for (int i = 0; i < number; i++) {
                                System.out.println("cube of " + i + ":" + i * i * i);

                        }
                        System.out.println("Do you want to continue? (y/n)");
                        
                        Scanner scanner = new Scanner(System.in);
                        String stringYN = scanner.nextLine();
                        
                        if ("n".equals(stringYN.toLowerCase())) {
                                isContinue = true;
                                System.exit(0);
                        } 

                }

        }

}
