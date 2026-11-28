import java.io.*;
import java.util.*;
public class Main {
    static int mx=Integer.MIN_VALUE;
    static int mn=Integer.MAX_VALUE;
    static class Node{
        int data;
        Node left,right;
        Node(int val){
            this.left=null;
            this.data=val;
            this.right=null;
        }
    }
    public static Node insertBST(Node root,int val){
        if(root==null){
            return new Node(val);
        }if(val<root.data){
            root.left=insertBST(root.left,val);
        }else{
            root.right=insertBST(root.right,val);
        }return root;
    }
   
    public static void main(String[] args) {   
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] arr=new int[N];
            Node root =null;
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                root=insertBST(root,arr[i]);
            }
            Queue<Node> q=new ArrayDeque<>();
            q.add(root);
            while(q.size()!=0){
                int sz=q.size();
                for(int i=1;i<=sz;i++){
                    Node n=q.poll();
                    if(i==1){
                        System.out.print(n.data+" ");
                    }
                    if(n.left!=null){
                        q.add(n.left);
                    }if(n.right!=null){
                        q.add(n.right);
                    }
                }
            }System.out.println();
        }

    }
}




// Problem
// Submissions
// Left View of Tree 
// Given an array of unique elements, construct a Binary Search Tree and print the left-view of the tree. The left view of a tree is the set of nodes visible when the tree is viewed from the left side.

// Input Format
// The first line of input contains T - the number of test cases. It's followed by 2T lines. The first line of each test case contains N - the number of nodes in the BST. The next line contains N unique integers - value of the nodes.

// Output Format
// For each test case, print the left-view of the Binary Search Tree, separated by a newline.

// Constraints
// 1 <= T <= 1000
// 1 <= N <= 1000
// 0 <= ar[i] <= 10000

// Example
// Input
// 3
// 5
// 1 2 3 4 5
// 5
// 3 2 4 1 5
// 7
// 4 5 15 0 1 7 17

// Output
// 1 2 3 4 5
// 3 2 1
// 4 0 1 7

// Explanation

// Self Explanatory
