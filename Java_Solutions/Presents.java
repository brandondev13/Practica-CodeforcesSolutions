import java.util.*;
public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m[] = new int[n+1];
        for (int i = 1; i <= n; i++) {
           int b = sc.nextInt();
            m[b] = i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(m[i] + " ");
        }
    }
}