import java.util.*;
public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "I hate it";
        for (int i=1; i<=n; i++) {
            if(i % 2 == 1) {
                System.out.print("I hate ");
            } else {
                System.out.print("I love ");
            }
            if(i != n) {
                System.out.print("that ");
            }
        }
        System.out.print("it");
    }
}