package com.codedifferently.drillz;

public class Problem01 {

    /**
     * Given two non-negative int values,
     * return true if they have the same last digit,
     * such as with 27 and 57.
     * Note that the % "mod" operator computes remainders,
     * so 17 % 10 is 7.
     * lastDigit(7, 17) → true
     * lastDigit(6, 17) → false
     * lastDigit(3, 113) → true
     *
     * @param a
     * @param b
     * @return
     */
    public boolean lastDigit(int a, int b) {
     while (a > 0) {
         System.out.println(a % 10);
                  a = a / 10;
     }
     while (b > 0) {
         System.out.println(b % 10);
         b = b / 10;
     }
     int[] num1 = new int[a];
     int[] num2 = new int[b];
        if (num1[0] == num2[1]){
            return true;
        }
        return false;
    }
}


            //while (a > 0) {
   //        System.out.println(a % 10);
   //        a = a / 10;
   //        }
   //        while (b > 0) {
   //        System.out.println(b % 10);
   //        b = b / 10;
   //        }
   //        int[] num1 = new int[a];
   //        int[]num2 = new int[b];
//
   //        if (num1[0] == num2[1]){
   //        return true;
   //        }
   //        return false;
