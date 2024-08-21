## IsAnnagramm

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
### Overview
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
```Java 
Example 1:

Input: s = "racecar", t = "carrace"

Output: true
```

The `IsAnnagramm` class provides a method to check if two input strings are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of another word or phrase, typically using all the original letters exactly once.

For example:
- "listen" and "silent" are anagrams.
- "triangle" and "integral" are anagrams.
- "hello" and "world" are not anagrams.

### Usage

The class contains a single public method:
```java
public boolean isAnagram(String s, String t)
```

#### Parameters:
- `s`: The first string to compare.
- `t`: The second string to compare.

#### Returns:
- `true` if `s` and `t` are anagrams of each other.
- `false` if they are not anagrams.

### Functionality

1. **Empty Strings**: The method returns `false` if either string is empty. Two empty strings are not considered anagrams.

2. **Length Check**: If the lengths of the two strings are not the same, they cannot be anagrams, and the method returns `false`.

3. **Frequency Map**: The method uses a `HashMap` to store the frequency of each character in the first string `s`. It then iterates through the second string `t`, adjusting the frequency of characters in the map. If any character in `t` doesn't exist in `s` or the frequency becomes inconsistent, the method returns `false`.

4. **Final Check**: If all characters have been processed and the frequency map is empty (i.e., all character frequencies have matched between `s` and `t`), the method returns `true`, indicating that the two strings are anagrams.

### Example Code

Here is an example of how to use the `IsAnnagramm` class:

```java
package daily.challenge.day04;

public class Main {
    public static void main(String[] args) {
        IsAnnagramm isAnnagramm = new IsAnnagramm();
        
        // Test cases
        System.out.println(isAnnagramm.isAnagram("listen", "silent"));   // true
        System.out.println(isAnnagramm.isAnagram("triangle", "integral")); // true
        System.out.println(isAnnagramm.isAnagram("hello", "world"));     // false
        System.out.println(isAnnagramm.isAnagram("rat", "car"));         // false
        System.out.println(isAnnagramm.isAnagram("aabbcc", "abccba"));   // true
    }
}
```

### Performance Considerations

The time complexity of this method is **O(n)** where `n` is the length of the strings `s` and `t` (since both strings must be iterated over once). The space complexity is also **O(n)** due to the usage of the `HashMap` to store character frequencies.

### Tests

JUnit test cases are included to verify the correctness of the implementation, covering:
- Valid anagrams
- Non-anagrams
- Empty strings
- Strings of different lengths
- Strings with the same characters but different frequencies
