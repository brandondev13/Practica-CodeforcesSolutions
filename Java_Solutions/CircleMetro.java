import java.util.*;
public class CircleMetro {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n, a, x, b, y;
        n = sc.nextInt();
        a = sc.nextInt();
        x = sc.nextInt();
        b = sc.nextInt();
        y = sc.nextInt();
        boolean answer = false;
        while (a != x && b != y) {
            if (a < n)
                a++;
            else
                a = 1;
            if (b > 1)
                b--;
            else
                b = n;
            if (a == b) {
                answer = true;
                break;
            }
        }

        System.out.println((answer? "YES" : "NO"));
    }

}