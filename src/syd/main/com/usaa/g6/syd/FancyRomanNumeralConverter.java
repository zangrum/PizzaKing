package com.usaa.g6.syd;

import java.util.TreeMap;

/**
 * Created by sydneycondie on 11/1/16.
 */
public class FancyRomanNumeralConverter {
    //create a Treemap that maps all Arabic Numbers to unique Roman numerals
    public final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");

    }
    //
    public final static String toRoman(int value) {
        int l = map.floorKey(value);
        if (value == l) {
            return map.get(value);
        }
        return map.get(l) + toRoman(value - l);
    }
}
