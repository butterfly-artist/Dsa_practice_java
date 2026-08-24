public static int hasPairWithDifference(int[] A, int N, int B) {
    Arrays.sort(A);
    int p1=0,p2=1,diff=0;
    boolean res=false;
    while(p2<N){
        if(p1==p2){
            p2++;
            continue;
        }
        diff=Math.abs(A[p2]-A[p1]);
        if(diff==B){
            res=true;
            break;
        }else if(diff>B){
            p1++;
            
        }else{
            p2++;
        }
    }
    if(res){
        return 1;
    }else{
        return 0;
    }
    
}
