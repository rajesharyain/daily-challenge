# Bottleneck Analysis

1. **Time complexity**: The sum method's time complexity is of O(n), where n is the number of elements in the input array.
2. **Space Complexity**: The space complexity is `O(n)` due to the additional `HashMap` used to store the elements and their indices.
3. **Thread-Safety**: The current implementation is not thread-safe. If multiple threads access the `sum` method simultaneously, it could lead to inconsistent results.
4. **Edge Cases**: Edge cases like very large arrays might cause memory issues due to the `HashMap` size.
