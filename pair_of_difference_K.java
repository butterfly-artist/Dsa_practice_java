import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] arr=new int[N];
            int K=sc.nextInt();
            K=Math.abs(K);
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int p1=0,p2=1;
            boolean res=false;
            Arrays.sort(arr);
            while(p2<N){
                if(p1==p2){
                    p2++;
                    continue;
                }
                int diff=arr[p2]-arr[p1];
                if(K==diff){
                    res=true;
                    break;
                }else if(diff>K){
                    p1++;
                }
                else{
                    p2++;
                }
            }System.out.println(res);
        }
    }
}

// Pair with Difference K 
// You are given an integer array and an integer K.
//  You have to tell if there exists a pair of integers in the given array such that ar[i]-ar[j]=K and i≠j.

// Input Format
// The first line of input contains T - the number of test cases
// . It's followed by 2T lines, the first line contains N and K - the size of the array and the number K.
//  The second line contains the elements of the array.

// Output Format
// For each test case, print "true" if the arrays contains such elements, "false" otherwise, separated by new line.
// General Constraints
// 1 <= T <= 100
// -105 <= ar[i], K <= 105

// Example
// Input
// 2
// 5 60
// 1 20 40 100 80
// 10 11
// 12 45 52 65 21 645 234 14 575 112

// Output
// true
// false