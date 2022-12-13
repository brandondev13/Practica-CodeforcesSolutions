import java.util.*;
public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = "";
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            if (p == 1) {
                c = "HARD";
                break;
            } else {
                c = "EASY";
            }
        }
        System.out.println(c);
    }
}