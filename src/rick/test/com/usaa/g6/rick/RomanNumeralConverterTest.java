package com.usaa.g6.rick;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IT93168 on 11/1/2016.
 */
public class RomanNumeralConverterTest {

    @Test
    public void testRomanConvertOfArabicNumeral1ToI() {
        assertEquals("I", new RomanNumeralConverter().convert(1));
    }
}
