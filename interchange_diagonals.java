import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] arr=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<N;j++){
            for(int i=j;i==j;i++){
                int temp=N-1-j;
                int stor=arr[j][i];
                arr[j][i]=arr[j][temp];
                arr[j][temp]=stor;
            }
            for(int i=0;i<N;i++){
                System.out.print(arr[j][i]+" ");
            }System.out.println();
        }
        
    }
}