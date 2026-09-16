import java.io.*;
import java.util.*;

public class Main {

    public static boolean checksum(int i, int j){
        return (((i>>j)&1)==1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }  
            int ans=0;         
           for(int i=0;i<N;i++){
            ans^=arr[i];
           }
           for(int i=1;i<=N-2;i++){
            ans^=i;
           }
           int j=0;
           while(((ans>>j)&1)==0){
            j++;
           }

           int setbucketA=0;
           int unsetbucketB=0;
           for(int i=0;i<N;i++){
            if(checksum(arr[i],j)){
                setbucketA^=arr[i];
            }else{
                unsetbucketB^=arr[i];
            }
           }

           for(int i=1;i<=N-2;i++){
             if(checksum(i,j)){
                setbucketA^=i;
            }else{
                unsetbucketB^=i;
            }
           }
           if(setbucketA<unsetbucketB){
            System.out.println(setbucketA+" "+unsetbucketB);
           }else{
            System.out.println(unsetbucketB+" "+setbucketA);
           }
        }
        
    }
}

// Repeated Numbers 
// you are given an array of N elements. All elements of the array are in range 1 to N-2. All elements occur once except two numbers, which occur twice. Your task is to find the two repeating numbers.

// Input Format
// The first line of input contains T - the number of test cases. It's followed by 2T lines, the first line contains N - the size of the array and second line contains the elements of the array.

// Output Format
// Print the 2 repeated numbers in sorted manner, for each test case, separated by new line.

// Constraints
// 30 points
// 1 <= T <= 100
// 4 <= N <= 103

// 70 points
// 1 <= T <= 100
// 4 <= N <= 106

// Example
// Input
// 2
// 8
// 1 3 2 3 4 6 5 5
// 10
// 1 5 2 8 1 4 7 4 3 6

// Output
// 3 5
// 1 4

// Explanation

// Self Explanatory