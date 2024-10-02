
// Java Program to demonstrate use of default values
import java.io.*;
public class q2 { 
    // static values
    static byte b;
    static int i;
    static long l;
    static short s;
    static boolean bool;
    static char c;
    static String str;
    static Object object;
    static float f;
    static double d;
    static int[] Arr;
    public static void main(String[] args)
    {
        
        // Printing error
        int[] Arr = { 1, 2, 3, 5, 0};
        int[] tempArr = Arr;
        tempArr[0] = 26;
        System.out.println(tempArr[0]+Arr[0]);
    }

}

    

