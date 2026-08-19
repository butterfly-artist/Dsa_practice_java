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
            int[] count=new int[K];
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
                count[((arr[j]%K)+K)%K]++;
            }
            int ans=0;
            for(int i=0;i<=K/2;i++){
                if(i==0||i==K-i){
                    if(count[i]>0) ans+=1;
                }else{
                    ans+=Math.max(count[i],count[K-i]);
                }
              
            }
            System.out.println(ans);
        }
    }
}


// Non Divisible Subsets 
// You are given an array of integers of size N and another integer K. 
// Find the size of the largest subset of the array in which the sum of any two numbers is not perfectly divisible by K.

// Input Format
// The first line of input contains T - the number of test cases.
//  It's followed by 2T lines, the first line contains N - the size of the array and K, separated by a space. 
//  The second line contains the elements of the array.

// Output Format
// For each test case, print the size of the largest subset in which the sum of any two numbers is not perfectly divisible by K, separated by a newline.

// Constraints
// 70 points
// 1 <= T <= 100
// 1 <= N <= 104
// 1 <= K <= 105
// 0 <= arr[i] <= 105

// Example
// Input
// 2
// 4 3
// 1 7 2 4 
// 5 2
// 1 2 3 4 5

// Output
// 3
// 2

// Explanation

// Test Case 1:
// The subset {1, 7, 4} is the largest subset with the sum of any two numbers { {1,7}=8, {1,4}=5, {7,4}=11 } not perfectly divisible by K=3.

// Test Case 2:
// The subset {1, 2} or {2, 3} or {3, 4} or {4, 5} can be the largest subset with the sum of any two numbers not perfectly divisible by K=2.