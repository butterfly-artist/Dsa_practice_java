import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String vov="aeiouAEIOU";
        int countc=0,countv=0;
        int n=S.length();
        
        for(int i=0;i<n;i++){
            char cha=S.charAt(i);
           // if(Character.isLetter(cha)){
            if(vov.contains(String.valueOf(cha))){
                countv++;
            }else{
                countc++;
            }
            //}
        }System.out.println(countv+" "+countc);
    }
}