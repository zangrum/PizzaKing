/**
 * Created by pitakUSA on 11/1/2016.
 */
package com.usaa.g6.utai;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumericalConverterTest {
    @Test
    public void RomanNumeralConverterTest {
        assertEquals("I", new RomanNumeralConverter().convert(1));
    }
}
