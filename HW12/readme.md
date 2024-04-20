# Strategy Design Pattern Implementation for Comparators in FileSystem

## Overview

In this Strategy design pattern implementation, we have implemented various comparators for sorting elements in a file system based on different criteria such as alphabetical order, file size, timestamp, etc.

## Components

- `AlphabeticalComparator`: Implements a comparator for sorting elements alphabetically.
- `Directory`: Represents a directory in the file system.
- `File`: Represents a file in the file system.
- `FileSystem`: Manages the overall file system structure.
- `FSElement`: Represents a file system element (abstract base class).
- `Link`: Represents a symbolic link in the file system.
- `ReverseAlphabeticalComparator`: Implements a comparator for sorting elements in reverse alphabetical order.
- `ReverseSizeComparator`: Implements a comparator for sorting elements in reverse order of size.
- `SizeComparator`: Implements a comparator for sorting elements based on size.
- `TimestampComparator`: Implements a comparator for sorting elements based on timestamp.

## Unit Tests

The following unit tests should be implemented:

- `DirectoryTest`: Tests the `Directory` class.
- `FileTest`: Tests the `File` class.
- `FileSystemTest`: Tests the `FileSystem` class.
- `LinkTest`: Tests the `Link` class.

## Test Fixture Initialization

The `TestFixtureInitializer` class is responsible for initializing the file system structure for testing.


