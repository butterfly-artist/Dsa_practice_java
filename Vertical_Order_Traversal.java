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
    public static void func(Node root,int v,HashMap<Integer,ArrayList<Integer>> hm){
        if(root==null){
            return;
        }
        mx=Math.max(mx,v);
        mn=Math.min(mn,v);

        ArrayList<Integer> al=new ArrayList<>();
        if(hm.containsKey(v)){
            al=hm.get(v);
            al.add(root.data);
        }else{
            al.add(root.data);
        }
        hm.put(v,al);

        func(root.left,v-1,hm);
        func(root.right,v+1,hm);
    }
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] arr=new int[N];
            Node root=null;
             mx=Integer.MIN_VALUE;
             mn=Integer.MAX_VALUE;
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                root=insertBST(root,arr[i]);
            }

            HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
            func(root,0,hm);
            for(int i=mn;i<=mx;i++){
                ArrayList<Integer> lst=hm.get(i);
                Collections.sort(lst);
                for(int j=0;j<lst.size();j++){
                    System.out.print(lst.get(j)+" ");
                }System.out.println();

            }
            System.out.println();
        }
            
    }
}


// Vertical Order Traversal 
// Given an array of unique elements, construct a Binary Search Tree and print the tree in a Vertical Order, starting from the left-most node. Print the nodes in each vertical in sorted order.

// Input Format
// The first line of input contains T - the number of test cases. It's followed by 2T lines. The first line of each test case contains N - the number of nodes in the BST. The next line contains N unique integers - value of the nodes.

// Output Format
// For each test case, print the Vertical Levels of the Binary Search Tree, separate each level by newline. Separate the output of different test cases with an extra newline.

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
// 3 1 2 5 4
// 7
// 4 5 15 0 1 7 17

// Output
// 1
// 2
// 3
// 4
// 5

// 1
// 2 3 4
// 5

// 0
// 1 4
// 5 7
// 15
// 17

// Explanation

// Self Explanatory
