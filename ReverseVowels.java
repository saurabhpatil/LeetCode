/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".
*/

public class Solution {
    public String reverseVowels(String s) {
        char[] new_str = s.toCharArray();
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('A','a','e','E','i','I','o','O','u','U'));
        char temp;
        int st = 0, ed = s.length()-1;
        
        while(true)
        {
            while(st<=ed && !vowels.contains(new_str[st]))
                st++;

            while(ed >= st && !vowels.contains(new_str[ed]))
                ed--;

            if(st < ed)
            {
                temp = new_str[st];
                new_str[st] = new_str[ed];
                new_str[ed] = temp;
                st++;
                ed--;
            }
            else
                break;
        }
        return new String(new_str);
    }
}