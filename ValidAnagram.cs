/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
*/
public class Solution {
    public bool IsAnagram(string s, string t) {
        IList<char> tChar = t.ToCharArray().ToList();
        IList<char> sMatch = new List<char>();
        foreach(char chr in s)
        {
            if(tChar.Contains(chr))
            {
                tChar.Remove(chr);
                sMatch.Add(chr);
            }
        }
        if(tChar.Count != 0 || sMatch.Count != s.Length) return false;
        else return true;
    }
}