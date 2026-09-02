import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        while(T-->0){
           int N=sc.nextInt();
           int K=sc.nextInt();
           Deque<Integer> dq=new ArrayDeque<>();
           int sum=0;
           int[] arr=new int[N];
           for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
           }
           for(int i=0;i<K;i++){
            while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
           }
           sum+=arr[dq.peekFirst()];
           for(int i=K;i<N;i++){
            if(!dq.isEmpty() && dq.peekFirst()==i-K){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
            sum+=arr[dq.peekFirst()];
           }
           System.out.println(sum);
        }
        
    }
}



// Window Maximum 
// Given an array of integers of size N and a window size K. For each continuous window of size K, find the highest element in the window. Output the sum of the highest element of all the windows.

// Input Format
// The first line of input contains T - number of test cases. It is followed by 2T lines, the first line contains N and K - the size of the array and the window size K. The second line contains N integers - the elements of the array.

// Output Format
// For each test case, print the sum of the highest element of all the windows of size K, separated by a newline.

// Constraints
// 30 points
// 1 <= T <= 1000
// 1 <= N <= 1000
// 1 <= K <= N
// -104 <= A[i] <= 104

// 70 points
// 1 <= T <= 1000
// 1 <= N <= 10000
// 1 <= K <= N
// -104 <= A[i] <= 104

// Example
// Input
// 2
// 7 3
// 4 10 54 11 8 7 9
// 4 2
// 11 15 12 9

// Output
// 182
// 42

// Explanation

// Example 1:
// Window [4 10 54] : maximum element = 54
// Window [10 54 11] : maximum element = 54
// Window [54 11 8] : maximum element = 54
// Window [11 8 7] : maximum element = 11
// Window [8 7 9] : maximum element = 9
// Total Sum = 54 + 54 + 54 + 11 + 9 = 182

// Example 2:
// Window [11 15] : maximum element = 15
// Window [15 12] : maximum element = 15
// Window [12 9] : maximum element = 12
// Total Sum = 15 + 15 + 12 = 42