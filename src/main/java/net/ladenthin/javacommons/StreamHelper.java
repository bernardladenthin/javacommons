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

import java.nio.charset.StandardCharsets;

/**
 * Holds shared stream-related constants.
 *
 * <p>The stream-reading helper methods previously offered here have been
 * removed in favour of the standard library: use
 * {@code InputStream.readAllBytes()} / {@code InputStream.transferTo(...)}
 * (Java&nbsp;9+) and {@code java.nio.file.Files.readString(...)} (Java&nbsp;11+).
 * See the README for the full replacement table.
 *
 * @author Bernard Ladenthin bernard.ladenthin@gmail.com
 */
public class StreamHelper {

    /**
     * Default buffer size, in bytes, formerly used while copying streams.
     */
    public static final int BUFFER_SIZE = 2048;

    /**
     * The canonical name of the UTF-8 charset.
     */
    public static final String UTF8 = StandardCharsets.UTF_8.name();
}
