// @formatter:off
/**
 * Copyright 2017 Bernard Ladenthin bernard.ladenthin@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
// @formatter:on
package net.ladenthin.javacommons;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test the class {@link StringCollectionToPrimitiveArray}.
 * @author Bernard Ladenthin bernard.ladenthin@gmail.com
 */
public class StringCollectionToPrimitiveArrayTest {

    /**
     * The class under test.
     */
    private final StringCollectionToPrimitiveArray cut = new StringCollectionToPrimitiveArray();

    @Test
    void stringCollectionToStringArray_correctUsage() throws IOException {
        assertAll(
                () -> assertNotNull(cut.stringCollectionToStringArray(null)),
                () -> assertEquals(0, cut.stringCollectionToStringArray(null).length),
                () -> assertArrayEquals(new String[]{}, cut.stringCollectionToStringArray(Arrays.asList())),
                () -> assertArrayEquals(new String[]{null}, cut.stringCollectionToStringArray(Arrays.asList((String)null))),
                () -> assertArrayEquals(new String[]{"One"}, cut.stringCollectionToStringArray(Arrays.asList("One"))),
                () -> assertArrayEquals(new String[]{"One", "Two"}, cut.stringCollectionToStringArray(Arrays.asList("One", "Two"))),
                () -> assertArrayEquals(new String[]{"One", "Two", "Three"}, cut.stringCollectionToStringArray(Arrays.asList("One", "Two", "Three")))
        );
    }

    @Test
    void stringCollectionToByteArray_correctUsage() throws IOException {
        assertAll(
                () -> assertNotNull(cut.stringCollectionToByteArray(null)),
                () -> assertEquals(0, cut.stringCollectionToByteArray(null).length),
                () -> assertArrayEquals(new byte[]{}, cut.stringCollectionToByteArray(Arrays.asList())),
                () -> assertArrayEquals(new byte[]{(byte)0}, cut.stringCollectionToByteArray(Arrays.asList("0"))),
                () -> assertArrayEquals(new byte[]{(byte)0, (byte)1}, cut.stringCollectionToByteArray(Arrays.asList("0", "1"))),
                () -> assertArrayEquals(new byte[]{(byte)0, (byte)1, (byte)2}, cut.stringCollectionToByteArray(Arrays.asList("0", "1", "2")))
        );
    }

    @Test
    void stringCollectionToByteArray_wrongUsage() throws IOException {
        assertThrows(NumberFormatException.class, () -> {
            cut.stringCollectionToByteArray(Arrays.asList((String)null));
        });
    }

    @Test
    void stringCollectionToShortArray_correctUsage() throws IOException {
        assertAll(
                () -> assertNotNull(cut.stringCollectionToShortArray(null)),
                () -> assertEquals(0, cut.stringCollectionToShortArray(null).length),
                () -> assertArrayEquals(new short[]{}, cut.stringCollectionToShortArray(Arrays.asList())),
                () -> assertArrayEquals(new short[]{(short)0}, cut.stringCollectionToShortArray(Arrays.asList("0"))),
                () -> assertArrayEquals(new short[]{(short)0, (short)1}, cut.stringCollectionToShortArray(Arrays.asList("0", "1"))),
                () -> assertArrayEquals(new short[]{(short)0, (short)1, (short)2}, cut.stringCollectionToShortArray(Arrays.asList("0", "1", "2")))
        );
    }

    @Test
    void stringCollectionToShortArray_wrongUsage() throws IOException {
        assertThrows(NumberFormatException.class, () -> {
            cut.stringCollectionToShortArray(Arrays.asList((String)null));
        });
    }

    @Test
    void stringCollectionToIntArray_correctUsage() throws IOException {
        assertAll(
                () -> assertNotNull(cut.stringCollectionToIntArray(null)),
                () -> assertEquals(0, cut.stringCollectionToIntArray(null).length),
                () -> assertArrayEquals(new int[]{}, cut.stringCollectionToIntArray(Arrays.asList())),
                () -> assertArrayEquals(new int[]{0}, cut.stringCollectionToIntArray(Arrays.asList("0"))),
                () -> assertArrayEquals(new int[]{0, 1}, cut.stringCollectionToIntArray(Arrays.asList("0", "1"))),
                () -> assertArrayEquals(new int[]{0, 1, 2}, cut.stringCollectionToIntArray(Arrays.asList("0", "1", "2")))
        );
    }

    @Test
    void stringCollectionToIntArray_wrongUsage() throws IOException {
        assertThrows(NumberFormatException.class, () -> {
            cut.stringCollectionToIntArray(Arrays.asList((String)null));
        });
    }

    @Test
    void stringCollectionToLongArray_correctUsage() throws IOException {
        assertAll(
                () -> assertNotNull(cut.stringCollectionToLongArray(null)),
                () -> assertEquals(0, cut.stringCollectionToLongArray(null).length),
                () -> assertArrayEquals(new long[]{}, cut.stringCollectionToLongArray(Arrays.asList())),
                () -> assertArrayEquals(new long[]{0L}, cut.stringCollectionToLongArray(Arrays.asList("0"))),
                () -> assertArrayEquals(new long[]{0L, 1L}, cut.stringCollectionToLongArray(Arrays.asList("0", "1"))),
                () -> assertArrayEquals(new long[]{0L, 1L, 2L}, cut.stringCollectionToLongArray(Arrays.asList("0", "1", "2")))
        );
    }

    @Test
    void stringCollectionToLongArray_wrongUsage() throws IOException {
        assertThrows(NumberFormatException.class, () -> {
            cut.stringCollectionToLongArray(Arrays.asList((String)null));
        });
    }

    @Test
    void stringCollectionToFloatArray_correctUsage() throws IOException {
        assertAll(
                () -> assertNotNull(cut.stringCollectionToFloatArray(null)),
                () -> assertEquals(0, cut.stringCollectionToFloatArray(null).length),
                () -> assertArrayEquals(new float[]{}, cut.stringCollectionToFloatArray(Arrays.asList())),
                () -> assertArrayEquals(new float[]{0f}, cut.stringCollectionToFloatArray(Arrays.asList("0"))),
                () -> assertArrayEquals(new float[]{0f, 1.1f}, cut.stringCollectionToFloatArray(Arrays.asList("0", "1.1"))),
                () -> assertArrayEquals(new float[]{0f, 1.1f, 2.2f}, cut.stringCollectionToFloatArray(Arrays.asList("0", "1.1", "2.2")))
        );
    }

    @Test
    void stringCollectionToFloatArray_wrongUsage() throws IOException {
        assertThrows(NullPointerException.class, () -> {
            cut.stringCollectionToFloatArray(Arrays.asList((String)null));
        });
    }

    @Test
    void stringCollectionToBooleanArray_correctUsage() throws IOException {
        assertAll(
                () -> assertNotNull(cut.stringCollectionToBooleanArray(null)),
                () -> assertEquals(0, cut.stringCollectionToBooleanArray(null).length),
                () -> assertArrayEquals(new boolean[]{}, cut.stringCollectionToBooleanArray(Arrays.asList())),
                () -> assertArrayEquals(new boolean[]{false}, cut.stringCollectionToBooleanArray(Arrays.asList((String)null))),
                () -> assertArrayEquals(new boolean[]{false}, cut.stringCollectionToBooleanArray(Arrays.asList("false"))),
                () -> assertArrayEquals(new boolean[]{false, true}, cut.stringCollectionToBooleanArray(Arrays.asList("false", "true"))),
                () -> assertArrayEquals(new boolean[]{false, true, false}, cut.stringCollectionToBooleanArray(Arrays.asList("false", "true", "false")))
        );
    }

    @Test
    void stringCollectionToDoubleArray_correctUsage() throws IOException {
        assertAll(
                () -> assertNotNull(cut.stringCollectionToDoubleArray(null)),
                () -> assertEquals(0, cut.stringCollectionToDoubleArray(null).length),
                () -> assertArrayEquals(new double[]{}, cut.stringCollectionToDoubleArray(Arrays.asList())),
                () -> assertArrayEquals(new double[]{0.0d}, cut.stringCollectionToDoubleArray(Arrays.asList("0"))),
                () -> assertArrayEquals(new double[]{0.0d, 1.1d}, cut.stringCollectionToDoubleArray(Arrays.asList("0", "1.1"))),
                () -> assertArrayEquals(new double[]{0.0d, 1.1d, 2.2d}, cut.stringCollectionToDoubleArray(Arrays.asList("0", "1.1", "2.2")))
        );
    }

    @Test
    void stringCollectionToDoubleArray_wrongUsage() throws IOException {
        assertThrows(NullPointerException.class, () -> {
            cut.stringCollectionToDoubleArray(Arrays.asList((String)null));
        });
    }

    @Test
    void stringCollectionToCharArray_correctUsage() throws IOException {
        assertAll(
                () -> assertNotNull(cut.stringCollectionToCharArray(null)),
                () -> assertEquals(0, cut.stringCollectionToCharArray(null).length),
                () -> assertArrayEquals(new char[]{}, cut.stringCollectionToCharArray(Arrays.asList())),
                () -> assertArrayEquals(new char[]{'A'}, cut.stringCollectionToCharArray(Arrays.asList("A"))),
                () -> assertArrayEquals(new char[]{'A', 'B'}, cut.stringCollectionToCharArray(Arrays.asList("A", "B"))),
                () -> assertArrayEquals(new char[]{'A', 'B', 'C'}, cut.stringCollectionToCharArray(Arrays.asList("A", "B", "C"))),
                () -> assertArrayEquals(new char[]{'A'}, cut.stringCollectionToCharArray(Arrays.asList("AX"))),
                () -> assertArrayEquals(new char[]{'A', 'B'}, cut.stringCollectionToCharArray(Arrays.asList("AX", "BX"))),
                () -> assertArrayEquals(new char[]{'A', 'B', 'C'}, cut.stringCollectionToCharArray(Arrays.asList("AX", "BX", "CX")))
        );
    }

    @Test
    void stringCollectionToCharArray_wrongUsage() throws IOException {
        assertThrows(NullPointerException.class, () -> {
            cut.stringCollectionToCharArray(Arrays.asList((String)null));
        });
    }
}
