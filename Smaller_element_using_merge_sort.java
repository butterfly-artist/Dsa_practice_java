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
            int[] temp=new int[N];
            long totalcount=mergesort(arr,temp,0,N-1);
            System.out.println(totalcount);
            
        }
        
    }
    public static long mergesort(int[] arr,int[] temp,int left,int right){
        long count=0;
        if(left<right){
           int  mid=left+(right-left)/2;
            count+=mergesort(arr,temp,left,mid);
            count+=mergesort(arr,temp,mid+1,right);
            count+=merge(arr,temp,left,mid,right);
        }return count;
        
    }
    public static long merge(int[] arr,int[] temp,int left,int mid,int right){
        int i=left,j=mid+1;
        int k=left;
        long count=0;
        while(i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
                count+=(mid-i+1);
            }k++;
        }
            while(i<=mid){
                temp[k]=arr[i];
                i++;
                k++;
            }
            while(j<=right){
                temp[k]=arr[j];
                j++;
                k++;
            }
                for(i=left;i<=right;i++){
                arr[i]=temp[i];
                }
            return count;

    }
}

// Smaller Elements 
// You are given an array of integers. For each element in the array, find the number of smaller elements on the right side and print the total count.

// Input Format
// The first line of input contains T - the number of test cases. It's followed by 2T lines, the first line contains N - the size of the array. The second line contains the elements of the array.

// Output Format
// For each test case, print the sum of count of smaller elements on right side of each element in the array, separated by new line.

// Constraints
// 30 points
// 1 <= N <= 103

// 70 points
// 1 <= N <= 105

// General Constraints
// 1 <= T <= 100
// -104 <= A[i] <= 104﻿

// Example
// Input
// 2
// 5
// 4 10 54 11 8
// 6
// 15 35 25 10 15 12

// Output
// 4
// 10

// Explanation

// Test Case 1
// Smaller Elements on right side of 4 : 0
// Smaller Elements on right side of 10 : 1
// Smaller Elements on right side of 54 : 2
// Smaller Elements on right side of 11 : 1
// Smaller Elements on right side of 8 : 0
// Total Count = 0 + 1 + 2 + 1 + 0 = 4

// Test Case 2
// Smaller Elements on right side of 15 : 2
// Smaller Elements on right side of 35 : 4
// Smaller Elements on right side of 25 : 3
// Smaller Elements on right side of 10 : 0
// Smaller Elements on right side of 15 : 1
// Smaller Elements on right side of 12 : 0
// Total Count = 2 + 4 + 3 + 0 + 1 + 0 = 10