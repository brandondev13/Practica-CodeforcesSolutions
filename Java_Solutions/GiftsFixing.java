import java.util.*;
public class GiftsFixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long s, e, f;
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            long p = (long) 10e9, q = (long) 10e9;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] < p) {
                    p = a[i];
                }
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] < q) {
                    q = b[i];
                }
            }
            s = 0;
            for (int i = 0; i < n; i++) {
                if ((a[i] > p && b[i] > q ) && (a[i]>0  && b[i]>0)) {
                    e = a[i] - p;
                    f = b[i] - q;
                    if (e <= f) {
                        s += e + (f - e);
                    } else {
                        s += f + (e - f);
                    }
                } else if (a[i] > p && a[i]>0) {
                    s += a[i] - p;
                } else if (b[i] > q && b[i]>0) {
                    s += b[i] - q;
                }
            }
            System.out.println(s);
        }
    }
}