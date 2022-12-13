import java.util.*;
public class IsItRated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c1=0,c2=0;
        boolean v = false, verdadero=false;
        n--;
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        if(c1!=c2)
            v=true;
        for (int i = 0; i < n; i++) {
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            if(a!=b) {
                v = true;
            } else if(a>c1) {
                verdadero = true;
            }
            c1=a;
        }
        if(v) {
            System.out.println("rated");
        } else if(verdadero) {
            System.out.println("unrated");
        } else {
            System.out.println("maybe");
        }
    }
}