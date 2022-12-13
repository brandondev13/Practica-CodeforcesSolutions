import java.util.*;
public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char c[] = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)){
                c[i] = '0';
            } else {
                c[i] = '1';
            }
        }
        System.out.println(String.valueOf(c));
    }
}