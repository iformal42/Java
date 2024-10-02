import java.sql.Wrapper;

public class q1 {
    public static void main(String[] args) {
        char c = 'A';
        int i = 5;
        float f = 5f;
        double d = 5d;
        boolean b = true;

        // corresponding box wrapper class
        Character w_c = c;
        Integer w_i = i;
        Float w_f = f;
        Double w_d = d;
        Boolean w_b = b;
        Object[] wrapper = {w_c,w_i,w_f,w_d,w_b};      
        // for(int j=0;j<wrapper.length;j++){
        //     System.out.println(wrapper[j]+" is wrapper of  "+wrapper[j].getClass().getSimpleName());
        // }
        // double t = 1;

        // System.out.println("type : "+((Object)t).getClass().getSimpleName());
        // double i_2 = (Double) wrapper[1];
        // System.out.println("type : "+((Object)i_2).getClass().getSimpleName());
        char c_2 = (Character) wrapper[0];
        int  i_2 = (Integer) wrapper[1];
        float f_2 = (Float) wrapper[2];
        double d_2 = (Double) wrapper[3];
        boolean b_2 = (Boolean) wrapper[4];

        System.out.println(c_2);
        System.out.println(i_2);
        System.out.println(f_2);
        System.out.println(d_2);
        System.out.println(b_2);
     
      
    }
}
