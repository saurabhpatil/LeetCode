/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.

Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
*/
public class Solution {
    public int[] Intersect(int[] nums1, int[] nums2) {
        IList<int> intersect = new List<int>();
        int[] nums = (nums1.Length > nums2.Length) ? nums2 : nums1;
        IList<int> compareList = (nums1.Length > nums2.Length) ? nums1.ToList() : nums2.ToList();
        foreach(int num in nums)
        {
            if(compareList.Contains(num)){
                compareList.Remove(num);
                intersect.Add(num);
            }
        }
        return intersect.ToArray();
    }
}