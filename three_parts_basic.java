import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        int totalsum=0;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            totalsum+=arr[i];
        }
        
        if(totalsum%3!=0){
            System.out.println("false ");
            return;
        }
        int targ=totalsum/3;
        int currsum=0;
        int count=0;
        for(int i=0;i<N;i++){
            currsum+=arr[i];
            if(currsum==targ){
                count++;
                currsum=0;
            }
        }if(count>=3){
            System.out.println("true ");
        }else{
            System.out.println("false ");
        }
    }
}