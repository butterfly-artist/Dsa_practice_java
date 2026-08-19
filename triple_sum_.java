import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            long X=sc.nextLong();
            boolean fount=false;
            long[] arr=new long[N];
            for(int i=0;i<N;i++){
                 arr[i]=sc.nextLong();
            }
            Arrays.sort(arr);
            for(int j=0;j<N-2;j++){
                int i=j+1;
                int k=N-1;
                long target=X-arr[j];
                while(i<k){
                    long curr=arr[i]+arr[k];
                    if(curr==target){
                        fount=true;
                        break;
                    }else if(curr<target){
                        i++;
                    }else{
                        k--;
                    }
                    
                }
              if(fount){
                break;
              }
            }
            System.out.println(fount);
        }
        
    }
}

// Triplet with Sum K 
// You are given an integer array and a positive integer K.
//  You have to tell if there exists i,j,k in the given array such that
//   ar[i]+ar[j]+ar[k]=K, i≠j≠k.
