package com.usaa.g6.lydia;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by lydiachen on 11/1/16.
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
    public void testRomanConvertOfArabicNumeral6ToVI() {
        assertEquals("VI", new RomanNumeralConverter().convert(6));
    }

    @Test
    public void testRomanConvertOfArabicNumeral7ToVII() {
        assertEquals("VII", new RomanNumeralConverter().convert(7));
    }

    @Test
    public void testRomanConvertOfArabicNumeral9ToIV() {
        assertEquals("IV", new RomanNumeralConverter().convert(9));
    }

    @Test
    public void testRomanConvertOfArabicNumeral10ToX() {
        assertEquals("X", new RomanNumeralConverter().convert(10));
    }

    @Test
    public void testRomanConvertOfArabicNumeral19ToXIX() {
        assertEquals("XIX", new RomanNumeralConverter().convert(19));
    }

    @Test
    public void testRomanConvertOfArabicNumeral20ToXX() {
        assertEquals("XX", new RomanNumeralConverter().convert(20));
    }

    @Test
    public void testRomanConvertOfArabicNumeral22ToXXII() {
        assertEquals("XXII", new RomanNumeralConverter().convert(22));
    }
}
