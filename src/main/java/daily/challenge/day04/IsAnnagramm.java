package daily.challenge.day04;

import java.util.HashMap;
import java.util.Map;

public class IsAnnagramm {
    public boolean isAnagram(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) return false;
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!map1.containsKey(ch)) {
                return false;
            }
            map1.put(ch, map1.get(ch) - 1);
            if (map1.get(ch) == 0) {
                map1.remove(ch);
            }
        }
        // If the map is empty at the end, it's an anagram
        return map1.isEmpty();
    }

}