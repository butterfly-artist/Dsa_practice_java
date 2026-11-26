import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int[] B=new int[N+1];
            Arrays.fill(B,-1);
            for(int i=0;i<N;i++){
                if(arr[i]>=1&&arr[i]<=N){
                    B[arr[i]]=1;
                  
                }
                
            }
            int ans=N+1;
            for(int i=1;i<=N;i++){
               if(B[i]==-1){
                ans=i;
                break;
               }
            }
            System.out.println(ans);
            }
        }
    }


// First Missing Positive Integer 
// You are given an array of integers of size N. Find the first positive integer that is missing from the array.

// Note: 
//  Try solving in O(N) time without using any additional space, except the input array.  Input Format
// The first line of input contains T - the number of test cases. For each test case, the first line contains one integer N - the size of the array. The second line contains N integers - the elements of the array.

// Output Format
// For each test case, print the first missing positive integer, separated by a newline.

// Constraints
// 1 <= T <= 100
// 1 <= N <= 105
// -105 <= A[i] <= 105

// Example
// Input
// 2
// 5
// 2 0 1 5 -3
// 6
// 2 -7 3 1 8 -1

// Output
// 3
// 4

// Explanation

// Example 1: The first missing positive integer is 3, as 1 and 2 are present in the array.
