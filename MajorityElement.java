/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> cnt = new HashMap<Integer,Integer>();
        int elem;
        for(int i=0;i<nums.length;i++)
        {
            elem = nums[i];
            if(!cnt.containsKey(elem)) cnt.put(elem,1);
            else cnt.put(elem, cnt.get(elem)+1);
            
            if(cnt.get(elem) > nums.length/2) return elem;
        }
        return -1;
    }
}