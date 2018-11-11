/**
 * 
 */
package start;

import java.util.Scanner;

import common.Util;

/**
 * @author HQTrung
 *Write a program in Java to print such pattern like right angle triangle with number increased by 1.The pattern like :

1
2 3
4 5 6
7 8 9 10 
Test Data
Input number of rows : 4
 */
public class Exercise18 {

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

                int k = 1;
                int n = Util.enterIntegerNumber();

                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++)
                                System.out.print(k++);
                        System.out.println("");
                }

        }

}
