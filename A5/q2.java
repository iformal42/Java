import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no. of sports people: ");
        int n = sc.nextInt();
        int[][] a= new int[n][3];
        for(int i=0;i<n;i++){
            System.out.println("Entry "+(i+1)+": ");        
            System.out.print("Person id : "); 
            a[i][0] = sc.nextInt();
            System.out.print("Weight: "); 
            a[i][1] = sc.nextInt();
            System.out.print("Height: "); 
            a[i][2] = sc.nextInt();
        }
        
    }
    
}
