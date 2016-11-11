# Given numRows, generate the first numRows of Pascal's triangle.

# For example, given numRows = 5,
# Return
# 
# [
#      [1],
#     [1,1],
#    [1,2,1],
#   [1,3,3,1],
#  [1,4,6,4,1]
# ]

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        pascal = []
        for num in range(1, numRows+1):
            if num == 1:
                pascal.append([1])
            elif num == 2:
                pascal.append([1,1])
            else:
                lst = pascal[num-2]
                pascal.append([1]+[lst[i]+lst[i+1] for i in range(num-2)]+[1])
        return pascal
                