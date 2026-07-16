import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int temp=0;
        while(T-->0){
            temp++;
            System.out.println("Test Case #"+temp+":");
            int N=sc.nextInt();
            int[][] arr1=new int[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<N;i++){
                for(int j=N-1;j>=0;j--){
                   System.out.print(arr1[j][i]+" ");
                }System.out.println();
            }
            
        }
        
    }
}