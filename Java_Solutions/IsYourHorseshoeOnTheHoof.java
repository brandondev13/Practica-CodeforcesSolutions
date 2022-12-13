import java.util.*;
public class IsYourHorseshoeOnTheHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h[] = new int[4];
        int c=0;
        for (int i =0; i<4; i++){
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        for (int i = 1; i < 4; i++) {
            if (h[i-1] == h[i]) {
                c++;
            }
        }
        System.out.println(c);
    }
}