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
    @Test
    public void testRomanConvertOfArabicNumeral2ToII() {
        assertEquals("II", new RomanNumeralConverter().convert(2));
    }
    @Test
    public void testRomanConvertOfArabicNumeral3ToIII() {
        assertEquals("III", new RomanNumeralConverter().convert(3));
    }
    @Test
    public void testRomanConvertOfArabicNumeral4ToIV() {
        assertEquals("IV", new RomanNumeralConverter().convert(4));
    }
    @Test
    public void testRomanConvertOfArabicNumeral5ToV() {
        assertEquals("V", new RomanNumeralConverter().convert(5));
    }
    @Test
    public void testRomanConvertOfArabicNumeral6oVI() {
        assertEquals("VI", new RomanNumeralConverter().convert(6));
    }
    @Test
    public void testRomanConvertOfArabicNumeral7ToVII() {
        assertEquals("VII", new RomanNumeralConverter().convert(7));
    }
    @Test
    public void testRomanConvertOfArabicNumeral8ToVIII() {
        assertEquals("VIII", new RomanNumeralConverter().convert(8));
    }
    @Test
    public void testRomanConvertOfArabicNumeral9ToIX() {
        assertEquals("IX", new RomanNumeralConverter().convert(9));
    }
    @Test
    public void testRomanConvertOfArabicNumeral10toX() {
        assertEquals("X", new RomanNumeralConverter().convert(10));
    }
    @Test
    public void testRomanConvertOfArabicNumeral12toXII() {
        assertEquals("XII", new RomanNumeralConverter().convert(12));
    }
    @Test
    public void testRomanConvertOfArabicNumeral14toXIV() {
        assertEquals("XIV", new RomanNumeralConverter().convert(14));
    }
    @Test
    public void testRomanConvertOfArabicNumeral15toXV() {
        assertEquals("XV", new RomanNumeralConverter().convert(15));
    }
    @Test
    public void testRomanConvertOfArabicNumeral18toXVIII() {
        assertEquals("XVIII", new RomanNumeralConverter().convert(18));
    }
    @Test
    public void testRomanConvertOfArabicNumeral19toXIX() {
        assertEquals("XIX", new RomanNumeralConverter().convert(19));
    }
    @Test
    public void testRomanConvertOfArabicNumeral21toXXI() {
        assertEquals("XXI", new RomanNumeralConverter().convert(21));
    }
    @Test
    public void testRomanConvertOfArabicNumeral24toXXIV() {
        assertEquals("XXIV", new RomanNumeralConverter().convert(24));
    }
    @Test
    public void testRomanConvertOfArabicNumeral28toXXVIII() {
        assertEquals("XXVIII", new RomanNumeralConverter().convert(28));
    }
    @Test
    public void testRomanConvertOfArabicNumeral29toXXIX() {
        assertEquals("XXIX", new RomanNumeralConverter().convert(29));
    }
    @Test
    public void testRomanConvertOfArabicNumeral34toXXXIV() {
        assertEquals("XXXIV", new RomanNumeralConverter().convert(34));
    }
    @Test
    public void testRomanConvertOfArabicNumeral36toXXXVI() {
        assertEquals("XXXVI", new RomanNumeralConverter().convert(36));
    }
    @Test
    public void testRomanConvertOfArabicNumeral39toXXXIX() {
        assertEquals("XXXIX", new RomanNumeralConverter().convert(39));
    }
    @Test
    public void testRomanConvertOfArabicNumeral43toXLIII() {
        assertEquals("XLIII", new RomanNumeralConverter().convert(43));
    }
    @Test
    public void testRomanConvertOfArabicNumeral44toXLIV() {
        assertEquals("XLIV", new RomanNumeralConverter().convert(44));
    }@Test
    public void testRomanConvertOfArabicNumeral45toXLV() {
        assertEquals("XLV", new RomanNumeralConverter().convert(45));
    }
    @Test
    public void testRomanConvertOfArabicNumeral49toXLIX() {
        assertEquals("XLIX", new RomanNumeralConverter().convert(49));
    }
    @Test
    public void testRomanConvertOfArabicNumeral58toLVIII() {
        assertEquals("LVIII", new RomanNumeralConverter().convert(58));
    }
    @Test
    public void testRomanConvertOfArabicNumeral81toLXXXI() {
        assertEquals("LXXXI", new RomanNumeralConverter().convert(81));
    }
}
