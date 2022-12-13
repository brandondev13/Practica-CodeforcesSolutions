import java.util.*;
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        String r = s.toUpperCase().charAt(0) + s.substring(1, n);
        System.out.println(r);
    }
}