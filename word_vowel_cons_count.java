import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        while(T-->0){
            String str=sc.nextLine();

            int countword=str.trim().isEmpty()?0: str.trim().split("\\s+").length;
            int countcon=0,countvov=0;
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                 if(((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    countvov++;
                }else{
                    countcon++;
                }
                 }
            }System.out.println(countword+" "+countvov+" "+countcon);
        }
        
    }
}
