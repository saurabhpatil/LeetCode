/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/


//The solution is to find the (n+1) fibonacci number 
public class Solution {
    public int climbStairs(int n) {
        int a=0, b=1, ways = 0;
        for(int i = 2; i<=n+1;i++)
        {
            ways = a+b;
            a=b;
            b=ways;
        }
        return ways;
    }
}