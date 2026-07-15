import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int I=sc.nextInt();
        int J=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        
        int[][] arr=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        int Sum=0;
        for(int i=I;i<=k;i++){
            for(int j=J;j<=l;j++){
                Sum+=arr[i][j];
            }
        }System.out.println(Sum);
        
    }
}