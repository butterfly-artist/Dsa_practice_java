import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        char[] a=A.toCharArray();
        char[] b=B.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("TRUE ");
        }else{
            System.out.println("FALSE ");
        }
    }
}