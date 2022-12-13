import java.util.*;
public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int v[] = new int[t];
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a%b == 0) {
                v[i] = 0;
            } else if (a < b) {
                v[i] = (b-a);
            } else {
                v[i] = (b-(a%b));
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(v[i]);
        }
    }
}