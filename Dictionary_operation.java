import java.io.*;
import java.util.*;

public class Main {

    public static void aprintln(Map<Integer,Integer> dic)
    {
        if(dic.isEmpty()){
            return;

        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Integer,Integer> entry:dic.entrySet()){
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            sb.append(" ");

        }System.out.println(sb.toString().trim());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Map<Integer,Integer> dic=new TreeMap<>();
        for(int i=0;i<N;i++){
            String ST=sc.next();

            if(ST.equals("insert")){
                int ke=sc.nextInt();
                dic.put(ke,(dic.getOrDefault(ke,0)+1));     
                aprintln(dic);
            }else if(ST.equals("search")){
                int ke=sc.nextInt();
                if(dic.get(ke)==null){
                    System.out.println("False ");
                }else{
                    System.out.println("True ");
                }
            }else if(ST.equals("delete")){
                int ke=sc.nextInt();
                dic.remove(ke);
                aprintln(dic);
            }else if(ST.equals("remove")){
                int ke=sc.nextInt();
                if(dic.containsKey(ke)){
                    int val=dic.get(ke);

                    if(val<=1){
                        dic.remove(ke);
                    }
                    else{
                    dic.put(ke,val-1);
                    }
                }
                aprintln(dic);
            }else if(ST.equals("get")){
                int ke =sc.nextInt();
                System.out.println(dic.get(ke));
            }else if(ST.equals("size")){
                System.out.println(dic.size());
            }
        }
    }
}