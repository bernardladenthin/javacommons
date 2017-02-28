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

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.migrationsupport.rules.ExternalResourceSupport;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Bernard Ladenthin bernard.ladenthin@gmail.com
 */
@ExtendWith(ExternalResourceSupport.class)
public class FileHelperTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void fileToUrl_noExceptionThrown() throws IOException {
        new FileHelper().fileToUrl(folder.newFile());
    }

    @Test
    public void urlToFile_noExceptionThrown() throws URISyntaxException, IOException {
        new FileHelper().urlToFile(folder.newFile().toURI().toURL());
    }

    @Test
    public void fileToUrl_and_urlToFile_roundtrip() throws URISyntaxException, IOException {
        File file = folder.newFile();
        File file1 = new FileHelper().urlToFile(new FileHelper().fileToUrl(file));

        assertEquals(file, file1);
    }
}
