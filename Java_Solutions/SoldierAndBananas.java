import java.util.*;
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0;
        int k= sc.nextInt();
        int n= sc.nextInt();
        int w = sc.nextInt();
        for (int i = 1; i <= w; i++) {
            s += i*k;
        }
        if (s<=n) {
            System.out.println(0);
        } else {
            System.out.println(s-n);
        }
    }
}