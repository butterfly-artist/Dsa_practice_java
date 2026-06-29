import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int n=S.length();
        String even=new String();
        String odd=new String();
        char[] str=S.toCharArray();
        for(int i=0;i<n;i++){
            if(i%2==0){
                even=even+str[i];
            }else{
                odd=odd+str[i];
            }
        }System.out.println(odd+even);
    }
}