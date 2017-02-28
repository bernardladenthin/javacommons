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
import java.nio.charset.StandardCharsets;

/**
 * Helps to read a stream and convert them to an string.
 * All methods are thread safe.
 *
 * @author Bernard Ladenthin bernard.ladenthin@gmail.com
 */
public class StreamHelper {

    public static final int BUFFER_SIZE = 2048;
    public static final String UTF8 = StandardCharsets.UTF_8.name();

    public ByteArrayOutputStream readFully(InputStream inputStream) throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream(inputStream.available());
        byte[] buffer = new byte[BUFFER_SIZE];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        return result;
    }

    public byte[] readFullyAsBytes(InputStream inputStream) throws IOException {
        return readFully(inputStream).toByteArray();
    }

    public String readFullyAsString(InputStream inputStream, String encoding) throws IOException {
        return readFully(inputStream).toString(encoding);
    }

    public String readFullyAsUTF8String(InputStream inputStream) throws IOException {
        return readFullyAsString(inputStream, UTF8);
    }

    public String readFullyAsUTF8String(File file) throws IOException {
        return readFullyAsString(file, UTF8);
    }

    public String readFullyAsString(File file, String encoding) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream( file )) {
            String content = readFullyAsString( fileInputStream, encoding );
            return content;
        }
    }
}
