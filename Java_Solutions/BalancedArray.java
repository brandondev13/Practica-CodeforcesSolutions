import java.util.*;
public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if ((n / 2) % 2 == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
                for (int i = 2; i <= n; i += 2) {
                    System.out.print(i + " ");
                }
                for (int i = 1; i <= n - 3; i += 2) {
                    System.out.print(i + " ");
                }
                System.out.print(n + ((n / 2) - 1));
                System.out.println();
            }
        }
    }
}