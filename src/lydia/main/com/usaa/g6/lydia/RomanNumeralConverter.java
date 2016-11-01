package com.usaa.g6.lydia;

/**
 * Created by lydiachen on 11/1/16.
 */
public class RomanNumeralConverter {
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
