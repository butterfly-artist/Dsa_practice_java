import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String t=sc.next();

        int j=0,i=0;
        while(j<t.length()){
            
            if((i<S.length())&&S.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else if(j>0&&t.charAt(j)==S.charAt(i-1)){
                j++;
            }else{
                System.out.println("false ");
                return;
            }

        }
        if(i==S.length()){
        
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}