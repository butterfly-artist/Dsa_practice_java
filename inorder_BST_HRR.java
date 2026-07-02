import java.io.*;
import java.util.*;

 class Node{
    int data;
    Node left=null;
    Node right=null;
    Node(int val){
        this.data=val;
        
    }
}
public class Solution {
    public static Node Insert(Node root, int val){
        if(root==null){
            return new Node(val);
        }if(val<root.data){
            root.left=(Insert(root.left,val ));
            
        }else{
            root.right=(Insert(root.right, val));
            
        }return root;
    }
    public static void Inorder(Node root){
        if(root==null){
            return ;
        }
        Inorder(root.left);
        
        System.out.print(root.data+" ");
        
        Inorder(root.right);
    }

    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
    
        if (!scan.hasNextInt()) return;
        int t = scan.nextInt();
        
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = Insert(root, data);
        }
        scan.close();
        
        Inorder(root);

    }
}
