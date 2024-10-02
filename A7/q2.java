import java.util.*;

public class q2 {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you First Name: ");
        String f_n = sc.nextLine();
        System.out.print("Enter your Last Name: ");
        String l_n = sc.nextLine();
        String full_name = f_n.concat(" "+l_n);
        System.out.println("Full Name: "+full_name);
        sc.close();
    }
    
}
