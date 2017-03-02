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

import java.util.Collection;

/**
 * Convert a string collection to an array containing string or primitive data types.
 * All methods are thread safe.
 *
 * @author Bernard Ladenthin bernard.ladenthin@gmail.com
 */
public class StringCollectionToPrimitiveArray {

    /**
     * An empty string array.
     */
    public static final String[] EMPTY_ARRAY_STRING = new String[0];

    /**
     * An empty byte array.
     */
    public static final byte[] EMPTY_ARRAY_BYTE = new byte[0];

    /**
     * An empty short array.
     */
    public static final short[] EMPTY_ARRAY_SHORT = new short[0];

    /**
     * An empty int array.
     */
    public static final int[] EMPTY_ARRAY_INT = new int[0];

    /**
     * An empty long array.
     */
    public static final long[] EMPTY_ARRAY_LONG = new long[0];

    /**
     * An empty float array.
     */
    public static final float[] EMPTY_ARRAY_FLOAT = new float[0];

    /**
     * An empty double array.
     */
    public static final double[] EMPTY_ARRAY_DOUBLE = new double[0];

    /**
     * An empty boolean array.
     */
    public static final boolean[] EMPTY_ARRAY_BOOLEAN = new boolean[0];

    /**
     * An empty char array.
     */
    public static final char[] EMPTY_ARRAY_CHAR = new char[0];

    /**
     * Convert a {@link String} {@link Collection} to a {@link String} array.
     * No further converts.
     * <code>null</code> values in the collection are allowed and will be <code>null</code> values in the array.
     * @param strings The {@link String}s. Can be <code>null</code>.
     * @return The {@link String} array. Never be <code>null</code>, may be empty.
     */
    public String[] stringCollectionToStringArray(Collection<String> strings) {
        if(strings == null || strings.size() == 0) {
            return EMPTY_ARRAY_STRING;
        }
        return strings.toArray(new String[strings.size()]);
    }

    /**
     * Convert a {@link String} {@link Collection} containing bytes to a {@link String} array.
     * Convert all entries using {@link Byte#parseByte(String)}.
     * <code>null</code> values in the collection are not allowed and throw a {@link NumberFormatException}.
     * @param strings The {@link String}s. Can be <code>null</code>.
     * @return The byte array. Never be <code>null</code>, may be empty.
     */
    public byte[] stringCollectionToByteArray(Collection<String> strings) {
        if(strings == null || strings.size() == 0) {
            return EMPTY_ARRAY_BYTE;
        }
        byte[] ret = new byte[strings.size()];
        int i = 0;
        for (String string : strings) {
            ret[i++] = Byte.parseByte(string);
        }
        return ret;
    }

    /**
     * Convert a {@link String} {@link Collection} containing shorts to a {@link String} array.
     * Convert all entries using {@link Short#parseShort(String)}.
     * <code>null</code> values in the collection are not allowed and throw a {@link NumberFormatException}.
     * @param strings The {@link String}s. Can be <code>null</code>.
     * @return The short array. Never be <code>null</code>, may be empty.
     */
    public short[] stringCollectionToShortArray(Collection<String> strings) {
        if(strings == null || strings.size() == 0) {
            return EMPTY_ARRAY_SHORT;
        }
        short[] ret = new short[strings.size()];
        int i = 0;
        for (String string : strings) {
            ret[i++] = Short.parseShort(string);
        }
        return ret;
    }

    /**
     * Convert a {@link String} {@link Collection} containing ints to a {@link String} array.
     * Convert all entries using {@link Integer#parseInt(String)}.
     * <code>null</code> values in the collection are not allowed and throw a {@link NumberFormatException}.
     * @param strings The {@link String}s. Can be <code>null</code>.
     * @return The int array. Never be <code>null</code>, may be empty.
     */
    public int[] stringCollectionToIntArray(Collection<String> strings) {
        if(strings == null || strings.size() == 0) {
            return EMPTY_ARRAY_INT;
        }
        int[] ret = new int[strings.size()];
        int i = 0;
        for (String string : strings) {
            ret[i++] = Integer.parseInt(string);
        }
        return ret;
    }

    /**
     * Convert a {@link String} {@link Collection} containing longs to a {@link String} array.
     * Convert all entries using {@link Long#parseLong(String)}.
     * <code>null</code> values in the collection are not allowed and throw a {@link NumberFormatException}.
     * @param strings The {@link String}s. Can be <code>null</code>.
     * @return The long array. Never be <code>null</code>, may be empty.
     */
    public long[] stringCollectionToLongArray(Collection<String> strings) {
        if(strings == null || strings.size() == 0) {
            return EMPTY_ARRAY_LONG;
        }
        long[] ret = new long[strings.size()];
        int i = 0;
        for (String string : strings) {
            ret[i++] = Long.parseLong(string);
        }
        return ret;
    }

    /**
     * Convert a {@link String} {@link Collection} containing floats to a {@link String} array.
     * Convert all entries using {@link Float#parseFloat(String)}.
     * <code>null</code> values in the collection are not allowed and throw a {@link NullPointerException}.
     * @param strings The {@link String}s. Can be <code>null</code>.
     * @return The float array. Never be <code>null</code>, may be empty.
     */
    public float[] stringCollectionToFloatArray(Collection<String> strings) {
        if(strings == null || strings.size() == 0) {
            return EMPTY_ARRAY_FLOAT;
        }
        float[] ret = new float[strings.size()];
        int i = 0;
        for (String string : strings) {
            ret[i++] = Float.parseFloat(string);
        }
        return ret;
    }

    /**
     * Convert a {@link String} {@link Collection} containing doubles to a {@link String} array.
     * Convert all entries using {@link Double#parseDouble(String)}.
     * <code>null</code> values in the collection are not allowed and throw a {@link NullPointerException}.
     * @param strings The {@link String}s. Can be <code>null</code>.
     * @return The double array. Never be <code>null</code>, may be empty.
     */
    public double[] stringCollectionToDoubleArray(Collection<String> strings) {
        if(strings == null || strings.size() == 0) {
            return EMPTY_ARRAY_DOUBLE;
        }
        double[] ret = new double[strings.size()];
        int i = 0;
        for (String string : strings) {
            ret[i++] = Double.parseDouble(string);
        }
        return ret;
    }

    /**
     * Convert a {@link String} {@link Collection} containing booleans to a {@link String} array.
     * Convert all entries using {@link Boolean#parseBoolean(String)}.
     * <code>null</code> values in the collection are allowed and will be converted to a <code>false</code> value.
     * @param strings The {@link String}s. Can be <code>null</code>.
     * @return The boolean array. Never be <code>null</code>, may be empty.
     */
    public boolean[] stringCollectionToBooleanArray(Collection<String> strings) {
        if(strings == null || strings.size() == 0) {
            return EMPTY_ARRAY_BOOLEAN;
        }
        boolean[] ret = new boolean[strings.size()];
        int i = 0;
        for (String string : strings) {
            ret[i++] = Boolean.parseBoolean(string);
        }
        return ret;
    }

    /**
     * Convert a {@link String} {@link Collection} containing chars to a {@link String} array.
     * Convert all entries using {@link String#charAt(int)}.
     * <code>null</code> values in the collection are not allowed and throw a {@link NullPointerException}.
     * @param strings The {@link String}s. Can be <code>null</code>.
     * @return The char array. Never be <code>null</code>, may be empty.
     */
    public char[] stringCollectionToCharArray(Collection<String> strings) {
        if(strings == null || strings.size() == 0) {
            return EMPTY_ARRAY_CHAR;
        }
        char[] ret = new char[strings.size()];
        int i = 0;
        for (String string : strings) {
            ret[i++] = string.charAt(0);
        }
        return ret;
    }
}
