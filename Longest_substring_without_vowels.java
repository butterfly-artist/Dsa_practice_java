import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('e');
        while(T-->0){
            String str=sc.next();
            int count=0,maxset=0;
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(set.contains(ch)){
                    maxset=Math.max(maxset,count);
                    count=0;
                }else{
                    count++;
                }
            }
            maxset=Math.max(maxset,count);
            System.out.println(maxset);
        }
    }
}
//exam prep break
