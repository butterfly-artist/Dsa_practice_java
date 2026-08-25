import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    while(T-->0){
	        int N=sc.nextInt();
	        int[] arr=new int[N];
	        int k=sc.nextInt();
	        int sum=0;
	        for(int i=0;i<N;i++){
	            arr[i]=sc.nextInt();
	            if(arr[i]<=k&&(sum+arr[i]<=k)&&sum<k){
	                sum+=arr[i];
	                System.out.print("1");
	            }else{
	                System.out.print("0");
	            }
	        }System.out.println();
	    }
	}
}
