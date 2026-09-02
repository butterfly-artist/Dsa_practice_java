import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            sc.nextLine();
            String str=sc.next();
            int ans=0;
            char[] str1=str.toCharArray();
            for(int i=0;i<N;i++){
                int curr1=Longestpal(i,i,N,str1);
                int curr2=Longestpal(i,i+1,N,str1);
                ans=Math.max(ans,(Math.max(curr1,curr2)));
                
            }
            System.out.println(ans);
        }
    }
    public static int Longestpal(int l,int r,int N,char[] str){
        int ans=0;
        while(l>=0 && r<N && str[l]==str[r]){
            ans=r-l+1;
            r++;
            l--;
        }return ans;
    }
    
}

// Longest Palindromic Substring 
// Given a string, find the length of the Longest Palindromic Substring (LPS).

// Input Format
// The first line of input contains T - the number of test cases. It's followed by 2T lines. The first line has N - the size of the string and the second line contains a string of size N.

// Output Format
// Print the length of the LPS for each test case, separated by a new line.

// Constraints
// 30 points
// 1 <= T <= 200
// 1 <= len(S) <= 100
// 'a' <= S[i] <= 'z'

// 70 points
// 1 <= T <= 200
// 1 <= len(S) <= 103
// 'a' <= S[i] <= 'z'

// General Constraints
// 'a' <= S[i] <= 'z'

// Example
// Input
// 5
// 8
// pfyafafd
// 9
// sllwffoqq
// 6
// yoogvb
// 4
// hcch
// 23
// mzmqnnrkurfmmfrukrnnqsm

// Output
// 3
// 2
// 2
// 4
// 18

// Explanation

// Self Explanatory