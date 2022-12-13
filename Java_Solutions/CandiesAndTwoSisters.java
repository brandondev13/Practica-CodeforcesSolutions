import java.util.*;
 public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double n, a;
        int v[] = new int[t];
        for (int i = 0; i < t; i++) {
            n  = sc.nextInt();
            a = Math.ceil((n/2)-1);
            v[i] = (int) a;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(v[i]);
        }
    }
}