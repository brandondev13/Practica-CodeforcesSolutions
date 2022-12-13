import java.util.*;
public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        String s = sc.next();
        char c[] = s.toCharArray();
        while (t-- > 0) {
            for (int i = 1; i < n; i++) {
                if (c[i] == 'G' && c[i-1] == 'B') {
                    c[i] = 'B';
                    c[i-1] = 'G';
                    i++;
                }
            }
        }
        System.out.println(String.valueOf(c));
    }
}