public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
   Collections.sort(arr);
    long sum=0, minsum=0,maxsum=0;
    for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
    }
    minsum=sum-Collections.max(arr);
    maxsum=sum-Collections.min(arr);
    System.out.println(minsum+" "+maxsum);
    }

