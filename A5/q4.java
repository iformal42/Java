import java.util.*;
public class q4 {
    static void display(String a[][]){
        for(int i=0;i<a.length;i++){
            System.out.println("\nEnter pan card: "+a[i][0]);
            System.out.println("Enter Name: "+a[i][1]);
            System.out.println("Enter DOB: "+a[i][2]); 
     }

    }

    static void find(String a[][],String key)
    {
        for(int i=0;i<a.length;i++){
            if(a[i][0] == "12"){
                System.out.println("Your detail:- ");
                System.out.println("\nEnter pan card: "+a[i][0]);  
                System.out.println("Enter Name: "+a[i][1]);
                System.out.println("Enter DOB: "+a[i][2]);
                return;
            }
        }
        System.out.println("Wrong Pan card number");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] d =new String[2][3];
        for(int i=0;i<2;i++){
            System.out.println("\nrow "+(i+1)+":-");
           System.out.print("Enter pan card: ");
            d[i][0] = sc.nextLine();
            
            System.out.print("Enter Name: ");
            d[i][1] = sc.nextLine();
            
            System.out.print("Enter DOB: ");
            d[i][2] = sc.nextLine();
           
    }
    //display(d);
    System.out.print("Enter pan card number: ");
    String key = sc.nextLine();
    find(d, key);
    
}
}