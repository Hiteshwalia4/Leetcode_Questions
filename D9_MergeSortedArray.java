// https://leetcode.com/problems/merge-sorted-array/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] temp = new int[nums1.length];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                temp[k++]=nums1[i++];
            }
            else{
                temp[k++]=nums2[j++];
            }
        }
        while(i<m){
            temp[k++]=nums1[i++];
            }
        while(j<n){
            temp[k++]=nums2[j++];
        }
        for(int q=0;q<nums1.length;q++) nums1[q]=temp[q];
    }
    }
