/*
	Swap each pair of unique vowels in the string.
	Example, "i am here on boat"
			 "a im here on baot"
*/

public class Solution {
    public String reverseVowels(String s) {
        char[] new_str = s.toCharArray();
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('A','a','e','E','i','I','o','O','u','U'));
        int v_idx = -1;
        char temp;
        
        for(int i=0; i<s.length(); i++)
        {
            if(vowels.contains(new_str[i]))
            {
                if(v_idx == -1 || (new_str[i] == new_str[v_idx]))
                    v_idx = i;
                else
                {
                    temp = new_str[i];
                    new_str[i] = new_str[v_idx];
                    new_str[v_idx] = temp;
                    v_idx = -1;
                }
            }
        }
        return new String(new_str);
    }
}