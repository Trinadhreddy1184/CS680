# Strategy Design Pattern Implementation for Color Adjustment using Lambda Expressions

## Overview

This implementation demonstrates the Strategy design pattern using lambda expressions to apply various color adjustments to images. It provides a flexible way to define and apply different color adjustment algorithms without modifying the core image processing logic.

## Components

- `Image`: Represents an image with dimensions (width, height) and a 2D array of Color objects representing pixels.
- `Color`: Represents a color with red, green, and blue components.
- `ColorAdjuster` (Interface): Defines the `adjust(Color color)` method, which takes a Color object and returns a modified Color based on the specific adjustment algorithm.
- `Images` (Utility Class): Provides the `transform(Image image, ColorAdjuster adjuster)` method, which applies the given ColorAdjuster to each pixel of an image, creating a new adjusted image.

## Concrete ColorAdjuster Implementations (Examples):

- `GrayScaleAdjuster`: Converts a color to grayscale by averaging its red, green, and blue components.
- `InvertAdjuster`: Inverts the colors of a pixel.

## Unit tests:

- `ImageTest`: Unit tests `Image` class.
