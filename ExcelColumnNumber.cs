/*
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
*/

public class Solution {
    public int TitleToNumber(string s) {
        int mul = 1;
        int sum = 0;
        for(int i = s.Length-1; i>=0; i--)
        {
            sum += ((int)s[i] - 64) * mul;
            mul *= 26;
        }
        return sum;
    }
}