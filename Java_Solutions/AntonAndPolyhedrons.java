import java.util.*;
public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int n = sc.nextInt();
        for (int i=0; i <=n; i++) {
            String c = sc.nextLine();
            switch(c){
                case "Tetrahedron":
                    t+=4;
                    break;                    
                case "Cube":
                    t+=6;
                    break;                        
                case "Octahedron":
                    t+=8;
                    break;
                case "Dodecahedron":
                    t+=12;
                    break;
                case "Icosahedron":
                    t+=20;
                    break;
                default:
                    break;
            }      
        }
        System.out.println(t);
    }    
}