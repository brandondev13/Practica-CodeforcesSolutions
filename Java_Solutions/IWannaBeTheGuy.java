import java.util.*;
public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();
        int n = sc.nextInt();
        int p = sc.nextInt();
        for (int i =0; i<p; i++){
            h.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i =0; i<q; i++){
            h.add(sc.nextInt());
        }
        if (n == h.size()){
            System.out.println("I become the guy.");
        }
        else {
            System.out.println("Oh, my keyboard!");
        }
    }
}