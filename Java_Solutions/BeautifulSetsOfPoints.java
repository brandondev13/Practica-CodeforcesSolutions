import java.util.*;
public class BeautifulSetsOfPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,f;
        l = sc.nextInt();
        f = sc.nextInt();
        int p = Math.min(l, f);
        System.out.println(p+1);
        for (int i = 0; i <= p; ++i) {
            System.out.println(i + " " + (p-i));
        }
    }
}