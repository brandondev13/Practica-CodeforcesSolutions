import java.util.*;
 public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace(" ", "");
        s = s.replace("}", "");
        s = s.replace("{", "");
        s = s.replace(",", "");
        int no = 1;
        char l[] = s.toCharArray();
        Arrays.sort(l);
        if(l.length == 0) {
            System.out.println("0");
            return;
        }
        char ct = l[0];
        for (int i = 1; i < l.length; i++) {
            String b = Character.toString(ct);
            String c = Character.toString(l[i]);
            if (b.compareTo(c) == 0)
                continue;
            else {
                ct = l[i];
                no++;
            }
        }
        System.out.println(no);
    }
}