/*
Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
*/

//Java does not have unsigned integers. It can only be represented in long
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        long num = n & 0xffffffffL;
        
        int bitSum = 0;
        while(num > 0)
        {
            bitSum += (num%2);
            num /= 2;
        }
        return bitSum;
    }
}