
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class first {
	// static void showDBData(ResultSet set)
	// {
	// 	while(set.next())
	// 		{
	// 			int id = set.getInt(1);
	// 			String name = set.getString(2);
	// 			int birthYear = set.getInt(3);
	// 			String destination = set.getString(4);
	// 			int salary = set.getInt(5);
	// 			//System.out.println("\nRow "+(i++));
	// 			System.out.println("\nId: "+id);
	// 			System.out.println("Name: "+name);
	// 			System.out.println("Birth year: "+birthYear);
	// 			System.out.println("Destination: "+destination);
	// 			System.out.println("Salary: "+salary);
	// 		}
	// }
    public static void main(String[] args) {
		int i=0;
		String q;
		String username = "postgres";
		String password = "root123";
		String  DB = "postgres";
		String url = "jdbc:postgresql://localhost:5432/"+DB;
		//Class.forName("org.postgres.Driver");
		Connection con = null;
		//Class.forName("org.postgresql.Driver");

		try{
			con = DriverManager.getConnection(url, username, password);
			if(con.isClosed()){
				System.out.println("Connection is closed");
			}
			else 
			System.out.println("Connected..");
			// created Statement Object
			Statement st = con.createStatement();
			// drop table query
			q = "Drop table  if exists employee;";
			// droping table 
			st.executeUpdate(q);
			
			//create table query
			q = "create table employee(id int primary key,name varchar(20),birthyear int, designation varchar(10),salary int)";
			// creating a table;
			st.executeUpdate(q);
			System.out.println("Table created.");

			q = "insert into employee values(?,?,?,?,?)";
			 
			PreparedStatement pst = con.prepareStatement(q);
			String names[] ={"musaif","anas","Arshad","arsh","neel"};
			String address = "pune";
			for(i=0 ;i<names.length;i++)
			{
				
				pst.setInt(1, i+1);
				pst.setString(2, names[i]);
				pst.setInt(3,2000+i );
				if(i%2==0)
				address = "mumbai";
				else
				address = "pune";
				pst.setString(4,address);
				pst.setInt(5, 200000+i*30000);
				pst.executeUpdate();
			} 			

			System.out.println("inserted...");
			
			//Select query
			q = "select * from employee";
			ResultSet set = st.executeQuery(q);
			//System.out.println("are there any rows?: "+set.next());
			//showDBData(set);
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				int birthYear = set.getInt(3);
				String destination = set.getString(4);
				int salary = set.getInt(5);
				//System.out.println("\nRow "+(i++));
				System.out.println("\nId: "+id);
				System.out.println("Name: "+name);
				System.out.println("Birth year: "+birthYear);
				System.out.println("Destination: "+destination);
				System.out.println("Salary: "+salary);
			}
			//q = "update  employee set salary = salary*1.2 where name = 'musaif';";
			q = "update  employee set salary = salary*? where name = ?;";
			pst = con.prepareStatement(q);
			pst.setDouble(1, -2);
			pst.setString(2, "anas");

			pst.executeUpdate();
			System.out.println("Data base is updated. ");
			//deleting 
			q = "delete from employee where birthyear=? and  name like ?;";
			pst = con.prepareStatement(q);
			pst.setInt(1,2003);
			pst.setString(2,"a%");
			pst.executeUpdate();
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("connection is closed");
			
		}
		
		



        	
		}
	
}
