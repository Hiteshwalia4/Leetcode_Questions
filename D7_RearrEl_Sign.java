// https://leetcode.com/problems/rearrange-array-elements-by-sign/

// Method 1
class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0)
                neg.add(nums[i]);
            else if(nums[i] > 0)
                pos.add(nums[i]);
        }
        int p=0,n=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                nums[i]=pos.get(p++);
            else
                nums[i]=neg.get(n++);    
        }
        return nums;
    }
}


// Method 2
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []arr = new int[nums.length];
        int k=1,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                arr[k]=nums[i];
                k=k+2;
            }
            else{
                arr[j]=nums[i];
                j=j+2;
            }
    }
        return arr;
}
}
