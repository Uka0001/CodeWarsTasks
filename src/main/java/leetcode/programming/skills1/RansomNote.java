package leetcode.programming.skills1;
/*383. Ransom Note
Easy

3054

364

Add to List

Share
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true


Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
Accepted
571,318
Submissions
989,685*/

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

//        for (int i = 0; i < ransomNote.length(); i++) {
//            char r = ransomNote.charAt(i);
//
//            int matchingIndex = magazine.indexOf(r);
//
//            if (matchingIndex == -1) {
//                return false;
//            }
//            magazine = magazine.substring(0, i) + magazine.substring(i + 1);
//        }
//        return true;

        //Time complexity O(n * m)
        //Space complexity O(m)

        HashMap<Character, Integer> magazineLetters = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) { //k = 26
            char m = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, currentCount + 1);
        }
        //bounded by m
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(r, 0);

            if (currentCount == 0) {
                return false;
            }

            magazineLetters.put(r, currentCount - 1);
        }
        return true;

    }


    //Time complexity O(m)
    //Space complexity O(1)

    //Answer from Leet code
    /*
    int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
        */
}
