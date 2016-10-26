# Given an array of integers, find if the array contains any duplicates. Your function should return true 
# if any value appears at least twice in the array, and it should return false if every element is distinct.

# The focus in this problem is on efficiency. Using a list instead of dictionary can also solve the problem.
# However, it is worth noting that python checks elements in List by o(n) complexity 
# where as for dictionary it navigates the indexed keys thus executing much faster

class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        check = {}
        for num in nums:
            if num not in check:
                check[num] = 1
            else:
                return True
        return False