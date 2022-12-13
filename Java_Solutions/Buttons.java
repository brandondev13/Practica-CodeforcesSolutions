import java.util.*;
public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, s=0;
        n = sc.nextInt();
        for(int i=1; i<n; i++) {
            s=s+((n-i)*i);
        }
        System.out.println(s+n);
    }
}