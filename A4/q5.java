
public class q5 {
    static boolean is_palindrome(String n){
        int l = n.length();
        for(int i=0; i<l/2;i++){
            if(n.charAt(i)!= n.charAt(l-1-i))
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if(is_palindrome(args[0]))
        System.out.println(args[0]+" is palindrome.");
        else
        System.out.println(args[0]+" is not palindrome.");
    }
    
}
