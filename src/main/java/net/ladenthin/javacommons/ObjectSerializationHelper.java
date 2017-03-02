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

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Helps for some serialization and deserialization operations.
 * All methods are thread safe.
 *
 * @author Bernard Ladenthin bernard.ladenthin@gmail.com
 */
public class ObjectSerializationHelper<T> {

    public void writeObject(T obj, OutputStream os) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(obj);
        }
    }

    public T readObject(InputStream is) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(is)) {
            return (T) ois.readObject();
        }
    }

    public void writeObjectCompressed(T obj, OutputStream os) throws IOException {
        try (GZIPOutputStream gos = new GZIPOutputStream(os)) {
            writeObject(obj, gos);
        }
    }

    public T readObjectCompressed(InputStream is) throws IOException, ClassNotFoundException {
        try (GZIPInputStream gis = new GZIPInputStream(is)) {
            return readObject(gis);
        }
    }
}
