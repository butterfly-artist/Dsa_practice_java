import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] arr=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean flag=false;
        for(int i=1;i<N-1;i++){
            for(int j=1;j<M-1;j++){
                if(arr[i][j]==1){
                    if(arr[i-1][j-1]==0&&arr[i-1][j]==0&&
                    arr[i-1][j+1]==0&&arr[i][j-1]==0&&arr[i][j-1]==0
                    &&arr[i+1][j-1]==0&&arr[i+1][j]==0&&arr[i+1][j+1]==0){
                        System.out.println("Yes ");
                        return;
                     }
                }
            }
        }
            System.out.println("No ");
        
        
    }
}