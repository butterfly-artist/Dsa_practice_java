import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Year=sc.nextInt();
        if(((Year%4==0)&&(Year%100!=0))||(Year%400==0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}