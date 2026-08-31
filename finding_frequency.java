import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++){
            int x=sc.nextInt();
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        int Q=sc.nextInt();
        while(Q-->0){
            int k=sc.nextInt();
            if(hm.get(k)!=null){
            System.out.println(hm.get(k));
            }else{
                System.out.println(0);
            }
        }
               
    }
}