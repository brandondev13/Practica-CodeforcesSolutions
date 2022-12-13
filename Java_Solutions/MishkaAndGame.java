import java.util.*;
public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mm = 0, cc = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int c = sc.nextInt();
            if (m > c) {
                mm++;
            } else if (m < c) {
                cc++;
            }
        }
        if (mm > cc) {
            System.out.println("Mishka");
        } else if (mm < cc) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}