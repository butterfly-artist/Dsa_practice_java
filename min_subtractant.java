import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long power2=1;
        while(power2*2<=N){
            power2*=2;
        } 
        long res=N - power2;
        System.out.println(res);
        
    }
}