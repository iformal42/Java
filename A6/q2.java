

public class q2 {
    static void wrapper_op(){
        Integer i = 5;
        Integer j = 6;
        Double d = Double.valueOf(7);
        Double k = 6d;
        
        int a = (Integer) i;
        int b = (Integer) j;
        double c = (Double) d;
        double e = (Double) k;

        int f = a+b;
        double g= c-e;

        Integer h = f;
        Double l = g;
        
        System.out.println(h+" type "+h.getClass().getSimpleName());
        System.out.println(l+" type "+l.getClass().getSimpleName());



    }
    public static void main(String[] args) {
        wrapper_op();
        
    }
    
}
