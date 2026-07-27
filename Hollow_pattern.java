import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int temp=0;
        while(T-->0){
            temp++;
            System.out.println("Case #"+temp+":");
            int N=sc.nextInt();
            for(int i=0;i<N;i++){
                for(int j=0;j<=N*2;j++){
                    if(Math.abs(N/2-i)+Math.abs(N/2-j)==N/2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }
    }
}