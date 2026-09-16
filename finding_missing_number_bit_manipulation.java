import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            long ans=0;
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                ans^=arr[i];
                
            }
            for(int i=1;i<=N+1;i++){
                ans^=i;
            }
            System.out.println(Math.abs(ans));
        }
        
    }
}

// Finding Missing Number 
// given an array of size N, it contains all the numbers from 1 to N+1 inclusive, except one number. You have to find the missing number.

// Input Format
// The first line of input contains T - the number of test cases. It is followed by 2T lines, the first line of each test case contains N - size of the array and the next line contains N integers - the elements of the array.

// Output Format
// For each test case, print the missing number, separated by a new line.

// Constraints
// 1 <= T <= 500
// 1 <= N <= 10000
// 1 <= ar[i] <= N+1

// Example
// Input
// 3
// 8
// 1 2 7 9 5 6 3 8
// 7
// 3 5 8 1 4 7 2
// 10
// 8 11 10 2 7 4 3 5 1 6

// Output
// 4
// 6
// 9
