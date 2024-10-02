import java.util.*;
abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    double radius ;
    Circle(double r){
        radius = r;
    }
   @Override
   double area() {
       return Math.PI*radius*radius;
   }
}

class Square extends Shape{
    double side;
    Square(double s){
        side = s;

    }

    double area(){
        return side*side;
    }
}


class Rectangle extends Shape{
    double l,b;
    Rectangle(double len,double bred){
        l=len;
        b=bred;
    } 
    double area(){
        return l*b;
    }
}   


class Triangle {
    double base,height;
    Triangle(double b, double h){
        base = b;
        height = h;
    }

    double area(){
        return base*height*0.5;
    }
    
}
public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("1. for Area of Square");
    System.out.println("2. for Area of Rectangle");
    System.out.println("3. for Area of Triangle");
    System.out.println("4. for Area of Circle");
    System.out.println("5. Exit");

    
    System.out.print("Enter number: ");
    
    int n = sc.nextInt();

    switch (n) {
        case 1:
        System.out.print("Enter side: ");
        double s = sc.nextInt();
        Square a = new Square(s);
        System.out.println("Area: "+(a.area()));

            break;
        case 2:
        System.out.print("Enter length: ");
        double l = sc.nextInt();
        System.out.print("Enter breadth: ");
        double b = sc.nextInt();
        Rectangle rect = new Rectangle(l,b);
        System.out.println("Area: "+(rect.area()));
            break;
        case 3:
        System.out.print("Enter base: ");
        double base = sc.nextInt();
        System.out.print("Enter height: ");
        double h = sc.nextInt();
        Triangle triangle = new Triangle(base,h);
        System.out.println("Area: "+(triangle.area()));
            break;

            
        case 4:
        System.out.print("Enter radius: ");
        double radius = sc.nextInt();
        
        Circle circle = new Circle(radius);
        System.out.println("Area: "+(circle.area()));
            break; 
        case 5:
            break;   
 
    }



    }
    
}
