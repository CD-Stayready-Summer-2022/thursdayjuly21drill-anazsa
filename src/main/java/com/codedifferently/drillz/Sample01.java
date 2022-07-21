package com.codedifferently.drillz;

public class Sample01 {

    /**
     * Given a non-empty string and an int N,
     * return the string made starting with char 0,
     * and then every Nth char of the string.
     * So if N is 3, use char 0, 3, 6, ... and so on.
     * N is 1 or more.
     * everyNth("Miracle", 2) → "Mrce"
     * everyNth("abcdefg", 2) → "aceg"
     * everyNth("abcdefg", 3) → "adg"
     * create an empty string
     * turn string into string array
     * loop through
     * for each n letter remove and add to empty
     *
     * @param str
     * @param n
     * @return
     */
    public String everyNth(String str, int n) {
        StringBuilder empty = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
