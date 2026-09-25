import java.math.*;
import java.time.*;

import DAO.EmployeeDAO;
import model.Employee;

public class testEmployeeDAO {
    public static void main(String[] args) {
        
        Employee employee =new Employee(0,"Test Employee",new BigDecimal("55000"),1,LocalDate.of(2026, 9, 25),"test.employee@company.com","9876543210","Software Engineer");

        EmployeeDAO dao=new EmployeeDAO();
        dao.addEmployee(employee);
    }
}
