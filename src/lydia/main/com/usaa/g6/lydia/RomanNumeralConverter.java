package com.usaa.g6.lydia;

/**
 * Created by lydiachen on 11/1/16.
 */
public class RomanNumeralConverter {
    public String convert(int value) {
        String result="";

        if (value/10!=0){
            int tens = value/10;
            for (int x=0;x<tens;x++) {
                result+= "X";
            }
        }

        if ( value/5==1 || (value+1)/5==1 ) {
            result += "V";
        }

        if (value%5==4){
            if (value<10){
                value = (value+1)/5;
                result = "I" + result;
                value = value*5-1;
            }
            if (value>=10){
                result = result + "I" + result;
            }
        }

        if (value%5!=0 && value%5!=4){
            for (int i =0;i<value%5;i++){
                result+= "I";
            }
        }


        return result;
    }
}
