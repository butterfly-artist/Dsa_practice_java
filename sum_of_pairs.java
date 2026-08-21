import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long N=sc.nextLong();
            long X=sc.nextLong();
            boolean fount=false;
             Set<Long> set=new HashSet<>();
            for(long i=0;i<N;i++){
                long num=sc.nextLong();
                long target=X-num;
                if(set.contains(target)){
                    fount=true;
                }
                set.add(num);
            }
            if(fount){
            System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        //ne3ed changes
    }
}
// accepted solution for sum of pairs problem
