import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    if(!sc.hasNext()){
	        return;
	    }
	    int T=sc.nextInt();
	    while(T-->0){
	        int N=sc.nextInt();
	        String str=sc.next();
	        int count=0;
	        boolean hard=false;
	        for(int i=0;i<N;i++){
	            char ch=str.charAt(i);
	        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	            count=0;
	            
	        }else{
	            count++;
	       
	        }if(count>=4){
	           hard=true;
	           break;
	        }}
	        if(hard){
	        System.out.println("NO");    
	        }else{
	            System.out.println("YES");
	        }
	    }

	}
}
