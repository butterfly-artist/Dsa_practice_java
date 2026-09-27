class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] fre=new int[101];
        for(int i:nums){
            fre[i]++;
        }
        int[] ans=new int[nums.length];
        int index=0;
        while(index<nums.length){
            for(int i=1;i<=100;i++){
                if(fre[i]>0){
                    ans[index++]=i;
                    fre[i]--;
                }
            }
        }
        return ans;
    }
}©leetcode
