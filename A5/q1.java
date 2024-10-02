import java.util.*;
public class q1{
    static void display(int[][][] a,int n){
        int i,j,k;
        for (i=0;i<n;i++){
            System.out.println("[\n");
            for(j=0;j<n;j++){
                System.out.println("  [\n");
                System.out.print("   [");
                for(k=0;k<n;k++){
                    System.out.print(a[i][j][k]+", ");   
                }
                System.out.print("]");
                System.out.println("\n  ]\n");
            }
            System.out.println("\n]\n");
        }

    }
    static void accept(){
        Scanner sc = new Scanner(System.in);
        int i;
        // int[] num = new int[3];
        // System.out.println("Enter dimensions: ");
        // for (i=0 ;i<3;i++){
        //     System.out.print("for D"+(i+1)+" size: ");
        //     num[i-1] = sc.nextInt();
        // }
        int n = 2;
        int[][][] m = new int[3][3][3];
        for (i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    m[i][j][k] = sc.nextInt();
                }
            }
        }
        display(m,n);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        accept();
    }
}
