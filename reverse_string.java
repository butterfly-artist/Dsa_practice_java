import java.io.*;
import java.util.*;

public class Main {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        //char[] cha=str.toCharArray();
        for(int i=0;i<n;i++){
            char cha=str.charAt(i);
            char ch=str.charAt(n-i-1);
            swap(cha,ch);
        }
        //str=cha.toString();
        System.out.println(str);
    }
}