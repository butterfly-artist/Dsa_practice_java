import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int M=sc.nextInt();
        int[] B=new int[M];
        for(int i=0;i<M;i++){
            B[i]=sc.nextInt();
        }
        int p1=0,p2=0;
        while(p1<N&&p2<M){
            if(A[p1]>=B[p2]){
                System.out.print(B[p2]+" ");
                p2++;
            }else {
                System.out.print(A[p1]+" ");
                p1++;
            }
            
        }
        while(p2<M){
            System.out.print(B[p2]+" ");
            p2++;
        }
        while(p1<N){
            System.out.print(A[p1]+" ");
            p1++;
        
        }
    }
}