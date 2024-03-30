# Proxy Design Pattern Implementation (on Composite) 

## Overview

In this Proxy design pattern implementation (on the top of Composite), the `FSElement` class serves as the base class for both `Directory`,`Link` and `File` objects. The `Directory` class represents a directory, while the `File` class represents a file and `Link` class represents a link which the target for link is a FSElement. The `FileSystem` class manages the overall file system structure.

## Components

- `FSElement` (abstract): Base class for `Directory` and `File`.
- `Directory`: Represents a directory.
- `File`: Represents a file.
- `Link`: Represents a link.
- `FileSystem`: Manages the file system structure.

## Test Fixture Initialization

The `TestFixtureInitializer` class is responsible for creating a file system structure for testing.

## Unit Tests

The following unit tests should be implemented:

- `DirectoryTest`: Tests the `Directory` class.
- `FileTest`: Tests the `File` class.
- `FileSystemTest`: Tests the `FileSystem` class.
- `LinkTest`: Tests the `Link` class.

