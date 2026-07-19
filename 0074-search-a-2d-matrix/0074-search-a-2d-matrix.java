class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;    //no of rows
        int n = matrix[0].length;   //no of columns

        int top = 0;
        int bottom = m-1;
        int validRow = -1;
        while(top<=bottom)
        {
            int mid = top+(bottom-top)/2;
            if(matrix[mid][0]<=target && matrix[mid][n-1]>=target)
            {
                validRow = mid;
                break;
            }else if(matrix[mid][0]>target)
            {
                bottom = mid-1;
            }else{
                top = mid+1;
            }
        }

        if(validRow==-1) return false;

        int low = 0;
        int high = matrix[validRow].length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(matrix[validRow][mid]==target)
            {
                return true;
            }else if(matrix[validRow][mid]>target)
            {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return false;

    }
}