import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("+", "");
        char v[] = s.toCharArray();
        Arrays.sort(v);
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i]);
            if(i == v.length-1){
                continue;
            }
            System.out.print("+");
        }
        System.out.println();
    }
}