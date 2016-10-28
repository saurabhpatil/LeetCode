class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        chars = {}
        for i in range(len(s)):
            if s[i] not in chars:
                chars[s[i]] = 1
            else:
                chars[s[i]] = chars[s[i]]+1
        
        for c in s:
            if chars[c] == 1:
                return s.index(c)
        return -1