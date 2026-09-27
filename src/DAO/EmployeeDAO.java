package DAO;
import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
// import java.util.*;

import model.Employee;
import util.jdbc_utility;

public class EmployeeDAO {

    public void addEmployee(Employee employee) 
    {
        Connection connect = null;
        PreparedStatement statement = null;

        connect = jdbc_utility.get_connection();
        String sql = "INSERT INTO employee(employee_name,employee_salary,employee_department_id,employee_date_of_joining,employee_email,employee_phone_number,employee_designation) VALUES(?,?,?,?,?,?,?)";
        try {
            statement = connect.prepareStatement(sql);
     
            String name =employee.getEmployeeName();
            BigDecimal salary = employee.getEmployeeSalary();
            int departmentId = employee.getEmployeeDepartmentId();
            LocalDate dateOfJoining = employee.getEmployeeDateOfJoining();
            String email = employee.getEmployeeEmail();
            String phoneNumber = employee.getEmployeePhoneNumber();
            String designation = employee.getEmployeeDesignation();

            statement.setString(1,name);
            statement.setBigDecimal(2,salary);
            statement.setInt(3,departmentId);
            statement.setDate(4,java.sql.Date.valueOf(dateOfJoining));
            statement.setString(5,email);
            statement.setString(6,phoneNumber);
            statement.setString(7,designation);
            int rows_affected = statement.executeUpdate();

            System.out.println("rows affected"+rows_affected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        jdbc_utility.close_connection(connect, statement);
    }
    public Employee getEmployeeById(int id)
    {
        // return employee information corresponding to the id 
        Connection connect = null;
        PreparedStatement statement = null;
        ResultSet rs=null;

        connect=jdbc_utility.get_connection();
        String sql="SELECT * FROM employee WHERE employee_id=?";
        try
        {
            statement=connect.prepareStatement(sql);
            statement.setInt(1,id);
            rs=statement.executeQuery();
            if(rs.next())
            {
                String name =rs.getString(2);
                BigDecimal salary=rs.getBigDecimal(3); 
                int department = rs.getInt(4);
                LocalDate dateOfJoining=rs.getDate(5).toLocalDate();
                String email=rs.getString(6);
                String phoneNumber=rs.getString(7);
                String designation=rs.getString(8);

                Employee employee=new Employee(id, name, salary, department, dateOfJoining, email, phoneNumber, designation); 
                
                return employee;
            }
            else 
            {
                return null;
            }

        }
        catch(SQLException es)
        {
            es.printStackTrace();
            return null;
        }
        finally
        {
            jdbc_utility.close_connection(connect, statement, rs);
        }
    }


}
/*

 */