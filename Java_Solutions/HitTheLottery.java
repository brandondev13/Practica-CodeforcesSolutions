import java.util.*;
public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 0;
        int v[] = {100,20,10,5,1};
        int n = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            r += n / v[i];
            n = n % v[i];
        }
        System.out.println(r);
    }
}