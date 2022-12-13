import java.util.*;
public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int M = 0;
        int m = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 91){
                M++;
            } else {
                m++;
            }
        }
        if (M>m) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}