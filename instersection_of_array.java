import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int[] arr=new int[M];
        for(int i=0;i<M;i++){
            arr[i]=sc.nextInt();
        }
        int N=sc.nextInt();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<N;i++){
            set.add(sc.nextInt());
        }
         Set<Integer> set2=new HashSet<>();

        for(int i=0;i<M;i++){
            if(set.contains(arr[i])&&!set2.contains(arr[i])){
                set2.add(arr[i]);
                System.out.print(arr[i]+" ");                  
            }
            }
        }

    }