/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
*/
public class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
        int maxSum=0, maxOdd = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!charMap.containsKey(c))  charMap.put(c,1);
            else charMap.put(c, charMap.get(c)+1);
            
            if(charMap.get(c)%2==0) maxSum += 2;
        }
        for(int val : charMap.values())
        {
            if(val%2!=0){
                maxSum+=1;
                break;
            }
        }
        return maxSum;
    }
}