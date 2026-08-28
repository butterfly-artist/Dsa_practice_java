import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    long n=sc.nextLong();
		    long m=sc.nextLong();
		    if(m>=n&&m<=n*3&&(m-n)%2==0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}

