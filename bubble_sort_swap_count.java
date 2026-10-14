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
            int count=0;
            for(int i=1;i<N;i++){
                int key=arr[i];
                int j=i-1;
                while(j>=0&&arr[j]>key){
                    arr[j+1]=arr[j];
                    arr[j]=key;
                    j--;
                    count++;
                }
            }
            System.out.println(count);
        }
            
    }
}


// Bubble Sort 
// Bubble Sort and print the total number of swaps involved to sort the array.

// Input Format
// The first line of input contains T - the number of test cases. It's followed by 2T lines. The first line of each test case contains N - the size of the array. The next line contains N integers - the elements of the array.

// Output Format
// For each test case, print the total number of swaps, separated by a new line.

// Constraints
// 1 <= T <= 100
// 1 <= N <= 100
// -1000 <= ar[i] <= 1000

// Example
// Input
// 4
// 8
// 176 -272 -272 -45 269 -327 -945 176
// 2
// -274 161
// 7
// 274 204 -161 481 -606 -767 -351
// 2
// 154 -109

// Output
// 15
// 0
// 16
// 1

// Explanation

// Self Explanatory