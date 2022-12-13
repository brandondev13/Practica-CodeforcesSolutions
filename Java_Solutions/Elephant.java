import java.util.*;
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int p = 5;
        int c =1;
        while(p < e) {
            p += 5;
            c++;
        }
        System.out.println(c);
    }
}