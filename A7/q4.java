import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String a = sc.nextLine();
        System.out.print("Enter string: ");
        String b = sc.nextLine();
        if(a.equals(b)){
            System.out.println("equal");
        }
        else{
            System.out.println("considering case: "+a.compareTo(b));
            System.out.println("Ignoring case: "+a.compareToIgnoreCase(b));
        }
    }
    
}
