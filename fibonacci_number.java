import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N==0){ System.out.println(0); return;}
        if(N==1){ System.out.println(1); return;}
        int curr=0,prev2=0,prev1=1;
        for(int i=2;i<=N;i++){
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
            
        }
        System.out.println(curr);
        
    }
}
// do again
