# Groovy's `collect()` Method and Null Values

This example demonstrates unexpected behavior of Groovy's `collect()` method when dealing with null values within the input list.  Standard approaches for null handling in other languages may not apply directly. The code shows how `collect()` passes null values through without an error, unlike some other languages which might throw a NullPointerException or return an empty list. The solution offers a safe approach to handle null list elements.

## Steps to Reproduce
1. Copy the `bug.groovy` code.
2. Execute the script using a Groovy interpreter (e.g., `groovy bug.groovy`).
3. Observe the output, paying attention to the handling of null list elements.

## Solution
The `bugSolution.groovy` script provides a safer implementation that addresses this potential issue by explicitly handling null elements before calling `collect()`. This improved function ensures robust behavior, prevents unexpected null propagation, and makes the code safer.
