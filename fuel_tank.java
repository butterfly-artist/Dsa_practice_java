import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mainTank=sc.nextInt();
        int AddTank=sc.nextInt();
        int totalfuel=0;
        while(mainTank>=5){
            mainTank-=5;
            totalfuel+=5;
            if(AddTank>=1){
                AddTank-=1;
                mainTank+=1;
            }

        }totalfuel+=mainTank;
        int dis=totalfuel*10;
        System.out.println(dis);
    }
}