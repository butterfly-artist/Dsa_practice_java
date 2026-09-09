 public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
    long[] diff=new long[n+2];    
    for(int i=0;i<queries.size();i++){
       
        int start =queries.get(i).get(0)-1;
        int end=queries.get(i).get(1);
        long value=queries.get(i).get(2);
        diff[start]+=value;
        diff[end]-=value;
    }
    long curr=0,max=0;
    for(int i=0;i<n;i++){
        curr+=diff[i];
        max=Math.max(curr,max);
    }
    return max;
    }