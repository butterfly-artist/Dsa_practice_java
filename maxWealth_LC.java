class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int m=accounts.length;
        for(int i=0;i<m;i++){
            int sum=0;
             int n=accounts[i].length;
            for(int j=0;j<n;j++){
                sum+=accounts[i][j];
            }
            if(max<sum){
                max=sum;
            }
        }
        return (max);
    }
}