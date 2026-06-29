import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double mean=(double)sum/n;
        double temp;
        if(n%2==0){
         temp=(arr[n/2]+arr[(n/2)-1])/2.0;
        }else{
             temp=arr[n/2];
        }
        int mode=arr[0];
        int maxc=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                count=1;
            }if(count>maxc){
                maxc=count;
                mode=arr[i];
            }

        }System.out.printf("%.2f %.2f %d ",mean,temp,mode);

    }
}