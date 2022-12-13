import java.util.*;
public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s.toLowerCase();
        char c[] = s.toCharArray();
        int m = 0;
        for (int i = 1; i < n; i++) {
            if(c[i-1] == c[i]){
                m++;
            }
        }
        System.out.println(m);
    }
}