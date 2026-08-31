import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long N=sc.nextLong();
            long l=-1000000,h=1000000,ans=0;
            while(l<=h){
                long mid=(l+h)/2;
                if(mid*mid*mid==N){
                    ans=mid;
                    break;
                }else if(mid*mid*mid>N){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }System.out.println(ans);
        }
    }
}

//given perfect cude root of a number N, find the cube root of N. If the cube root is not an integer, return 0.