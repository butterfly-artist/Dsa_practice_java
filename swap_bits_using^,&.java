import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int even=0x55555555;
            int odd=0xAAAAAAAA;
            int tempeve=even&N;
            int tempodd=odd&N;
            int res=(tempeve<<1)^(tempodd>>1);
            System.out.println(res);
        }
    }
}