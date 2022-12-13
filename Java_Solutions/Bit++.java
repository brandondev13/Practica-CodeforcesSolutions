import java.util.*;
public class Bit++ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r = 0;
        for (int i = 0; i < n; i++) {
            String l = sc.next();
            if ((l.charAt(0) == '+') || (l.charAt(l.length() - 1) == '+')) {
                r++;
            } else {
                r--;
            }
        }
        System.out.println(r);
    }
}