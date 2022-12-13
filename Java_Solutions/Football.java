import java.util.*;
public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char f[] = s.toCharArray();
        int c = 0;
        boolean si = false;
        for(int i = 1; i < s.length(); i++) {
            if (f[i - 1] == f[i]) {
                c++;
                if (c == 6) {
                    System.out.println("YES");
                    si = true;
                    break;
                }
            } else {
                c = 0;
            }
        }
        if(si) {
        } else {
            System.out.println("NO");
        }
    }
}