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
        //assertEquals("II", new RomanNumeralConverter().convert(2));
        //assertEquals("III", new RomanNumeralConverter().convert(3));
    }
}
