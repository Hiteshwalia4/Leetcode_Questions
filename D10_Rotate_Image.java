// https://leetcode.com/problems/rotate-image/
class Solution {
    public void rotate(int[][] matrix) {
        int k=0,l=matrix.length-1;    
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }  
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(k<l){
                int temp=matrix[j][k];
                matrix[j][k]=matrix[j][l];
                matrix[j][l]=temp;
                } 
            }
                l--;
                k++;
        }
    }
}
