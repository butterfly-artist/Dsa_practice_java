import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        while(T-->0){
            String str=sc.next();
            String str2=sc.next();
             boolean found=false;

            if(str.length()==str2.length()){
            char[] ch1=str.toCharArray();
            char[] ch2=str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            found=Arrays.equals(ch1,ch2);
            }
            if(found){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
            
        }
    } //exam
}
//cbd
//acb
