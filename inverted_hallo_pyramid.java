import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){

            for(int j=0;j<T-i;j++){
                
                if (j==0||i==0||j==T-i-1){
                    System.out.print("* ");
            
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
}
