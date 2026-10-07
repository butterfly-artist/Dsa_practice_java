import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int Q=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int low=0;
            int high=arr[N-1]-arr[0];
            int ans=0;
           while(low<=high){
            int mid=(low+high)/2;
            if(valid(arr,N,Q,mid)==true){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
           }
            System.out.println(ans);
        }
    }
    public static boolean valid(int[] arr,int N, int Q,int mid){
        int last=arr[0];
        int event=1;
        for(int i=0;i<N;i++){
            if(arr[i]-last>=mid){
                event++;
                last=arr[i];
            }
        }
        return event>=Q;
    }
}


// Protective Villagers 
//   In a remote village, there is a new long marketplace with N stalls, all lined up along a straight path at positions x1, x2, x3,..., xN. A group of villagers, represented by C individuals, are highly protective of their personal space and tend to get into disputes when placed too close to one another. To maintain peace, the village leader wants to allocate the villagers to these stalls in a way that maximizes the minimum distance between any two of them.

// Input Format
// The first line of input contains T - the number of test cases. It is followed by 2T lines, the first line contains 2 space-separated integers - N and C. The second contains N integers, where ith integer denotes xi, the location of the ith stall.

// Output Format
// For each test case, print the largest minimum distance possible, separated by a new line.

// Constraints
// 50 points
// 2 <= N <= 20
// 2 <= C <= N

// 100 points
// 2 <= N <= 104
// 2 <= C <= N

// General Constraints
// 1 <= T <= 100
// 0 <= xi <= 106

// Example
// Input
// 1
// 5 3
// 1 2 9 8 4

// Output
// 3

// Explanation

// Example 1:
// The villagers should be placed at 1,4,9, which makes the minimum distance between them as 3. Any other combination will give a smaller minimum distance.
