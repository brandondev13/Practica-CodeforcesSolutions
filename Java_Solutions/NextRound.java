import java.util.*;
public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int s = a[k - 1];
        int c = 0;
        for(int j = 0; j < n; j++) {
            if(a[j] >= s && (s != 0 || a[j] != 0)) {
                c++;
            } else if (a[j] < s) {
                break;
            }
        }
        System.out.println(c);
    }
}