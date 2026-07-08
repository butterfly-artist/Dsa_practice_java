import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]arr =new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int X=sc.nextInt();
        int p1=-1,p2=-1;
        for(int i=0;i<N;i++){
            if(p1==-1&&arr[i]==X){
                p1=i;
            }
            if(arr[i]==X){
                p2=i;
            }
        }
        System.out.println(p1+ " "+ p2);
    }
}