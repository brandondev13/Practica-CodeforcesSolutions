import java.util.*;
public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, e = 0, p = 0, c = 0;
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            e = sc.nextInt();
            if(e == -1) {
                if(p > 0) {
                    p--;
                } else {
                    c++;
                }
            }
            else {
                p += e;
            }
        }
        System.out.println(c);
    }
}