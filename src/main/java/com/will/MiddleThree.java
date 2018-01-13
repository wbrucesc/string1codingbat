package com.will;

/*Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
 The string length will be at least 3.

        middleThree("Candy") → "and"
        middleThree("and") → "and"
        middleThree("solving") → "lvi"
*/

public class MiddleThree {

    public static String middleThree(String str) {
        if (str.length() == 3) {
            return str;
        } else {
            int base = (int) str.length() / 2;
            int start = base - 1;
            int end = start + 3;
            return str.substring(start, end);
        }
    }

}
