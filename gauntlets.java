import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int count=1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int sum1=0;
        for(int i:map.values()){
            sum1=sum1+(i/2);
        }
        System.out.println(sum1);
    }
}