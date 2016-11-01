package com.usaa.g6.rick;
/*******************************************************
 * Copyright (C) 2016
 * United Services Automobile Association
 * All Rights Reserved
 ********************************************************
 * Chg Date     Name            Description
 * ==========   =============== ==========================
 * 11/01/2016   Richard W. Wise Initial Creation
 **********************************************************/

/**
 * The RomanNumeralConverter class converts an integer into a Roman
 * Numeral following the rules as defined.
 * <p>The numeric system represented by Roman numerals originated in
 * ancient Rome and remained the usual way of writing numbers throughout
 * Europe well into the Late Middle Ages. Numbers in this system are
 * represented by combinations of letters from the Latin alphabet.
 * Roman numerals, as used today, are based on seven symbols:[1]
 * </p>
 * <table>
 * <tr><th>Symbol</th><th>Value</th></tr>
 * <tr><td>I</td><td>1</td></tr>
 * <tr><td>V</td><td>5</td></tr>
 * <tr><td>X</td><td>10</td></tr>
 * <tr><td>L</td><td>50</td></tr>
 * <tr><td>C</td><td>100</td></tr>
 * <tr><td>D</td><td>500</td></tr>
 * <tr><td>M</td><td>1000</td></tr>
 * </table>
 * <p>
 * The use of Roman numerals continued long after the decline of the Roman Empire.
 * From the 14th century on, Roman numerals began to be replaced in most contexts
 * by the more convenient Hindu-Arabic numerals; however, this process was gradual,
 * and the use of Roman numerals persists in some minor applications to this day.
 * </p>
 *
 * @author r Richard W. Wise
 */
public class RomanNumeralConverter {
    /**
     * The convert method takes a arabic numeral positive integer below 3999 and converts it into a Roman Numeral string.
     *
     * @param value
     * @return
     */
    public String convert(int value) {
        String result = "";
        while (value > 0) {
            if (value >= 50) {
                result += "L";
                value -= 50;
                continue;
            } if (value >= 40) {
                result += "XL";
                value -= 40;
                continue;
            }
            if (value >= 10) {
                result += "X";
                value -= 10;
                continue;
            }
            if (value == 9) {
                result += "IX";
                value -= 9;
                continue;
            }
            if (value >= 5) {
                result += "V";
                value -= 5;
                continue;
            }
            if (value == 4) {
                result += "IV";
                value -= 4;
                continue;
            }
            if (value >= 1) {
                result += "I";
                value -= 1;
                continue;
            }
        }
        return result;
    }
}
