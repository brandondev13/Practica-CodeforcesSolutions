import java.util.*;
public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[n];
        int c = 1;
        for (int i = 0; i < n; i++) {
           v[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (v[i-1] != v[i]) {
                c++;
            }
        }
        System.out.println(c);
    }
}