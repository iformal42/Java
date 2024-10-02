import java.util.*;
public class q5 {
    static int[] coordinates(){
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        int[] x1 = {x,y};
        return x1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter x1 co-ordinate: ");
        int[] p1 = coordinates();
        System.out.println("Enter x2 co-ordinate: ");
        int[] p2 = coordinates();
        double pp = (double)(p1[0]-p2[0]);
        double distance = Math.sqrt(Math.pow(pp,2) + Math.pow(p1[1]-p2[1],2));
        System.out.println("distance: " + distance);
        
    }
    
}
