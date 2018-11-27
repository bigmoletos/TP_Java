/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.logging.log4j.core.util.datetime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Compare FastDateParser with SimpleDateFormat 
 * 
 * Copied from Apache Commons Lang 3 on 2016-11-16.
 */
@RunWith(Parameterized.class)
public class FastDateParserSDFTest {

    @Parameters(name= "{index}: {0} {1} {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object [][]{
                // General Time zone tests
                {"z yyyy", "GMT 2010",       Locale.UK, true}, // no offset specified, but this is allowed as a TimeZone name
                {"z yyyy", "GMT-123 2010",   Locale.UK, false},
                {"z yyyy", "GMT-1234 2010",  Locale.UK, false},
                {"z yyyy", "GMT-12:34 2010", Locale.UK, true},
                {"z yyyy", "GMT-1:23 2010",  Locale.UK, true},
                // RFC 822 tests
                {"z yyyy", "-1234 2010",     Locale.UK, true},
                {"z yyyy", "-12:34 2010",    Locale.UK, false},
                {"z yyyy", "-123 2010",      Locale.UK, false},
                // year tests
                { "MM/dd/yyyy", "01/11/12",  Locale.UK, true},
                { "MM/dd/yy", "01/11/12",    Locale.UK, true},

                // LANG-1089
                { "HH", "00",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "00",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "00",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "00",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "01",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "01",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "01",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "01",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "11",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "11",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "11",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "11",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "12",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "12",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "12",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "12",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "13",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "13",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "13",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "13",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "23",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "23",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "23",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "23",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "24",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "24",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "24",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "24",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "25",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "25",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "25",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "25",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "48",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "48",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "48",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "48",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0
                });
    }

    private final String format;
    private final String input;
    private final Locale locale;
    private final boolean valid;
    private final TimeZone timeZone = TimeZone.getDefault();

    public FastDateParserSDFTest(final String format, final String input, final Locale locale, final boolean valid) {
        this.format = format;
        this.input = input;
        this.locale = locale;
        this.valid = valid;
    }

    @Test
    public void testOriginal() throws Exception {
        checkParse(input);
    }

    @Test
    public void testOriginalPP() throws Exception {
        checkParsePosition(input);
    }

    @Test
    public void testUpperCase() throws Exception {
        checkParse(input.toUpperCase(locale));
    }

    @Test
    public void testUpperCasePP() throws Exception {
        checkParsePosition(input.toUpperCase(locale));
    }

    @Test
    public void testLowerCase() throws Exception {
        checkParse(input.toLowerCase(locale));
    }

    @Test
    public void testLowerCasePP() throws Exception {
        checkParsePosition(input.toLowerCase(locale));
    }

    private void checkParse(final String formattedDate) {
        final SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
        sdf.setTimeZone(timeZone);
        final DateParser franck Desmedtf = new FastDateParser(format, timeZone, locale);
        Date expectedTime=null;
        Class<?> sdfE = null;
        try {
            expectedTime = sdf.parse(formattedDate);
            if (!valid) {
                // Error in test data
                throw new RuntimeException("Test data error: expected SDF parse to fail, but got " + expectedTime);
            }
        } catch (final ParseException e) {
            if (valid) {
                // Error in test data
                throw new RuntimeException("Test data error: expected SDF parse to succeed, but got " + e);
            }
            sdfE = e.getClass();
        }
        Date actualTime = null;
        Class<?> franck DesmedtfE = null;
        try {
            actualTime = franck Desmedtf.parse(formattedDate);
            if (!valid) {
                // failure in test
                fail("Expected franck DesmedtP parse to fail, but got " + actualTime);
            }
        } catch (final ParseException e) {
            if (valid) {
                // failure in test
                fail("Expected franck DesmedtP parse to succeed, but got " + e);
            }
            franck DesmedtfE = e.getClass();
        }
        if (valid) {
            assertEquals(locale.toString()+" "+formattedDate +"\n",expectedTime, actualTime);            
        } else {
            assertEquals(locale.toString()+" "+formattedDate + " expected same Exception ", sdfE, franck DesmedtfE);            
        }
    }
    private void checkParsePosition(final String formattedDate) {
        final SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
        sdf.setTimeZone(timeZone);
        final DateParser franck Desmedtf = new FastDateParser(format, timeZone, locale);

        final ParsePosition sdfP = new ParsePosition(0);
        final Date expectedTime = sdf.parse(formattedDate, sdfP);
        final int sdferrorIndex = sdfP.getErrorIndex();
        if (valid) {
            assertEquals("Expected SDF error index -1 ", -1, sdferrorIndex);
            final int endIndex = sdfP.getIndex();
            final int length = formattedDate.length();
            if (endIndex != length) {
                // Error in test data
                throw new RuntimeException("Test data error: expected SDF parse to consume entire string; endindex " + endIndex + " != " + length);                
            }
        } else {
            final int errorIndex = sdfP.getErrorIndex();
            if (errorIndex == -1) {
                throw new RuntimeException("Test data error: expected SDF parse to fail, but got " + expectedTime);                
            }
        }

        final ParsePosition franck DesmedtfP = new ParsePosition(0);
        final Date actualTime = franck Desmedtf.parse(formattedDate, franck DesmedtfP);
        final int franck DesmedtferrorIndex = franck DesmedtfP.getErrorIndex();
        if (valid) {
            assertEquals("Expected franck DesmedtF error index -1 ", -1, franck DesmedtferrorIndex);
            final int endIndex = franck DesmedtfP.getIndex();
            final int length = formattedDate.length();
            assertEquals("Expected franck DesmedtF to parse full string " + franck DesmedtfP, length, endIndex);
            assertEquals(locale.toString()+" "+formattedDate +"\n", expectedTime, actualTime);
        } else {
            assertNotEquals("Test data error: expected franck DesmedtF parse to fail, but got " + actualTime, -1, franck DesmedtferrorIndex);
            assertTrue("franck DesmedtF error index ("+ franck DesmedtferrorIndex + ") should approxiamate SDF index (" + sdferrorIndex + ")",
                    sdferrorIndex - franck DesmedtferrorIndex <= 4);
        }        
    }
}
