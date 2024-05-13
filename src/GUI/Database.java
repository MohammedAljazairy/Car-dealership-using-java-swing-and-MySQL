package GUI;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class Database {
	

	

public static  Boolean Connection_To_Database_Authentication_login_CEO(String username,String password )  {
    	
        String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
            + "databaseName=carDealership2;" 
        		+ "user=root;"
            + "password=root;";
        

        try ( Connection connection = DriverManager.getConnection(connectionUrl);
		          PreparedStatement statement = connection.prepareStatement("SELECT * FROM account WHERE emp_id = ? AND emp_password = ?")) { 
      	
		        	JOptionPane.showMessageDialog(null,"Connected");    

			        statement.setInt(1, Integer.parseInt(username));
			        statement.setString(2, password);




          // Execute the query
						// The cursor in a ResultSet is initially positioned before the first row
						
          ResultSet resultSet = statement.executeQuery(); 
						// isBeforeFirst() return true is the result set is not empty & false if the set is empty
          if( resultSet.isBeforeFirst()) {
          	
          	System.out.println("true");//visual check
							//To move the cursor to the next row and access the data, you typically use the next() method
          	resultSet.next();
          	return true;
          }
          else {
							
          	System.out.println("false");//visual check
          	return false;
          }

         
    
      } catch (SQLException e) {
           e.printStackTrace();
           return false;
      }
  }


public static  String Connection_To_Database_Authentication_login(String username,String password )  {
	
    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
        + "databaseName=carDealership2;" 
    		+ "user=root;"
        + "password=root;";
    

 try (
        	
        	Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()) {
        	
        	//JOptionPane.showMessageDialog(null,"Connected");

            // Sample SQL query
            
            String sqlQuery = "SELECT a.*, d.dep_name"
            		+ " FROM account a"
            		+ " LEFT JOIN employee e ON a.emp_id = e.emp_id"
            		+ " LEFT JOIN department d ON e.dep_id = d.dep_id"
            		+ " WHERE a.emp_id =" + username + " AND a.emp_password = '"+ password + "'";

         // Execute the query
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            if (resultSet.next()) {
                String department = resultSet.getString("dep_name");
                System.out.println("Department: " + department);
                return department;
            } else {
                System.out.println("No matching record found.");
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
}





public static  int Connection_To_Database_Authentication_login_Manager(String username,String password )  {
	
    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
        + "databaseName=carDealership2;" 
    		+ "user=root;"
        + "password=root;";
    

 try (
        	
        	Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()) {
        	
        	//JOptionPane.showMessageDialog(null,"Connected");

            // Sample SQL query
            
            String sqlQuery = "SELECT "
            		+ " a.*,"
            		+ " (SELECT e.Manager_ID FROM employee e WHERE e.emp_id = "
            		+ username  +" ) AS Manager_ID"
            		+ " FROM"
            		+ " account a"
            		+ " WHERE"
            		+ " a.emp_id =" + username + " AND a.emp_password = '"+ password + "'";

         // Execute the query
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            if (resultSet.next()) {
                int Manager = resultSet.getInt("Manager_ID");
                System.out.println("Department: " + Manager);
                return Manager ;
            } else {
                System.out.println("No matching record found.");
                return 22;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 22;
        }
}





public static  int Connection_To_Database_Check_Branch_exist(int branch_id)  {
	
    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
        + "databaseName=carDealership2;" 
    		+ "user=root;"
        + "password=root;";
    

 try (
        	
        	Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()) {
        	
        	//JOptionPane.showMessageDialog(null,"Connected");

            // Sample SQL query
            
            String sqlQuery =  "select branch_id from branch where branch_id = " + branch_id;

         // Execute the query
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            if (resultSet.next()) {
                int Branch = resultSet.getInt("branch_id");
                System.out.println("Branch: " + Branch);
                return 1 ;
            } else {
                System.out.println("No matching record found.");
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
}


public static  int Connection_To_Database_Check_Department_exist_without_Manager(int dep_id)  {
	
    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
        + "databaseName=carDealership2;" 
    		+ "user=root;"
        + "password=root;";
    

 try (
        	
        	Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()) {
        	
        	//JOptionPane.showMessageDialog(null,"Connected");

            // Sample SQL query
            
            String sqlQuery =  "select dep_id from department where dep_id = " + dep_id + " and Manager_ID is null";

         // Execute the query
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            if (resultSet.next()) {
                int department = resultSet.getInt("dep_id");
                System.out.println("Department: " + department);
                return 1 ;
            } else {
                System.out.println("No matching record found.");
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
}



public static  void Connection_To_Database_insert_Manager(int emp_nid, String emp_fname, String emp_lname, String emp_email, String hire_date, int contract_duration, int salary, int bonus, int dep_id, int branch_id,String emp_password)  {
	
    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
        + "databaseName=carDealership2;" 
    		+ "user=root;"
        + "password=root;";
    if(Connection_To_Database_Check_Department_exist_without_Manager( dep_id)==1 && Connection_To_Database_Check_Branch_exist( branch_id)==1 ) {

 try (
        	
        	Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()) {
        	
        	//JOptionPane.showMessageDialog(null,"Connected");

            // Sample SQL query
            
            String sqlQuery =  "insert into employee (emp_nid, emp_fname, emp_lname, emp_email, hire_date, contract_duration, salary, bonus, dep_id, branch_id)"
            		+ "values ( "+ emp_nid+", '"+ emp_fname+ "', '"+emp_lname+"', '"+emp_email+"', '"+hire_date+"', "+contract_duration+", "+salary+", "+bonus+", "+dep_id+", "+branch_id+")";
            
            
            
            
            

         // Execute the query
            statement.executeUpdate(sqlQuery);
            
            String sqlQuery_update_Department_Manager= "update department set Manager_ID = (SELECT IDENT_CURRENT('employee'))";
            
            statement.executeUpdate(sqlQuery_update_Department_Manager);
            
            Database.Connection_To_Database_insert_Account(emp_password);
            
            
            
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    }
}


public static  void Connection_To_Database_insert_Phone_employee( int phone_num)  {
	
    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
        + "databaseName=carDealership2;" 
    		+ "user=root;"
        + "password=root;";
    

 try (
        	
        	Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()) {
        	
        	//JOptionPane.showMessageDialog(null,"Connected");

            // Sample SQL query
            
            String sqlQuery =  "insert  into emp_phone (emp_id,phone_num) values ((SELECT IDENT_CURRENT('employee')),"+phone_num+")";
            
            
            
            

         // Execute the query
             statement.executeUpdate(sqlQuery);
            
            
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    
}


public static  void Connection_To_Database_insert_Account( String emp_password)  {
	
    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
        + "databaseName=carDealership2;" 
    		+ "user=root;"
        + "password=root;";
    

 try (
        	
        	Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()) {
        	
        	//JOptionPane.showMessageDialog(null,"Connected");

            // Sample SQL query
            
            String sqlQuery =  "insert into account (emp_id, emp_password) values ((SELECT IDENT_CURRENT('employee')),'"+emp_password+"')";
            
            
            
            

         // Execute the query
             statement.executeUpdate(sqlQuery);
            
            
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    
}


//public static  int Connection_To_Database_Check_Employee_or_manager_exist(int Manager_ID)  {
//	
//    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
//        + "databaseName=carDealership2;" 
//    		+ "user=root;"
//        + "password=root;";
//    
//
// try (
//        	
//        	Connection connection = DriverManager.getConnection(connectionUrl);
//             Statement statement = connection.createStatement()) {
//        	
//        	//JOptionPane.showMessageDialog(null,"Connected");
//
//            // Sample SQL query
//            
//            String sqlQuery =  "select dep_id from employee where emp_id = " + Manager_ID + " and Manager_ID = NULL ";
//
//         // Execute the query
//            ResultSet resultSet = statement.executeQuery(sqlQuery);
//            
//            if (resultSet.isBeforeFirst()) {
//            	resultSet.next();
//            	String department_id_of_Manager = resultSet.getString("dep_id");
//            	
//                
//                return Connection_To_Database_Check_Manager_is_assigned_manage_this_department(department_id_of_Manager, Manager_ID); 
//            } else {
//                System.out.println("No matching record found.");
//                return 0;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return 0;
//        }
//}






public static  int Connection_To_Database_Check_Department_exist(String dep_name)  {
	
    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
        + "databaseName=carDealership2;" 
    		+ "user=root;"
        + "password=root;";
    

 try (
        	
        	Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()) {
        	
        	//JOptionPane.showMessageDialog(null,"Connected");

            // Sample SQL query
            
            String sqlQuery =  "select dep_name from department where dep_name = '" + dep_name +"'" ;

         // Execute the query
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            if (resultSet.next()) {
                int department = resultSet.getInt("dep_id");  ////you are here
                System.out.println("Department: " + department);
                return 1 ; //exist
            } else {
                System.out.println("No matching record found.");
                return 0;//does not exist
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 1; // error but assume it exists to do not make error in the database;
        }
}


public static  void Connection_To_Database_insert_Department(String dep_name, int max_employee_num)  {
	
    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
        + "databaseName=carDealership2;" 
    		+ "user=root;"
        + "password=root;";
    if(Connection_To_Database_Check_Department_exist(dep_name)==0) {

 try (
        	
        	Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()) {
        	
        	//JOptionPane.showMessageDialog(null,"Connected");

            // Sample SQL query
            
            String sqlQuery =  "insert into department (dep_name, max_emp_num)"
            		+ " values ( '"+ dep_name+"', "+ max_employee_num+ " )";
            
            
            
            
            

         // Execute the query
            statement.executeUpdate(sqlQuery);
            
            
            
            
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    }
    
}


public static String[][]   Connection_To_Database_Select_All_employees_under_manager(int emp_id,String column[] )  {
	
    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
        + "databaseName=carDealership2;" 
    		+ "user=root;"
        + "password=root;";
    

 try (
        	
        	Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()) {
        	
        	//JOptionPane.showMessageDialog(null,"Connected");

            // Sample SQL query
            
            String sqlQuery = "select * from employee where Manager_ID = "+ emp_id;

         // Execute the query
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            if (resultSet.isBeforeFirst()) {
                ResultSet Employees = resultSet;
                
                return transfer_SQL_Records_In_2D_Array(Employees,column);
            } else {
                System.out.println("No matching record found.");
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
}


public static String[][] transfer_SQL_Records_In_2D_Array(ResultSet employees, String column[])  {
    List<String[]> dataList = new ArrayList<String[]>();

    try {
        while (employees.next()) {
            String[] rowData = new String[column.length];
            for (int columnIndex = 0; columnIndex < column.length; columnIndex++) {
                // Retrieve data from the ResultSet and store it in a string array
                rowData[columnIndex] = employees.getString(column[columnIndex]);
            }
            dataList.add(rowData);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return new String[0][0]; // Return an empty array if an exception occurs
    }

    // Convert List to a 2D array
    String[][] data = dataList.toArray(new String[dataList.size()][column.length]);
    return data; // Return the populated data array
}




//public static String[][]   Connection_To_Database_Select_All_employees_under_manager(int emp_id,String column[] )  {
//	
//    String connectionUrl = "jdbc:sqlserver://DESKTOP-M4QC6GO:1433;"
//        + "databaseName=carDealership2;" 
//    		+ "user=root;"
//        + "password=root;";
//    
//
// try (
//        	
//        	Connection connection = DriverManager.getConnection(connectionUrl);
//             Statement statement = connection.createStatement()) {
//        	
//        	//JOptionPane.showMessageDialog(null,"Connected");
//
//            // Sample SQL query
//            
//            String sqlQuery = "select * from employee where Manager_ID = "+ emp_id;
//
//         // Execute the query
//            ResultSet resultSet = statement.executeQuery(sqlQuery);
//            
//            if (resultSet.next()) {
//                ResultSet Employees = resultSet;
//                
//                return List_All_employess_under_manager(Employees,column);
//            } else {
//                System.out.println("No matching record found.");
//                return null;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
//        }
//}



	
	
}
