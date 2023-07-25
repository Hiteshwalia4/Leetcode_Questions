// https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        HashMap<Integer,Integer> h =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(target-nums[i])){
                res[1]=i;
                res[0]=h.get(target-nums[i]);
                return res;
            }
            h.put(nums[i],i);
        }
        return res;
    }
}
