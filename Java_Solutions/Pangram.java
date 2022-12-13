import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c = 0;
        n = sc.nextInt();
        char b[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String s = sc.next();
        char a[] = s.toCharArray();
        for (int j = 0; j < n; j++) {
            if ('a' <= a[j] && a[j] <= 'z'){
                a[j] = (char) (a[j] - 'a' + 'A');
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < n; j++)
                if (b[i] == a[j]) {
                    c++;
                    break;
                }
            }
        if (c == 26) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}