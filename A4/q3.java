import java.util.*;
public class q3 {
    public static void main(String[] args) {
        int n[] = new int[args.length];
        for(int i=0;i<args.length;i++){
            n[i] = Integer.parseInt(args[i]);
        }
        int sum=0;
        for (int elt:n){
            sum+=elt;
        }
        System.out.println("Average time: "+(sum/n.length));
        
    }
    
}
