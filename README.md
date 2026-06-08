[![Travis build status](https://travis-ci.org/bernardladenthin/javacommons.svg)](https://travis-ci.org/bernardladenthin/javacommons)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.ladenthin/javacommons/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.ladenthin/javacommons)
[![Coverage Status](https://coveralls.io/repos/bernardladenthin/javacommons/badge.svg)](https://coveralls.io/r/bernardladenthin/javacommons)
[![Codecov](https://codecov.io/github/bernardladenthin/javacommons/coverage.png)](https://codecov.io/gh/bernardladenthin/javacommons)
[![Coverity Scan Build Status](https://scan.coverity.com/projects/11902/badge.svg)](https://scan.coverity.com/projects/11902)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![Dependency Status](https://www.versioneye.com/user/projects/TODO/badge.svg?style=flat)](https://www.versioneye.com/user/projects/TODO)

#javacommons
Provides common classes for use in other Java projects. No further dependencies.

  * Hosting on GitHub: [https://github.com/bernardladenthin/javacommons](https://github.com/bernardladenthin/javacommons)
  * Documentation: [https://github.com/bernardladenthin/javacommons](https://github.com/bernardladenthin/javacommons)

##Where can I get the latest release?
You can pull it from the central Maven repositories:

```xml
<dependency>
  <groupId>net.ladenthin</groupId>
  <artifactId>javacommons</artifactId>
  <version>1.0.0</version>
</dependency>
```

##Removed helpers and their modern Java replacements

Several helpers in this library only wrapped functionality that the JDK has
since provided directly. Those methods have been removed; use the standard
library instead.

### `StreamHelper` (all read-fully methods removed)

| Removed method | Modern replacement | Since |
|---|---|---|
| `readFully(InputStream)` / `readFullyAsBytes(InputStream)` | `inputStream.readAllBytes()` | Java 9 |
| copy a stream into another stream | `inputStream.transferTo(outputStream)` | Java 9 |
| `readFullyAsString(InputStream, encoding)` | `new String(inputStream.readAllBytes(), charset)` | Java 9 |
| `readFullyAsUTF8String(InputStream)` | `new String(inputStream.readAllBytes(), StandardCharsets.UTF_8)` | Java 9 |
| `readFullyAsString(File, encoding)` | `Files.readString(file.toPath(), charset)` | Java 11 |
| `readFullyAsUTF8String(File)` | `Files.readString(file.toPath())` (UTF-8 default) | Java 11 |

Prefer passing a `java.nio.charset.Charset` (e.g. `StandardCharsets.UTF_8`)
rather than a charset name `String`. The `StreamHelper.BUFFER_SIZE` and
`StreamHelper.UTF8` constants are retained.

### `FileHelper` (class removed)

| Removed method | Modern replacement |
|---|---|
| `fileToUrl(File)` | `file.toURI().toURL()` (or NIO `path.toUri().toURL()`) |
| `urlToFile(URL)` | `new File(url.toURI())` (or NIO `Paths.get(url.toURI())`) |

### `ResourceHelper` (class removed)

| Removed method | Modern replacement |
|---|---|
| `getResourceAsFile(...)` | `clazz.getResourceAsStream(name).readAllBytes()` (Java 9+). Resolving a classpath resource to a `File` fails inside a JAR; open a zip `FileSystem` if a `Path` is genuinely required. |

### `StringCollectionToPrimitiveArray` (all conversion methods removed)

| Removed method | Modern replacement |
|---|---|
| `stringCollectionToStringArray` | `strings.toArray(String[]::new)` (Java 8+) |
| `stringCollectionToIntArray` | `strings.stream().mapToInt(Integer::parseInt).toArray()` (Java 8+) |
| `stringCollectionToLongArray` | `strings.stream().mapToLong(Long::parseLong).toArray()` (Java 8+) |
| `stringCollectionToDoubleArray` | `strings.stream().mapToDouble(Double::parseDouble).toArray()` (Java 8+) |
| `stringCollectionToByteArray` / `...ShortArray` / `...FloatArray` / `...BooleanArray` | no primitive stream exists; map via the Stream API to the boxed type (`Byte[]`, `Short[]`, `Float[]`, `Boolean[]`) and unbox, or keep an explicit loop |
| `stringCollectionToCharArray` | explicit loop; if every element is a single character, `String.join("", strings).toCharArray()` |

The `EMPTY_ARRAY_*` constants are retained.

##License
Code is under the [Apache Licence v2](https://www.apache.org/licenses/LICENSE-2.0.txt).
