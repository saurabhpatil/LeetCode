# Given an integer, write a function to determine if it is a power of three.

# Follow up:
# Could you do it without using any loop / recursion?

class Solution(object):
    def isPowerOfThree(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n <= 0:
            return False
            
        # while num!=1:
        #     if (num%3) != 0:
        #         return False
        #     num /= 3
        # return True
        
        xlog = (int)(math.log(n)/math.log(3))
        return (math.pow(3, xlog)-n == 0) or (math.pow(3,xlog+1)-n == 0)