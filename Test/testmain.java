import java.math.BigDecimal;
import java.time.LocalDate;

import model.Employee;

public class testmain {
    public static void main(String[] args) {
        int id=101; 
        String name="Ayush";
        BigDecimal salary=new BigDecimal("50000");
        int deptid=34; 
        LocalDate date=LocalDate.of(2006,11,2); 
        String mail="test@gmail.com"; 
        String number="9839105939"; 
        String designation="SDE";
        Employee e1=new Employee (id,name,salary,deptid,date,mail,number,designation);
        System.out.println(e1.getEmployeeId());
        System.out.println(e1.getEmployeeName());
        e1.setEmployeeId(24);
        e1.setEmployeeName("BHALU");
        System.out.println(e1.getEmployeeId());
        System.out.println(e1.getEmployeeName());


        System.out.println("success");


    }
}
