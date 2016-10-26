/*
Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/
public class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0, idx1 = num1.length()-1, idx2 = num2.length()-1;
        int sum=0, x=0, y=0;
        StringBuilder result = new StringBuilder(); 
        while(idx1>=0 || idx2>=0)
        {
            x = idx1>=0 ? Character.getNumericValue(num1.charAt(idx1)) : 0;
            y = idx2>=0 ? Character.getNumericValue(num2.charAt(idx2)) : 0;
            sum = x + y + carry;
            
            if(sum > 9)
            {
                result.insert(0,(sum%10));
                carry = 1;
            }
            else{
                result.insert(0,sum);
                carry=0;
            }
            idx1--;
            idx2--;
        }
        if(carry!=0) result.insert(0,1);
        return result.toString();
    }
}