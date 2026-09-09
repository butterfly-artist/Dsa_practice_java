public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
    // Write your code here
    Collections.sort(A);
    Collections.sort(B,Collections.reverseOrder());
    int j=0;
    for(int i=0;i<A.size();i++){
        if(A.get(i)+B.get(i)>=k){
            j++;
        }
    }
    if(j==A.size()){
        return "YES";
    }else{
        return "NO";
    }
    }