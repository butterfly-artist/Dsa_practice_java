import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long N=sc.nextLong();
            System.out.println(count_tail_zero(N));
        }
    }
    
//Logic
//     Initial: N = 100, count = 0

// Loop 1: 
//   -> count += 100 / 5  (count becomes 20)
//   -> N = 100 / 5       (N becomes 20)

// Loop 2: 
//   -> count += 20 / 5   (count becomes 20 + 4 = 24)
//   -> N = 20 / 5        (N becomes 4)

// Loop Ends: Because N (4) is now less than 5.
// Result = 24

    public static long count_tail_zero(long N){
        long count=0;
        while(N>=5){
            count+=N/5;
            N/=5;
        }
        return count;
    }
}

// Trailing Zeros 
// Count the number of trailing 0s in the factorial of a given number.

// Input Format
// The first line of input contains T - the number of test cases. It is followed by T lines, each containing an integer N.

// Output Format
// For each test case, print the number of trailing 0s in N!, separated by a new line.

// Constraints
// 1 <= T <= 10000
// 1 <= N <= 1015

// Example
// Input
// 3
// 2
// 5
// 100

// Output
// 0
// 1
// 24

// Explanation

// 2! = 2 [No trailing zeros]
// 5! = 120 [Trailing zeros=1]