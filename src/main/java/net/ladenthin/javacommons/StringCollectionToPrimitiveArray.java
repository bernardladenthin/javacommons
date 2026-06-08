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

/**
 * Holds shared empty-array constants.
 *
 * <p>The string-collection conversion methods previously offered here have been
 * removed in favour of the standard library: most are one-liners with the
 * Stream API, e.g. {@code strings.stream().mapToInt(Integer::parseInt).toArray()}
 * (Java&nbsp;8+) and {@code strings.toArray(String[]::new)}. See the README for
 * the full replacement table.
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
}
