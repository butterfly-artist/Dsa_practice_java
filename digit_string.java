import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String T=sc.next();
        int count=0;
        for(int i=0;i<T.length();i++){
            char ch=T.charAt(i);
            if(Character.isDigit(ch)){
                count++;
            }
        }if(count==T.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}