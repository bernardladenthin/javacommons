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
import java.util.Iterator;

/**
 * Convert a string collection to an array containing primitive data types.
 * All methods are thread safe.
 *
 * @author Bernard Ladenthin bernard.ladenthin@gmail.com
 */
public class StringCollectionToPrimitiveArray {

    public String[] stringCollectionToStringArray(Collection<String> strings) {
        return strings.toArray(new String[strings.size()]);
    }

    public byte[] stringCollectionToByteArray(Collection<String> strings) {
        byte[] ret = new byte[strings.size()];
        int i = 0;
        for (Iterator<String> it = strings.iterator(); it.hasNext(); ) {
            String string = it.next();
            ret[i] = Byte.parseByte(string);
            i++;
        }
        return ret;
    }

    public short[] stringCollectionToShortArray(Collection<String> strings) {
        short[] ret = new short[strings.size()];
        int i = 0;
        for (Iterator<String> it = strings.iterator(); it.hasNext(); ) {
            String string = it.next();
            ret[i] = Short.parseShort(string);
            i++;
        }
        return ret;
    }

    public int[] stringCollectionToIntArray(Collection<String> strings) {
        int[] ret = new int[strings.size()];
        int i = 0;
        for (Iterator<String> it = strings.iterator(); it.hasNext(); ) {
            String string = it.next();
            ret[i] = Integer.parseInt(string);
            i++;
        }
        return ret;
    }

    public long[] stringCollectionToLongArray(Collection<String> strings) {
        long[] ret = new long[strings.size()];
        int i = 0;
        for (Iterator<String> it = strings.iterator(); it.hasNext(); ) {
            String string = it.next();
            ret[i] = Long.parseLong(string);
            i++;
        }
        return ret;
    }

    public float[] stringCollectionToFloatArray(Collection<String> strings) {
        float[] ret = new float[strings.size()];
        int i = 0;
        for (Iterator<String> it = strings.iterator(); it.hasNext(); ) {
            String string = it.next();
            ret[i] = Float.parseFloat(string);
            i++;
        }
        return ret;
    }

    public double[] stringCollectionToDoubleArray(Collection<String> strings) {
        double[] ret = new double[strings.size()];
        int i = 0;
        for (Iterator<String> it = strings.iterator(); it.hasNext(); ) {
            String string = it.next();
            ret[i] = Double.parseDouble(string);
            i++;
        }
        return ret;
    }

    public boolean[] stringCollectionToBooleanArray(Collection<String> strings) {
        boolean[] ret = new boolean[strings.size()];
        int i = 0;
        for (Iterator<String> it = strings.iterator(); it.hasNext(); ) {
            String string = it.next();
            ret[i] = Boolean.parseBoolean(string);
            i++;
        }
        return ret;
    }

    public char[] stringCollectionToCharArray(Collection<String> strings) {
        char[] ret = new char[strings.size()];
        int i = 0;
        for (Iterator<String> it = strings.iterator(); it.hasNext(); ) {
            String string = it.next();
            ret[i] = (char) Integer.parseInt(string);
            i++;
        }
        return ret;
    }
}
