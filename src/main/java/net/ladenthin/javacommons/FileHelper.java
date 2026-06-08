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

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Helps for some file operations.
 * All methods are thread safe.
 *
 * @author Bernard Ladenthin bernard.ladenthin@gmail.com
 */
public class FileHelper {

    /**
     * Converts a {@link File} to a {@link URL}.
     *
     * @param file the file to convert
     * @return the URL representation of the file
     * @throws MalformedURLException if the file cannot be converted to a URL
     * @deprecated This one-line wrapper adds nothing over the JDK call. Use
     *             {@code file.toURI().toURL()} directly, or stay in NIO with
     *             {@code path.toUri().toURL()}.
     */
    @Deprecated
    public URL fileToUrl(File file) throws MalformedURLException {
        return file.toURI().toURL();
    }

    /**
     * Converts a {@link URL} to a {@link File}.
     *
     * @param url the URL to convert
     * @return the file representation of the URL
     * @throws URISyntaxException if the URL is not formatted strictly according to RFC&nbsp;2396
     * @deprecated This one-line wrapper adds nothing over the JDK call. Use
     *             {@code new File(url.toURI())} directly, or in NIO
     *             {@code Paths.get(url.toURI())}.
     */
    @Deprecated
    public File urlToFile(URL url) throws URISyntaxException {
        return new File(url.toURI());
    }
}
