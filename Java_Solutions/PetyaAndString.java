import java.util.*;
public class PetyaAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next(), c2 = sc.next();
        String l1 = c1.toUpperCase(), l2 = c2.toUpperCase();
        if(l1.compareTo(l2) == 0){
            System.out.println("0");
        } else if(l1.compareTo(l2) > 0){
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}