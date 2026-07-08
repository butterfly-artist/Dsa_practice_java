import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int p1=1;
        while(p1<N-1){
            if(arr[p1-1]<arr[p1]){
                p1++;
            }else{
                break;
            }            
        }while(p1<N-1){
            if(arr[p1]>arr[p1+1]){
                p1++;
            }else{
                break;
            }
        }if(p1==N-1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}