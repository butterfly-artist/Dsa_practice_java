import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        while(T-->0){
           String str=sc.next();
           char ch='.';
           Map<Character,Integer> mp=new HashMap<>();
           char[] s=str.toCharArray();
           for(char c:s){
            mp.put(c,mp.getOrDefault(c,0)+1);
           }
           for(char c:s){
            if(mp.get(c)>=2)
           System.out.println(c);
           break;
           }
        }
        
    }
}

// First Repeating Character - 1 
// Given a string of characters, find the first repeating character.

// Input Format
// The first line of input contains T - the number of test cases. It's followed by T lines, each line contains a single string of characters.

// Output Format
// For each test case, print the first repeating character, separated by a new line. If there are none, print '.'.

// Constraints
// 1 <= T <= 1000
// 'a' <= str[i] <= 'z'
// 1 <= len(str) <= 104

// Example
// Input
// 4
// datastructures
// algorithms
// smartinterviews
// hackerrank

// Output
// a
// .
// s
// a

// Explanation

// Self Explanatory