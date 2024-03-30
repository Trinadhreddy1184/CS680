
# Visitor Design Pattern Implementation

## Overview

In this Visitor design pattern implementation (on the top of Composite), the `FSElement` class serves as the base class for both `Directory`, `Link`, and `File` objects. The `Directory` class represents a directory, while the `File` class represents a file, and the `Link` class represents a link, with the target for the link being an `FSElement`. The `FileSystem` class manages the overall file system structure.

## Components

- `FSElement` (abstract): Base class for `Directory`, `Link`, and `File`.
- `Directory`: Represents a directory.
- `File`: Represents a file.
- `Link`: Represents a link.
- `FileSystem`: Manages the file system structure.

## The following visitors are implemented:

- `CountingVisitor`: Counts elements in the file system.
- `FileCrawlingVisitor`: Crawls through files in the file system.
- `FileSearchVisitor`: Searches for specific files in the file system.
- `FSVisitor`: General visitor interface.

## Test Fixture Initialization

The `TestFixtureInitializer` class is responsible for creating a file system structure for testing.

## Unit Tests

The following unit tests should be implemented:

- `DirectoryTest`: Tests the `Directory` class.
- `FileTest`: Tests the `File` class.
- `FileSystemTest`: Tests the `FileSystem` class.
- `LinkTest`: Tests the `Link` class.

The following unit tests should be implemented for the visitors:

- `CountingVisitorTest`: Tests the `CountingVisitor` class.
- `FileCrawlingVisitorTest`: Tests the `FileCrawlingVisitor` class.
- `FileSearchVisitorTest`: Tests the `FileSearchVisitor` class.
- `FSVisitorFixture`: Fixture for creating visitor .

In this Visitor design pattern implementation, we have separated visitors into the `util` module and filesystem components into the `fs` module. Below is the directory structure:

```
src
└── main
    └── umbcs680
        └── hw08
            ├── fs
            │   ├── Directory.java
            │   ├── File.java
            │   ├── FileSystem.java
            │   └── Link.java
            │   └── FSElement.java
            └── util
                ├── CountingVisitor.java
                ├── FileCrawlingVisitor.java
                ├── FileSearchVisitor.java
                └── FSVisitor.java
└──test
    └── umbcs680
        └── hw08
            ├── fs
            │   ├── DirectoryTest.java
            │   ├── FileSystemTest.java
            │   ├── FileTest.java
            │   └── LinkTest.java
            └── util
                ├── CountingVisitorTest.java
                ├── FileCrawlingVisitorTest.java
                ├── FileSearchVisitorTest.java
                └── FSVisitorFixture.java
    
