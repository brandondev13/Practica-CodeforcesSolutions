import java.util.*;
public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int max=0, min=0, maxV=0, minV=0;
        min= v[0];
        max=v[0];
        for (int i = 0; i < n; i++) {
            if (min >= v[i]) {
                min = v[i];
                minV = i;
            }
            if (max < v[i]) {
                max = v[i];
                maxV = i;
            }
        }
        if (minV< maxV) {
            minV=(n-1)-minV;
            System.out.println((minV+maxV-1));
        } else {
            minV = (n-1)-minV;
            System.out.println((minV+maxV));
        }
    }
}