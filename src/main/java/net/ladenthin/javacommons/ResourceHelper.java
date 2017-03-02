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
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Helps for some resource operations.
 * All methods are thread safe.
 *
 * @author Bernard Ladenthin bernard.ladenthin@gmail.com
 */
public class ResourceHelper {
    /**
     * Get a resource as a file.
     *
     * @param clazz the class where the resource is requested
     * @param name  name of the desired resource
     * @return the file
     */
    public File getResourceAsFile(FileHelper fileHelper, Class clazz, String name) throws URISyntaxException {
        URL url = clazz.getResource(name);
        return fileHelper.urlToFile(url);
    }
}
