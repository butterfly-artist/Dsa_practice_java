    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float posnum=0,negnum=0,zeronum=0;
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)>0){
            posnum++;
        }else if(arr.get(i)<0){
            negnum++;
        }else{
            zeronum++;
        }
    }
    posnum/=arr.size();
    negnum/=arr.size();
    zeronum/=arr.size();
    System.out.printf("%.6f \n%.6f \n%.6f\n",posnum,negnum,zeronum);

    }