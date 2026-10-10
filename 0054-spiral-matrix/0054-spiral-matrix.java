class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        // int []res=new int[m*n];
        // int inx=0;
        List<Integer> res=new ArrayList<>();
        int left=0,right=n-1;
        int top=0,bottom=m-1;


        while (top <= bottom && left <= right) {

            // 1. Left to right
            for (int j = left; j <= right; j++) {
                res.add(matrix[top][j]);
            }
            top++;

            // 2. Top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            // 3. Right to left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    res.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // 4. Bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}