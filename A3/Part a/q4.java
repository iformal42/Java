import java.util.Scanner;
 class Base{
     double area(){return 0;};
} 
class Triangle extends Base{
    double b,h;
    Triangle(double base,double height){
        b = base;
        h = height;
    }
    double area(){
        return b*h*0.5;
    }

}

class Equilateral extends Triangle{
    Equilateral(double side)
    {
        //double h = side*0.5*(Math.pow(3,0.5));
        super(side,side*0.5*(Math.pow(3,0.5)));
    }
}
class Isosceles extends Base{
    double a,b;
    Isosceles(double s1,double s2){
        a = s1;
        b = s2;        

    }
    double area(){
        double x = a*a - (b*b*0.25);
        double h = Math.pow(x,0.5);
        return 0.5*b*h;
    }
}
public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Triangle");
        System.out.println("2. Equilateral Triangle");
        System.out.println("3. Isosceles Triangle");
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
            System.out.print("Enter base: ");
            double base = sc.nextInt();
            System.out.print("Enter height: ");
            double h = sc.nextInt();
            Triangle triangle = new Triangle(base,h);
            System.out.println("Area: "+(triangle.area()));
                break;
            case 2:
            System.out.print("Enter side: ");
            double side = sc.nextInt();
            Equilateral triangle1 = new Equilateral(side);
            System.out.println("Area: "+(triangle1.area()));
                break;
            case 3:
            System.out.print("Enter side1: ");
            base = sc.nextInt();
            System.out.print("Enter side2: ");
            h = sc.nextInt();
            Isosceles triangle3 = new Isosceles(base,h);
            System.out.println("Area: "+(triangle3.area()));
            break;
        
            default:
                break;
        }
       
    }
    
}
