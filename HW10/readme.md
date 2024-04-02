
# Command Design Pattern Implementation

## Overview

In this Command design pattern implementation (on the top of visitor), the `FSElement` class serves as the base class for both `Directory`, `Link`, and `File` objects. The `Directory` class represents a directory, while the `File` class represents a file, and the `Link` class represents a link, with the target for the link being an `FSElement`. The `FileSystem` class manages the overall file system structure.

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

### Command Design Pattern commands

- `Counting`: Command for counting elements in the file system.
- `FileCrawling`: Command for crawling through files in the file system.
- `FileSearch`: Command for searching for specific files in the file system.
- `FSCommand`: General command interface.

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

The following unit tests should be implemented for the commands:

- `CountingTest`: Tests the `Counting` class.
- `FileCrawlingTest`: Tests the `FileCrawling` class.
- `FileSearchTest`: Tests the `FileSearch` class.

In this Visitor design pattern implementation, we have separated visitors into the `util` module,commands into  `cmds` and filesystem components into the `fs` module. Below is the directory structure:

```
src
└── main
    └── umbcs680
        └── hw08
            ├── cmds
            │    ├── Counting.java
            │    ├── FileCrawling.java
            │    ├── FileSearch.java
            │    └── FSCommand.java
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
            ├── cmds
            │   ├── CountingTest.java
            │   ├── FileCrawlingTest.java
            │   └── FileSearchTest.java
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
    

