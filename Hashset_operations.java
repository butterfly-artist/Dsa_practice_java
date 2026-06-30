import java.io.*;
import java.util.*;

public class Main {
    public static void printSortedSet(HashSet<Integer> set){
        if(set.isEmpty()){
            return;
        }
        TreeSet<Integer> sorted=new TreeSet<>(set);
        StringBuilder res=new StringBuilder();
        for(int num:sorted){
            res.append(num).append(" ");
        }
        System.out.println(res.toString().trim());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        HashSet<Integer> A=new HashSet<>();
        for(int i=0;i<N;i++){
            A.add(sc.nextInt());
        }
        int M=sc.nextInt();
        HashSet<Integer> B=new HashSet<>();
        for(int i=0;i<M;i++){
            B.add(sc.nextInt());
        }
        HashSet<Integer> union =new HashSet<>(A);
        union.addAll(B);
        printSortedSet(union);
        HashSet<Integer> intersect=new HashSet<>(A);
        intersect.retainAll(B);
        printSortedSet(intersect);
        HashSet<Integer> diff=new HashSet<>(union);
        diff.removeAll(intersect);
        printSortedSet(diff);
        if(intersect.isEmpty()){
            System.out.println("true  ");
        }else{
            System.out.println("false ");
        }
        if(B.containsAll(A)){
            System.out.println("true ");
        }else{
            System.out.println("false ");
        }
        if(A.containsAll(B)){
            System.out.println("true ");
        }else{
            System.out.println("false ");
        }
    }
}