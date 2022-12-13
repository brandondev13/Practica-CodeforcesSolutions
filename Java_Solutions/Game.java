import java.util.*;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int o = 0, c = 0;
            String s = sc.next();
            int n = s.length();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1') {
                    o++;
                } else  {
                    c++;
                }
            }
            int r = Math.min(c, o);
            if (r == 0 || r % 2 == 0) {
                System.out.println("NET");
            } else {
                System.out.println("DA");
            }
        }
    }
}