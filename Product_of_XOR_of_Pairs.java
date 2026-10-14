import java.io.*;
import java.util.*;

public class Main {
    public static final long mod=1000000007;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            long[] arr=new long[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            N=Math.min(N,3001);
            long sole=1;
            for(int i=0;i<N;i++){
                int j=i+1;
                while(j<N){
                    sole=((sole)*(arr[i]^arr[j]))%mod;
                    j++;
               }
            }
            System.out.println(sole);

        }
    }
}



// Product of XOR of Pairs 
// Given an array of size N, find the product of XOR of all good pairs in the array. A pair (A[i],A[j]) is called good only when 0 <= i < j < N.
// Since the product of good pairs might be too large, hence print product % 1e9+7.

// Input Format
// The first line of input contains T - number of test cases. The first line of each test case contains N - the size of the array.
// The second line of each test case contains the N elements.

// Output Format
// Print the product of XOR of all good pairs in the array.

// Constraints
// 30 points
// 2 <= N <= 103

// 70 points
// 2 <= N <= 105

// General Constraints
// 1 <= T <= 10
// 1 <= A[i] <= 3000

// Example
// Input
// 2
// 4
// 1 2 3 7
// 3
// 4 3 7

// Output
// 720
// 84

// Explanation

// Example 1: (1^2) * (1^3) * (1^7) * (2^3) * (2^7) * (3^7) = 720