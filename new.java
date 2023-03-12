class Solution {
    public int[] findMaxRow(int mat[][], int N) {
        // code here
       int[] ans = new int[]{0, 0};
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                count += mat[i][j];
            }
            if (count > ans[1]) {
                ans = new int[]{i, count};
            }
        }
        return ans;
    }
};
