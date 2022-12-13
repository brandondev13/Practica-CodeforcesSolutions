import java.util.*;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = reader.next();
        int c = 1;
        char[] p = s.toCharArray();
        Arrays.sort(p);
        for (int i = 1; i < p.length; i++) {
            if (p[i - 1] != p[i]) {
                ++c;
            }
        }
        if (c % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}