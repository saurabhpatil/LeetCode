class Solution(object):
    def trailingZeroes(self, n):
        """
        :type n: int
        :rtype: int
        """
        zero = 0
        if n>0:
            while(n>=5):
                zero += (n/5)
                n /= 5
        return zero