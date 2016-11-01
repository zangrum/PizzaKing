package com.usaa.g6.syd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sydneycondie on 11/1/16.
 */
public class FancyRomanNumeralConverterTest {

    @Test
    public void testRomanConvertArabicNumeral4toIV(){
        assertEquals("IV", new FancyRomanNumeralConverter().toRoman(4));
    }

    @Test
    public void testRomanConvertArabicNumeral400toCD(){
        assertEquals("CD", new FancyRomanNumeralConverter().toRoman(400));
    }

    @Test
    public void testRomanConvertArabicNumeral999toCMXCIX(){
        assertEquals("CMXCIX", new FancyRomanNumeralConverter().toRoman(999));
    }

    @Test
    public void testRomanConvertArabicNumeral2016toMMXVI(){
        assertEquals("MMXVI", new FancyRomanNumeralConverter().toRoman(2016));
    }
}
