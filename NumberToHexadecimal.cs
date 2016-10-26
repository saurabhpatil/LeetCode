/*
Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.

Note:

All letters in hexadecimal (a-f) must be in lowercase.
The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
The given number is guaranteed to fit within the range of a 32-bit signed integer.
You must not use any method provided by the library which converts/formats the number to hex directly.
*/

public class Solution {
    public string ToHex(int num)
    {
        string hex = "";
        uint absNum = (uint)num;
        Console.WriteLine(absNum);
        if (absNum == 0)
            return "0";

        while (absNum != 0)
        {
            uint val = absNum % 16;
            if (val < 10)
            {
                hex = (char)(val + '0') + hex;
            }
            else
            {
                hex = (char)((val - 10) + 'a') + hex;
            }
            absNum = absNum >> 4;
            Console.WriteLine(absNum);
        }
        return hex;
    }
}