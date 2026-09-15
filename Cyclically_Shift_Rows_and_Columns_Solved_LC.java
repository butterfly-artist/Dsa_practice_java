class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int newj=(j-rowShift[i]+n)%n;
                arr[i][newj]=grid[i][j];
            }
        }
        int[][] fina=new int[n][n];
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                int newi=(i-colShift[j]+n)%n;
                fina[newi][j]=arr[i][j];
            }
        }
        return fina;
    }
}
//©leetcode
