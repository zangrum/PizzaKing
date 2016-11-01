package com.usaa.g6.utai;

/**
 * Created by pitakUSA on 11/1/2016. Copied from Lydia
 */
public class RomanNumericalConverter {
    public String convert(int value) {
        if (value==1) {
            return "I";
        } else if (value==2) {
            return "II";
        } else {
            return "III";
        }
    }
}
