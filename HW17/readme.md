# Strategy Design Pattern Implementation for Comparators in FileSystem using Lambda Expressions. Replacing external iterators with internal iterators.

## Overview

In this Strategy design pattern implementation, we have implemented various comparators using lambda expressions for sorting elements in a file system based on different criteria such as alphabetical order, file size, timestamp, etc. Replacing external iterators with internal iterators using iterator.forEach() .

## Components

- `Directory`: Represents a directory in the file system.
- `File`: Represents a file in the file system.
- `FileSystem`: Manages the overall file system structure.
- `FSElement`: Represents a file system element (abstract base class).
- `Link`: Represents a symbolic link in the file system.

## Unit Tests

The following unit tests should be implemented:

- `DirectoryTest`: Tests the `Directory` class.
- `FileTest`: Tests the `File` class.
- `FileSystemTest`: Tests the `FileSystem` class.
- `LinkTest`: Tests the `Link` class.

## Test Fixture Initialization

The `TestFixtureInitializer` class is responsible for initializing the file system structure for testing.


