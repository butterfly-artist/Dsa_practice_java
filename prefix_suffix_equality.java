import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String T=sc.next();
        int len1=S.length();
        int len2=T.length();
        String prefix=S.substring(0,len2);
        String sufix=S.substring(len1-len2,len1);
        if(T.equals(sufix) && prefix.equals(T)){
            System.out.println("Yes ");

        }else{
            System.out.println("No ");
        }
       // System.out.println(prefix+" "+sufix);
    }
}