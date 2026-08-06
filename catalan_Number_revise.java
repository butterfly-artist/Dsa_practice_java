import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        long res=1;
        if(T==0||T==1) {
            System.out.println(res);
            return;
        }
        for(int i=1;i<=T;i++){
            res=res*(T+i)/i;
        }System.out.println(res/(T+1));
       
    }
}
//cbd
//acb
