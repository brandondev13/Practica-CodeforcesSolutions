import java.util.*;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n = 0;
        for (i = 1; i < 6; i++) {
            for (j = 1; j < 6; j++) {
                n = sc.nextInt();
                if (n == 1) {
                    System.out.println(Math.abs(i-3) + Math.abs(j-3));
                }
            }
        }
    }
}