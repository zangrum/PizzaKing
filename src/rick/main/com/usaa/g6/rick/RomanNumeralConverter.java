package com.usaa.g6.rick;

/**
 * Created by IT93168 on 11/1/2016.
 */
public class RomanNumeralConverter {
    public String convert(int value) {
        String result="";
        for (int i =0;i<value;i++){
            result += "I";
        }
        return result;
    }
}
