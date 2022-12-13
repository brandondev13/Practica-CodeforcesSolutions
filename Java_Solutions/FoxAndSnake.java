import java.util.*;
public class FoxAndSnake { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2==0) {
                    System.out.print("#");
                } else if(i%2==1 && c==0){
                    if(j<m-1) {
                        System.out.print(".");
                    } else {
                        c =1;
                        System.out.print("#");
                    }
                } else if (i % 2 == 1 && c == 1) {
                    if (j == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                    if (j == m - 1) {
                        c = 0;
                    }
                }
            }
            System.out.println("");
        }
    }
}