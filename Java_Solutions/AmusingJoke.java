import java.util.*;
public class AmusingJoke {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String h = sc.next();
    String a = sc.next();
    String concat = sc.next();
    String u = h+a;
    char v1[] = u.toCharArray();
    char v2[] = concat.toCharArray();
    Arrays.sort(v1);
    Arrays.sort(v2);
    String f=String.valueOf(v1);
    String p=String.valueOf(v2);
    if (f.equals(p)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}