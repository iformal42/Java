import java.util.Scanner;
public class valid {
    static boolean is_num(String num ){
        try{
             Integer.parseInt(num);
             return true;
        }
        catch (NumberFormatException e){
              return false;
        }
    }
    static boolean is_num2(String num){
        return num != null && num.matches("[0-9]+");
    }
    public static void main(String [] a){
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        // int n = Integer.parseInt(num);
        if(is_num2(num)){
            System.out.println("is number");
        }
        else{
            System.out.println("not number");
        }

        
    }
}
