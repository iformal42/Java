import java.util.*;
public class q4 {
    static int find_min(int[] num){
        int min = num[0];
        for (int i=0; i<num.length;i++){
            if (min>num[i])
            min = num[i];
        }
        return min;

    }
    static int find_max(int[] num){
        int max = num[0];
        for (int i=0; i<num.length;i++){
            if (max<num[i])
            max = num[i];
        }
        return max;

    }
    public static void main(String[] args) {
        int n[] = new int[args.length];
        for(int i=0;i<args.length;i++)
        n[i] = Integer.parseInt(args[i]);

        System.out.println("Max:- "+find_max(n)+"\nMin:- "+find_min(n));
    }
    
}
