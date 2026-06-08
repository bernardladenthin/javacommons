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

    /**
     * Reads an {@link InputStream} fully into a {@link ByteArrayOutputStream}.
     *
     * @param inputStream the stream to read
     * @return a buffer holding all bytes read from the stream
     * @throws IOException if reading fails
     * @deprecated Since Java&nbsp;9 use {@code inputStream.readAllBytes()} for the
     *             bytes, or {@code inputStream.transferTo(target)} to copy into
     *             another stream, instead of this manual buffer loop.
     */
    @Deprecated
    public ByteArrayOutputStream readFully(InputStream inputStream) throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream(inputStream.available());
        byte[] buffer = new byte[BUFFER_SIZE];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        return result;
    }

    /**
     * Reads an {@link InputStream} fully into a byte array.
     *
     * @param inputStream the stream to read
     * @return all bytes read from the stream
     * @throws IOException if reading fails
     * @deprecated Since Java&nbsp;9 use {@code inputStream.readAllBytes()}.
     */
    @Deprecated
    public byte[] readFullyAsBytes(InputStream inputStream) throws IOException {
        return readFully(inputStream).toByteArray();
    }

    /**
     * Reads an {@link InputStream} fully into a string using the given encoding.
     *
     * @param inputStream the stream to read
     * @param encoding the charset name used to decode the bytes
     * @return the decoded string
     * @throws IOException if reading fails
     * @deprecated Since Java&nbsp;9 use
     *             {@code new String(inputStream.readAllBytes(), charset)}, passing a
     *             {@link java.nio.charset.Charset} object instead of a charset name.
     */
    @Deprecated
    public String readFullyAsString(InputStream inputStream, String encoding) throws IOException {
        return readFully(inputStream).toString(encoding);
    }

    /**
     * Reads an {@link InputStream} fully into a UTF-8 decoded string.
     *
     * @param inputStream the stream to read
     * @return the UTF-8 decoded string
     * @throws IOException if reading fails
     * @deprecated Since Java&nbsp;9 use
     *             {@code new String(inputStream.readAllBytes(), StandardCharsets.UTF_8)}.
     */
    @Deprecated
    public String readFullyAsUTF8String(InputStream inputStream) throws IOException {
        return readFullyAsString(inputStream, UTF8);
    }

    /**
     * Reads a {@link File} fully into a UTF-8 decoded string.
     *
     * @param file the file to read
     * @return the UTF-8 decoded file content
     * @throws IOException if reading fails
     * @deprecated Since Java&nbsp;11 use {@code Files.readString(file.toPath())}
     *             (UTF-8 is the default charset).
     */
    @Deprecated
    public String readFullyAsUTF8String(File file) throws IOException {
        return readFullyAsString(file, UTF8);
    }

    /**
     * Reads a {@link File} fully into a string using the given encoding.
     *
     * @param file the file to read
     * @param encoding the charset name used to decode the bytes
     * @return the decoded file content
     * @throws IOException if reading fails
     * @deprecated Since Java&nbsp;11 use {@code Files.readString(file.toPath(), charset)},
     *             passing a {@link java.nio.charset.Charset} object.
     */
    @Deprecated
    public String readFullyAsString(File file, String encoding) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            String content = readFullyAsString(fileInputStream, encoding);
            return content;
        }
    }
}
