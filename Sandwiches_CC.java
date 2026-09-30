import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int H = sc.nextInt();
        int C = sc.nextInt();

        int sandwiches = Math.min(B / 2, H + C);

        System.out.println(sandwiches);
    }
}