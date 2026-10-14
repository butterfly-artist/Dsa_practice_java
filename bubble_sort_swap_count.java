import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=1;i<N;i++){
                int key=arr[i];
                int j=i-1;
                while(j>=0&&arr[j]>key){
                    arr[j+1]=arr[j];
                    arr[j]=key;
                    j--;
                    count++;
                }
            }
            System.out.println(count);
        }
            
    }
}
1