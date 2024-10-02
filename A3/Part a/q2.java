import java.util.*;
public class q2 {
    static void avg(int n){
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        float avg;
        for (int i=0; i<n; i++){
            System.out.print("Income of person"+(i+1)+" in Rs. : ");
            sum += sc.nextInt(); 
        }
        avg = sum/n;
        System.out.println("Average income is Rs."+avg);

    }
    public static void main(String[] args){
        System.out.print("Enter number of people: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0)
        avg(n);
    }
}
