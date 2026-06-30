import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        long sum=0;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }if(sum%2==1){
            System.out.println("False ");
            return;
        }
        boolean flag=false;
        long targ=sum/2;
        int curr=0;
        int count=0;
        for(int i=0;i<N;i++){
            curr+=arr[i];
            if(curr==targ){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("True ");
        }else{
            System.out.println("False ");
        }
    }
}