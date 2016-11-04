/*
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.

o(n) time complexity
*/

public class Solution {
    public int[] plusOne(int[] digits) {
        int[] d;
        int carry = 1, sum;
        
        for(int i=(digits.length-1);i>=0;i--)
        {
            sum = digits[i]+carry;
            digits[i] = (sum)%10;
            carry = (sum)/10;
            
            if(carry == 0)
                return digits;
        }
        
        if(carry == 1)
        {
            d = new int[digits.length+1];
            d[0] = carry;
            for(int i=1; i<d.length; i++)
                d[i] = digits[i-1];
            return d;
        }
        return digits;
    }
}