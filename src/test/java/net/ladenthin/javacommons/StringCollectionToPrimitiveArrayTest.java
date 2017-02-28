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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 *
 * @author Bernard Ladenthin bernard.ladenthin@gmail.com
 */
public class StringCollectionToPrimitiveArrayTest {

    @Test
    void stringCollectionToStringArray() throws IOException {
        String[] strings = new StringCollectionToPrimitiveArray().stringCollectionToStringArray(Arrays.asList("One", "Two", "Three"));

        assertArrayEquals(new String[]{"One", "Two", "Three"}, strings);
    }

    @Test
    void stringCollectionToByteArray() throws IOException {
        byte[] bytes = new StringCollectionToPrimitiveArray().stringCollectionToByteArray(Arrays.asList("0", "1", "2"));

        assertArrayEquals(new byte[]{(byte)0, (byte)1, (byte)2}, bytes);
    }

    @Test
    void stringCollectionToShortArray() throws IOException {
        short[] shorts = new StringCollectionToPrimitiveArray().stringCollectionToShortArray(Arrays.asList("0", "1", "2"));

        assertArrayEquals(new short[]{(short)0, (short)1, (short)2}, shorts);
    }

    @Test
    void stringCollectionToIntArray() throws IOException {
        int[] ints = new StringCollectionToPrimitiveArray().stringCollectionToIntArray(Arrays.asList("0", "1", "2"));

        assertArrayEquals(new int[]{(short)0, (short)1, (short)2}, ints);
    }

    @Test
    void stringCollectionToLongArray() throws IOException {
        long[] longs = new StringCollectionToPrimitiveArray().stringCollectionToLongArray(Arrays.asList("0", "1", "2"));

        assertArrayEquals(new long[]{(short)0, (short)1, (short)2}, longs);
    }

    @Test
    void stringCollectionToFloatArray() throws IOException {
        float[] floats = new StringCollectionToPrimitiveArray().stringCollectionToFloatArray(Arrays.asList("0", "1.1", "2.2"));

        assertArrayEquals(new float[]{0f, 1.1f, 2.2f}, floats);
    }

    @Test
    void stringCollectionToBooleanArray() throws IOException {
        boolean[] booleans = new StringCollectionToPrimitiveArray().stringCollectionToBooleanArray(Arrays.asList("true", "false"));

        assertArrayEquals(new boolean[]{true, false}, booleans);
    }

    @Test
    void stringCollectionToDoubleArray() throws IOException {
        double[] doubles = new StringCollectionToPrimitiveArray().stringCollectionToDoubleArray(Arrays.asList("0", "1.1", "2.2"));

        assertArrayEquals(new double[]{0.0d, 1.1d, 2.2d}, doubles);
    }

    @Test
    void stringCollectionToCharArray() throws IOException {
        char[] chars = new StringCollectionToPrimitiveArray().stringCollectionToCharArray(Arrays.asList("0", "1", "2"));

        assertArrayEquals(new char[]{(char)0, (char)1, (char)2}, chars);
    }
}
