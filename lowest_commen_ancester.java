import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int Q=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            for(int q=0;q<Q;q++){
                int u=sc.nextInt();
                int v=sc.nextInt();
                int lac=solve(arr,u,v,0,N);
                System.out.print(lac+" ");
            }
            System.out.println();

        }
    }
    public static int solve(int[] arr,int u, int v,int idx,int N){
        if(idx==N){
            return -1;
        }
        int min=Math.min(u,v);
        int max=Math.max(u,v);
        int ans=0;
            if(arr[idx] >=min &&arr[idx]<=max){
               return arr[idx];
            
        }
        return solve(arr,u,v,idx+1,N);
    }
}
//redo


// Lowest Common Ancestor bookmark_borderGiven an array of unique elements, construct a Binary Search Tree. Now, given two nodes u and v of the BST, find their Lowest Common Ancestor (LCA). LCA is defined as the furthest node from the root that is an ancestor for both u and v.

// Input Format
// The first line of input contains T - the number of test cases. The first line of each test case contains N, Q - the number of nodes in the BST and the number of queries. The next line contains N unique integers - value of the nodes. It is followed by Q lines, each containing 2 nodes of the tree, u and v.

// Output Format
// For each test case, for each query print the LCA of the given nodes u and v, separated by space. Separate the output of different test cases with a newline.

// Constraints
// 1 <= T <= 1000
// 1 <= N,Q <= 1000
// 0 <= ar[i] <= 10000

// Example
// Input
// 2
// 5 2
// 3 2 4 1 5
// 2 5
// 1 2
// 7 3
// 4 5 15 0 1 7 17
// 0 15
// 7 17
// 17 4

// Output
// 3 2
// 4 15 4

// Explanation

// Self Explanatory
