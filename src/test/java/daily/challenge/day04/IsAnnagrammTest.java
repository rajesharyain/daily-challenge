package daily.challenge.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsAnnagrammTest {
    private IsAnnagramm isAnnagramm;

    @BeforeEach
    void setUp() {
        isAnnagramm = new IsAnnagramm();
    }

    @Test
    void testValidAnagrams() {
        assertTrue(isAnnagramm.isAnagram("listen", "silent"), "listen and silent are anagrams");
        assertTrue(isAnnagramm.isAnagram("triangle", "integral"), "triangle and integral are anagrams");
        assertTrue(isAnnagramm.isAnagram("anagram", "nagaram"), "anagram and nagaram are anagrams");
    }

    @Test
    void testInvalidAnagrams() {
        assertFalse(isAnnagramm.isAnagram("hello", "world"), "hello and world are not anagrams");
        assertFalse(isAnnagramm.isAnagram("tess", "sett"), "tess and sett are not anagrams");
        assertFalse(isAnnagramm.isAnagram("rat", "car"), "rat and car are not anagrams");
    }

    @Test
    void testDifferentLengths() {
        assertFalse(isAnnagramm.isAnagram("abc", "abcd"), "Strings of different lengths cannot be anagrams");
    }

    @Test
    void testEmptyStrings() {
        assertFalse(isAnnagramm.isAnagram("", ""), "Empty strings should not be considered anagrams");
        assertFalse(isAnnagramm.isAnagram("abc", ""), "One empty string cannot be an anagram of a non-empty string");
    }

    @Test
    void testSameCharactersDifferentFrequencies() {
        assertFalse(isAnnagramm.isAnagram("aabbcd", "abccba"));
    }
}