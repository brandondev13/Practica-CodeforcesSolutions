import java.util.*;
public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), v = 0;
        if (n % 2 == 0) {
            System.out.println(n/2);
        } else {
            v =-(n/2 + 1);
            System.out.println(v);
        }
    }
}