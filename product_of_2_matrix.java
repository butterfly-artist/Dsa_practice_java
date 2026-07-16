import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int[][] arr1=new int[N][M];
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }
            int N2=sc.nextInt();
            int M2=sc.nextInt();
            int[][] arr2=new int[N2][M2];
            int[][] res=new int[N][M2];
            for(int i=0;i<N2;i++){
                for(int j=0;j<M2;j++){
                    arr2[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<N;i++){
                for(int j=0;j<M2;j++){
                    for(int k=0;k<M;k++){
                        res[i][j]=res[i][j]+(arr1[i][k]*arr2[k][j]);
                    }
                }
            }
            for(int i=0;i<N;i++){
                for(int j=0;j<M2;j++){
                    System.out.print(res[i][j]+" ");
                }System.out.println();
            }
        }
        
    }
}