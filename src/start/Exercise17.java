/**
 * 
 */
package start;

import java.util.Scanner;

import common.Util;

/**
 * @author HQTrung
 * Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows : 
1
22
333
4444

 */
public class Exercise17 {
        public static void main(String[] args) {
               
               
                int n = Util.enterIntegerNumber();

                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++)
                                System.out.print(i);
                        System.out.println("");
                }
        }
}
