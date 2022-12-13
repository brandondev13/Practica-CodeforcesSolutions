import java.util.*;
public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), v = 0;
        double r = 0;
        for (int i = 0; i < n; i++) {
           v = sc.nextInt();
           r += v;
        }
        System.out.println(r/n);
    }
}