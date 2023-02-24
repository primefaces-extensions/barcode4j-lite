[![Maven](https://img.shields.io/maven-central/v/org.primefaces.extensions/barcode4j-lite.svg)](https://repo1.maven.org/maven2/org/primefaces/extensions/barcode4j-lite/)
[![Actions Status](https://github.com/primefaces-extensions/barcode4j-lite/workflows/Java%20CI/badge.svg)](https://github.com/primefaces-extensions/barcode4j-lite/actions)
[![Stackoverflow](https://img.shields.io/badge/StackOverflow-primefaces-chocolate.svg)](https://stackoverflow.com/questions/tagged/primefaces-extensions)
[![License: Apache](https://img.shields.io/badge/License-Apache%202.0-yellow.svg?style=flat-square)](https://opensource.org/licenses/Apache-2.0)


# Barcode4J Light

Barcode4J is a flexible generator for barcodes written in Java.  Forked from [Krysalis Barcode4J](http://barcode4j.sourceforge.net) 

[![Barcode4J Logo](http://primefaces-extensions.github.io/images/barcode4j-logo.gif)](http://barcode4j.sourceforge.net)

Original Website:  [http://barcode4j.sourceforge.net](http://barcode4j.sourceforge.net) 

This fork is because a version after 2015 was never put on Maven Central that fixes the following:
* All issues from 2.1 https://barcode4j.sourceforge.net/changes.html#version_2.1
* Updated to Java 8
* ZERO dependencies added (marked optional)

## Maven

```xml
<dependency>
    <groupId>org.primefaces.extensions</groupId>
    <artifactId>barcode4j-light</artifactId>
    <version>2.3.0</version>
</dependency>
```

## Issues

Please report all issues [here](https://github.com/primefaces-extensions/primefaces-extensions/issues).

## Releasing

- Run `mvn versions:set -DgenerateBackupPoms=false -DnewVersion=2.3.0` to update all modules versions
- Commit and push the changes to GitHub
- In GitHub create a new Release titled `2.3.0` to tag this release
- Run `mvn clean deploy -Prelease` to push to Maven Central

## Licenses

The original Barcode4J is licensed under the the Apache License, Version 2.0.
The license text can be found under legal/barcode4j.LICENSE.txt.
