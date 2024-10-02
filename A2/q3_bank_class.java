import java.util.Scanner;

class Bank{

    public double balance;
    Bank(){
        balance = 0;
    }
    Bank(double b){
        balance = b;
    }

    public void deposit(double b){
        this.balance += b;
        System.out.println("Current Balance: " +this.balance);
    }

    public void withdraw(double b){
        if(b > balance)
        System.out.println("\n\nBALANCE IS NOT AVAILABLE FOR WITHDRAWAL \n");
        else
        this.balance -=b;
        System.out.println("Current Balance: " +this.balance);

    }
}

public class q3_bank_class {

    static  void show_details(Bank p,int id){
        System.out.println("\nYour id: "+id);
        System.out.println("Your balance: "+p.balance);
    }
    public static void main(String[] args) {
        int i,in=0,id;
        double amt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number customers: ");
        int n = sc.nextInt();
        Bank b[] = new Bank[n];
        for (i=0;i<n;i++){
            b[i] = new Bank();
        }
        
        String feeback ="",option;
        while (in != -1){
            System.out.println("\n"+feeback);
            System.out.println("1.Deposit \n2.Withdraw");
            System.out.print("Enter : ");
           
            in = sc.nextInt();
            if(in<1 || in>2){
                feeback = "Please enter valid input";
                continue;
            }

            System.out.print("Enter you account number: ");
            id = sc.nextInt();
           
            while (id >= n || id <0) {
            System.out.print("\nPlease enter valid id \nEnter you account number: ");
            id = sc.nextInt();    
            }

            show_details(b[id],id);
            option="Withdrawal";
            if (in == 1)
            option="Deposit";
            
            System.out.print("Enter "+option+" amount: ");
            amt = sc.nextDouble();

            if (in == 1)
            b[id].deposit(amt);

            else
            b[id].withdraw(amt);

            feeback ="";
        }



    }
}
