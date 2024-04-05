// 1. WAP to remove Duplicates from a String.(Take any String ex with duplicates
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "hello";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        char[] chars = str.toCharArray();
        
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : charSet) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}
// 2. WAP to print Duplicates characters from the String.
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original String: " + input);
        System.out.print("Duplicate characters: ");
        printDuplicateCharacters(input);
    }

    public static void printDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}

// 3. WAP to check if “2552” is palindrome or not.
public class IsPalindrome {

    public static boolean isPalindrome(String number) {
        int left = 0;
        int right = number.length() - 1;

        while (left < right) {
            if (number.charAt(left) != number.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String num = "2552";
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}

// 4. WAP to count the number of consonants, vowels, special characters in a String.
public class CharacterCounter {
    public static void main(String[] args) {
        String input = "Hello World! 123";
        countCharacters(input);
    }

    public static void countCharacters(String str) {
        int vowels = 0, consonants = 0, specialChars = 0;

        str = str.toLowerCase(); 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') { 
            } else {
                specialChars++; 
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + specialChars);
    }
}

// 5. WAP to implement Anagram Checking least inbuilt methods being used.
public class AnagramChecker {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[256]; 

        for (char c : str1.toCharArray()) {
            charCount[c]++;
        }

        for (char c : str2.toCharArray()) {
            charCount[c]--;
            if (charCount[c] < 0) { 
                return false;
            }
        }

        return true; 

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
}

// 6. WAP to implement Pangram Checking with least inbuilt methods being used.
public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(input);
        
        if (isPangram) {
            System.out.println("The string is a Pangram.");
        } else {
            System.out.println("The string is not a Pangram.");
        }
    }

    public static boolean checkPangram(String str) {
        boolean[] mark = new boolean[26];
        int index;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ('A' <= ch && ch <= 'Z') {
                index = ch - 'A';
            } 
            else if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
            } 
            else {
                continue;
            }
            mark[index] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        return true;
    }
}

// 7. WAP to find if String contains all unique characters.
public class UniqueCharacters {

    public static boolean hasAllUniqueChars(String str) {
      java.util.Set<Character> seen = new java.util.HashSet<>();
  
      for (char c : str.toCharArray()) {
        if (seen.contains(c)) {
          return false;
        }
        seen.add(c);
      }
  
      return true;
    }
  
    public static void main(String[] args) {
      String str1 = "hello"; 
      String str2 = "world"; 
  
      if (hasAllUniqueChars(str1)) {
        System.out.println(str1 + " has all unique characters.");
      } else {
        System.out.println(str1 + " does not have all unique characters.");
      }
  
      if (hasAllUniqueChars(str2)) {
        System.out.println(str2 + " has all unique characters.");
      } else {
        System.out.println(str2 + " does not have all unique characters.");
      }
    }
  }
  
// 8. WAP to find the maximum occurring character in a String.
import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String str = "hello world";
        char maxChar = findMaxOccurringChar(str);
        System.out.println("Maximum occurring character: " + maxChar);
    }

    public static char findMaxOccurringChar(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        char maxChar = '\0'; 
        int maxFrequency = Integer.MIN_VALUE; 
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return maxChar;
    }
}
