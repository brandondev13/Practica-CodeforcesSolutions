import java.util.*;
public class Translation {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        t = reverse(t);
        String NOSI = "";
        for (int i = 0; i < s.length(); i++) {
            if (t.charAt(i) == s.charAt(i)){
                NOSI = "YES";
            } else {
                NOSI = "NO";
                break;
            }
        }
        System.out.println(NOSI);
    }
}