import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Set<Character> set=new HashSet<>();
        set.add('a');     
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        while(T-->0){
            int N=sc.nextInt();
            sc.nextLine();
            String str=sc.next();
            char[] ch=str.toCharArray();
             int c=0,l=0,r=0,ans=0;
            for(int i=0;i<str.length();i++){
                if(set.contains(ch[i])){
                        c++;
                }
                while(c>N){
                    if(set.contains(ch[l])){
                        c--;
                    }
                    l++;
                }
                    ans=Math.max(ans,i-l+1);
                    r++;
                }
            System.out.println(ans);
        }
        
    }
}

// Longest Substring with Max K Vowels 
// Given a string S and an integer K, print the length of the longest substring which contains at most K vowels.

// Input Format
// The first line of input contains T - the number of test cases. It is followed by 2T lines, the first line contains K - the max number of vowels and the second line contains a string of size N.

// Output Format
// For each test case, print the length of the longest substring which contains at most K vowels, separated by newline.

// Constraints
// 10 points
// 1 <= N <= 102

// 20 points
// 1 <= N <= 103

// 70 points
// 1 <= N <= 104

// General Constraints
// 1 <= T <= 100
// 0 <= K <= N
// 'a' <= s[i] <= 'z'

// Example
// Input
// 3
// // 2
// smartinterviews
// 1
// algorithms
// 2
// searching

// Output
// 8
// 6
// 7

// Explanation

// Test Case 1:
// We have 2 substrings of length 8 which have at most 2 vowels: "smartint", "rtinterv"

// Test Case 2:
// We have a substring of length 6 which has at most 1 vowel: "rithms"

// Test Case 3:
// We have a substring of length 7 which has at most 2 vowels: "arching"