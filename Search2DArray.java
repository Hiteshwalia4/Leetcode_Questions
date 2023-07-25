// Brute Force
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target)
                    return true;
            }
        }
        return false;
    }
}

// Binary Search
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,m=matrix.length,n=matrix[0].length,h=(n*m)-1;
        while(l<=h){
            int mid=(l+h)/2;
            if( matrix[mid/n][mid%n]==target)
                return true;
            else if( target > matrix[mid/n][mid%n] )
                l=mid+1;
            else
                h=mid-1;        
        }
     return false;   
    }
}
