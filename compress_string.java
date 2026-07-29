import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str+"#";
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            char ch=str.charAt(i);
            char cha=str.charAt(i+1);
            if(ch==cha){
                count++;
            }else{
                System.out.print(ch+""+count);
                count=1;
            }
        }
    }
}