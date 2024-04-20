# Strategy Design Pattern Implementation for Comparators on Car

## Overview

In this Strategy design pattern implementation, we have implemented different comparators for sorting `Car` objects based on various criteria such as mileage, price, year, etc.

## Components

- `Car`: Represents a car object.
- `MileageComparator`: Implements a comparator for sorting cars based on mileage.
- `ParetoComparator`: Implements a comparator for sorting cars based on Pareto optimization.
- `PriceComparator`: Implements a comparator for sorting cars based on price.
- `YearComparator`: Implements a comparator for sorting cars based on manufacturing year.

## Unit Tests

The following unit tests should be implemented:

- `CarComparatorTest`: Tests the sorting functionality using different comparators.
- `CarTest`: Tests the `Car` class.
