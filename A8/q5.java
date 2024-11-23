class Person{
    private String name;
    private char gender;
    protected int age;
    Person(String name,char gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
   
    void displayDetails(){
        System.out.println("\nDetails:- ");
        System.out.println("Name:- "+this.name);
        System.out.println("Gender:- "+this.gender);
        System.out.println("Age:- "+this.age);

    }
}
class Staff extends Person{
    protected  String department;
    protected int id;
    Staff(String name,char gender,int age,String department, int id){
        super(name, gender, age);
        this.department = department;
        this.id = id;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Department:- "+this.department);
        System.out.println("Id:- "+this.id);

    };

}
class Doctor extends Staff{
    protected  String specialty;
    protected int exp;
    Doctor(String name,char gender,int age,String department,int id,
         String specialization, int year_of_exp)
    {
        super(name, gender, age, department, id);
        this.specialty=specialization;
        this.exp = year_of_exp;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: "+this.specialty);
        System.out.println("Year of experience: "+this.exp);
    };
}
public class q5 {
    public static void main(String[] args) {
        Doctor p = new Doctor("Musaif",'M',20,"Cardiovascular",234,"M.B.B.S", 10);
        Doctor p2 = new Doctor("Tufaan Bachhan",'T',20,"Dermology",244,"Nurse", 1);

                            
                            
        p.displayDetails();
        p2.displayDetails();
        

    }
    
}
