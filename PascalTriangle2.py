# Given an index k, return the kth row of the Pascal's triangle.
#
# For example, given k = 3,
# Return [1,3,3,1].
#
# Note:
# Could you optimize your algorithm to use only O(k) extra space?

class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        ps = []
        for num in range(rowIndex+1):
            if num <= 1:
                ps.append(1)
            else:
                lst = ps[:]
                del ps[:]
                ps = [1]+[lst[i-1]+lst[i] for i in range(1,num)]+[1]
        return ps