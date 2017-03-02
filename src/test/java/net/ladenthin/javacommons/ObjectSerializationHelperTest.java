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

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test the class {@link ObjectSerializationHelper}.
 *
 * @author Bernard Ladenthin bernard.ladenthin@gmail.com
 */
public class ObjectSerializationHelperTest {

    ObjectSerializationHelper<String> cut = new ObjectSerializationHelper<>();

    @Test
    public void roundTrip() throws IOException, ClassNotFoundException {
        byte[] buffer;
        String read;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            cut.writeObject("Test", baos);
            buffer = baos.toByteArray();
        }

        try (ByteArrayInputStream bais = new ByteArrayInputStream(buffer)) {
            read = cut.readObject(bais);
        }

        assertEquals("Test", read);
    }

    @Test
    public void roundTripCompressed() throws IOException, ClassNotFoundException {
        byte[] buffer;
        String read;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            cut.writeObjectCompressed("Test", baos);
            buffer = baos.toByteArray();
        }

        try (ByteArrayInputStream bais = new ByteArrayInputStream(buffer)) {
            read = cut.readObjectCompressed(bais);
        }

        assertEquals("Test", read);
    }
}
