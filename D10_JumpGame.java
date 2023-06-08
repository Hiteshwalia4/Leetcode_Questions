// https://leetcode.com/problems/jump-game/
// j=goal here
class Solution {
    public boolean canJump(int[] nums) { 
        int j=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
            if(  i+nums[i] >=j)
                j=i;  
        
        if(j==0) return true;
        return false;
}
}
