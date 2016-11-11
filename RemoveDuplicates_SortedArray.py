'''
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
'''
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) <= 1:
            return len(nums)
        
        st = 0
        ed = 1
        while st < len(nums) - 1:
            if nums[st] == nums[ed]:
                if ed < len(nums) - 1:
                    ed += 1
                else:
                    break
            else:
                nums[st+1] = nums[ed]
                st += 1
        return st+1