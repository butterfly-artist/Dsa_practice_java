import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        while(T-->0){
           int N=sc.nextInt();
           int[] arr=new int[N];
           for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
           }
           long maxArea=0,area=0;
           int[] right=new int[N];
           int[] left=new int[N];

           lnextSmaller(arr,left,N);
           rnextSmaller(arr,right,N);
           for(int i=0;i<N;i++){
            area=(long)(right[i]-left[i]-1)*arr[i];
            maxArea=Math.max(maxArea,area);
           }
           System.out.println(maxArea);
        }
        
    }
    public static void lnextSmaller(int[] arr,int[] left,int N){
        Arrays.fill(left,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=N-1;i>=0;i--){
            while(st.size()!=0 && arr[st.peek()]>arr[i]){
                left[st.pop()]=i;
               
            }st.push(i);
        }
    }
    public static void rnextSmaller(int[] arr,int[] right,int N){
        Arrays.fill(right,N);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<N;i++){
            while(st.size()!=0 && arr[st.peek()]>arr[i]){
                right[st.pop()]=i;
               
            }st.push(i);
        }
    }
}


// partially solved

// Rectangular Area Under Histogram 
// Given the height of adjacent buildings, find the largest rectangular area possible, where the largest rectangle can be made of a number of contiguous buildings. For simplicity, assume that all buildings have the same width and the width is 1 unit.
// Note that the sides of the rectangle have to be parallel to the axes.

// Input Format
// The first line of input contains T - the number of test cases. It is followed by 2T lines - the first line contains N - the number of buildings. The second line contains the height of the buildings.

// Output Format
// For each test case, print the area of the largest possible rectangle, separated by a newline.

// Constraints
// 50 points
// 1 <= T <= 100
// 1 <= N <= 103
// 1 <= A[i] <= 1000

// 100 points
// 1 <= T <= 100
// 1 <= N <= 105
// 1 <= A[i] <= 104

// Example
// Input
// 2
// 16
// 5 4 5 4 3 2 5 5 6 7 1 3 4 3 3 3
// 4
// 5 11 12 4

// Output
// 20
// 22

// Explanation

// Example 1:

// The maximum rectangular area is obtained by selecting the highlighted buildings (5, 5, 6, 7), corresponding to the indices 6 to 9. The area is calculated as 5 * 4 = 20. [a * b means rectangle with height a and width b]

// Example 2:
// The maximum rectangular area is obtained by selecting the buildings of indices 1 and 2. The area is calculated as 11 * 2 = 22. [a * b means rectangle with height a and width b]