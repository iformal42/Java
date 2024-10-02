import java.math.BigInteger;
import java.util.*;


class Patient {
    public String name;
    public BigInteger contact;
    public int age;
    public double platelets1;
    public double platelets2;
   Patient(){
        this.name = " ";
        this.age = 0;
        this.contact = BigInteger.valueOf(0);
        this.platelets1 = 0;
        this.platelets2 = 0;
        //increment(age);
   } 

//    private void increment(int age){
//     float factor;
//     if(0<age && age<= 17)
//     factor = 0.6f;
//     else if(age<= 39)
//     factor = 0.4f;
//     else if(age<=60)
//     factor = 0.3f;
//     else 
//     factor = 0.2f;
//     this.platelets2 = platelets1+platelets1*factor;
//    }
    
}
public class q3 {
    
    static Patient[] increment(Patient[] p){
        float factor;
        for (int i=0;i<p.length;i++){
        if(0<p[i].age && p[i].age <= 17)
        factor = 0.6f;
        else if(p[i].age <= 39)
        factor = 0.4f;
        else if(p[i].age <=60)
        factor = 0.3f;
        else 
        factor = 0.2f;
        p[i].platelets2 = Math.round(p[i].platelets1+p[i].platelets1*factor);
       }
       return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        // sc.nextLine();
        Patient p[] = new Patient[n];
        int i;
        for(i=0;i<n;i++){
            sc.nextLine();
            p[i] = new Patient();
            System.out.println("\nPatient "+(i+1)+" detail:-");
            System.out.print("Enter patient name: ");
            p[i].name = sc.nextLine();
            System.out.print("Enter patient's contact number: ");
            p[i].contact = sc.nextBigInteger();
            System.out.print("Enter patient's age: ");
            p[i].age = sc.nextInt();
            System.out.print("Enter patient's Platelets count: ");
            p[i].platelets1 = sc.nextDouble();
        }
        Patient[] updated_p = increment(p);
        System.out.println("\nPatients'Details:-");
        
        for(i=0;i<n;i++){
            System.out.println("\n\nPatient name: "+updated_p[i].name);
            System.out.println("Patient's contact number: "+updated_p[i].contact);
           
            System.out.println("Patient's age: "+updated_p[i].age);
           
            System.out.println("Patient's Platelets count: "+updated_p[i].platelets1);
            System.out.println("After treatment:-");
            System.out.println("Patient's Platelets count: "+updated_p[i].platelets2);
           
        }



        
    }
}