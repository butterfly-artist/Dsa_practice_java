import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=sc.next();
        String b=sc.next();
        String rot=a+a;
        if(rot.contains(b)){
            System.out.println("yes ");

        }else{
            System.out.println("no ");
        }
    }
}