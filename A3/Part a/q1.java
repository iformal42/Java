import java.util.*;

public class q1 {

    static void vowels(int n){
        Scanner sc = new Scanner(System.in);
        char[] vowel = new char[n];
        int count_vowel = 0;
        for (int i=0; i<n;i++){
            System.out.print("Enter char: ");
            String s = sc.nextLine();
            char c = s.charAt(0);
            if (c == 'a'|| c == 'e'||c == 'i'|| c == 'o'|| c=='u'){
                vowel[i] = c;
                count_vowel ++;
            }
        }
        System.out.println("Total vowels are "+count_vowel);
        System.out.println("Vowels :- ");
        for(char c:vowel){
            System.out.print(c+" ");
        }
        

    }
    public static void main(String[] args) {
        System.out.print("Enter number of characters: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        vowels(n);
    }
    
}
