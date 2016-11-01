package com.usaa.g6.syd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sydneycondie on 11/1/16.
 */
public class RomanNumeralConverterTest {

    @Test
    public void testRomanConvertOfArabicNumeral1ToI(){
        assertEquals("I", new RomanNumeralConverter().convert(1));
    }

    @Test
    public void testRomanConvertOfArabicNumeral2ToII(){
        assertEquals("II", new RomanNumeralConverter().convert(2));
    }

    @Test
    public void testRomanConvertOfArabicNumeral3ToIII(){
        assertEquals("III", new RomanNumeralConverter().convert(3));
    }

    @Test
    public void testRomanConvertArabicNumeral(){
        String expectedResult = "I";
        int expectedValue = 1;
        System.out.println(expectedResult);
        for (int i = 0; i <= 2; i++){
            System.out.print("Current expectedValue: " + expectedValue);
            System.out.print("Current expectedResult: " + expectedResult);
            assertEquals(expectedResult, new RomanNumeralConverter().convert(expectedValue));
            System.out.print("This is the end of current loop: " + i);
            expectedValue = expectedValue + 1;
            System.out.print("Incremented Value:" + expectedValue);
            expectedResult = expectedResult + "I";
            System.out.print("Incremented Result:" + expectedResult);
        }

    }
}
