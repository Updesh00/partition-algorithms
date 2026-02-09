# partition-algorithms
Lomuto and Hoare partition implementations in Java with unit tests.

## Overview
This project implements two classical partition algorithms used in QuickSort:
- Lomuto Partition Scheme
- Hoare Partition Scheme

Partitioning is a fundamental operation in divide-and-conquer sorting algorithms.
It rearranges elements in an array around a chosen pivot so that smaller elements
are placed on one side and larger elements on the other.

## What is Partition?
Partitioning does not fully sort an array. Instead, it divides the array into two
subproblems that can be solved recursively. This is the key idea behind QuickSort.

After partitioning:
- Elements on the left side are less than or equal to the pivot
- Elements on the right side are greater than or equal to the pivot

## Lomuto Partition Scheme
- Chooses the last element as the pivot
- Maintains a boundary index for elements smaller than the pivot
- Iterates once through the array and performs swaps as needed

**Characteristics:**
- Simple and easy to understand
- Performs more swaps
- Time complexity: O(n)

## Hoare Partition Scheme
- Chooses the first element as the pivot
- Uses two pointers moving from both ends toward the center
- Swaps elements that are on the wrong side of the pivot

**Characteristics:**
- More efficient with fewer swaps
- Pivot does not end in its final sorted position
- Time complexity: O(n)

## Unit Testing
JUnit tests are provided to validate correctness of both partition schemes.
The tests verify the partition property rather than exact ordering, since
partitioning does not guarantee full sorting.

Test cases include:
- A given unsorted array
- A sorted array
- An empty array

## Time Complexity
Partitioning runs in linear time O(n).
When used in QuickSort:
- Average case: O(n log n)
- Worst case: O(n²) when partitions are highly unbalanced

## Conclusion
This project demonstrates understanding of core sorting concepts,
algorithmic efficiency, and proper unit testing practices.

