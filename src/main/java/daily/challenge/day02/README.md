# Problem
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?

# Solution
The `ProductArrayExceptSelf` class provides two methods to solve the problem of generating a new array where each element at index `i` is the product of all the numbers in the original array except the one at `i`. This is a common coding problem that tests understanding of array manipulation and optimization techniques.

### Method 1: Using Division
The `productArray` method calculates the product of all elements in the array and then creates the result array by dividing the total product by each element in the original array.

#### Explanation:
1. **Check Array Length:** If the array length is less than or equal to 1, it simply returns the original array because there are no other elements to compute the product.
2. **Calculate Total Product:** A variable `product` is initialized to 1. It then iterates through the array, multiplying each element to get the total product of all elements.
3. **Generate Result Array:** It iterates through the array again, and for each element, it divides the total product by the element to get the product of all other elements. This value is assigned to the corresponding position in the original array.

```java
int[] productArray(int[] nums){
    if(nums.length <= 1) return nums;
    int product = 1;
    for(int num : nums){
        product = product * num;
    }

    for (int i = 0; i < nums.length; i++) {
        nums[i] = product / nums[i];
    }

    return nums;
}
```

### Method 2: Without Using Division
The `productArrayWithoutDivision` method solves the problem without using division, thus avoiding any potential division by zero errors.

#### Explanation:
1. **Check Array Length:** Similar to the first method, it returns the original array if its length is 1 or less.
2. **Initialize Result Array:** A new array `result` is initialized to store the products.
3. **Compute Products:** It iterates through the array, and for each index, it calculates the product of all elements to the left and to the right of the current element using helper methods `leftProduct` and `rightProduct`. These products are then multiplied together to get the final product for each position.
    - `leftProduct(int[] nums, int end)`: Computes the product of elements from the start of the array up to (but not including) the specified end index.
    - `rightProduct(int[] nums, int start)`: Computes the product of elements from the specified start index to the end of the array.

```java
int[] productArrayWithoutDivision(int[] nums){
    if(nums.length <= 1) return nums;
    int[] result = new int[nums.length];
    int i = 0;
    while(i < nums.length) {
       result[i] =  leftProduct(nums, i) * rightProduct(nums, i+1);
       i++;
    }
    return result;
}

private int rightProduct(int[] nums, int start) {
    int product = 1;
    for (int i = start; i < nums.length; i++) {
        product *= nums[i];
    }
    return product;
}

private int leftProduct(int[] nums, int end) {
    int product = 1;
    for (int i = 0; i < end; i++) {
        product *= nums[i];
    }
    return product;
}
```

### Summary
- **Using Division:** Simpler and faster but can run into issues with division by zero.
- **Without Division:** Safer as it avoids division but requires additional loops to calculate left and right products, making it less efficient.
