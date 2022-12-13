import java.util.*;
public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String s = sc.next();
        int A = 0, D = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                A++;
            } else {
                D++;
            }
        }
        if (A > D) {
            System.out.println("Anton");
        } else if (A < D){
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}