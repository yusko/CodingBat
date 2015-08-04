package com.codingbat;

/**
 * Created by yusko on 8/3/15.
 */
public class WarmUp {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation)
            return true;
        return false;
    }

    public int diff21(int n) {
        return (n <= 21) ? 21 - n : (n - 21) * 2;
    }

    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10 ? true : false;
    }

    public String missingChar(String str, int n) {
        String sFront = str.substring(0, n);
        String sBack = str.substring(n + 1, str.length());
        return sFront + sBack;
    }

    public String backAround(String str) {
        return str.charAt(str.length() - 1 ) + str + str.charAt(str.length() - 1 );
    }

}
