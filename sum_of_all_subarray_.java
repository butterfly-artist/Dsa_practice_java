import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            long[] arr=new long[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextLong();
            }
            long totalsum=0;
            for(int i=0;i<N;i++){
               totalsum=totalsum+(i+1)*(N-i)*arr[i];
            }
            
            System.out.println(totalsum);
            
        }
        
    }
}

// General Constraints
// -106 <= arr[i] <= 106

// Example
// Input
// 3
// 3
// 3 4 5
// 2
// 1 2
// 3
// 1 -3 4

// Output
// 40
// 6
// 3

// Explanation

// Test Case 1:
// [3] + [3,4] + [3,4,5] + [4] + [4,5] + [5] = 40

// Test Case 2:
// [1] + [1,2] + [2] = 6

// Test Case 3:
// [1] + [1,-3] + [1,-3,4] + [-3] + [-3,4] + [4] = 3