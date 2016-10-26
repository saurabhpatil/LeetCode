# Given a roman numeral, convert it to an integer.

# Input is guaranteed to be within the range from 1 to 3999.

class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        sum = 0
        for idx,roman in enumerate(s):
            if roman == 'M':
                if idx !=0 and s[idx-1] == 'C':
                    sum -= 200
                sum += 1000
            elif roman == 'D':
                if idx != 0 and s[idx-1] == 'C':
                    sum -= 200
                sum += 500
            elif roman == 'C':
                if idx != 0 and s[idx-1] == 'X':
                    sum -= 20
                sum += 100
            elif roman == 'L':
                if idx != 0 and s[idx-1] == 'X':
                    sum -= 20
                sum+=50
            elif roman == 'X':
                if idx !=0 and s[idx-1] == 'I':
                    sum -= 2
                sum += 10
            elif roman == 'V':
                if idx != 0 and s[idx-1] == 'I':
                    sum -= 2
                sum += 5
            else:
                sum += 1
        return sum