import java.util.*;
public class Team {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a=0, b=0, c=0, count=0;
	for(int i=0; i<n; i++) {
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
        int r = a+b+c;
	    if(r>1) {
		  count++;
	    }
	}
	System.out.println(count);
  }
}