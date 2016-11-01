package com.usaa.g6.syd;

/**
 * Created by sydneycondie on 11/1/16.
 */
public class RomanNumeralConverter {
    public String convert(int value) {
        String romanNumeral = "";
        //for (int i = 0; i < value; i++){
        //    romanNumeral = romanNumeral + "I";
        //}
        //return romanNumeral;
        while (value > 0) {
            if (value >= 50) {
                romanNumeral += "L";
                value -= 50;
            }
            else if (value >= 40) {
                romanNumeral += "XL";
                value -= 40;
            }
            else if (value >= 10) {
                romanNumeral += "X";
                value -= 10;
            }
            else if (value == 9) {
                romanNumeral += "IX";
                value -= 9;
            }
            else if (value >= 5) {
                romanNumeral += "V";
                value -= 5;
            }
            else if (value == 4) {
                romanNumeral += "IV";
                value -= 4;
            }
            else if (value < 4) {
                romanNumeral += "I";
                value -= 1;
            }

        }
        return romanNumeral;
    }
}

