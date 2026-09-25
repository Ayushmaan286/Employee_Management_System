package model;
import java.time.*;
import java.math.*;

public class Employee {

    private int employeeId;
    private String employeeName;
    private BigDecimal employeeSalary;
    private int employeeDepartmentId;
    private LocalDate employeeDateOfJoining;
    private String employeeEmail;
    private String employeePhoneNumber;
    private String employeeDesignation;

 public Employee(int id, String name, BigDecimal salary, int deptid, LocalDate date, String mail, String number, String designation) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeSalary = salary;
        this.employeeDepartmentId = deptid;
        this.employeeDateOfJoining = date;
        this.employeeEmail = mail;
        this.employeePhoneNumber = number;
        this.employeeDesignation = designation;

    }
    //setter function
    public void setEmployeeId(int id)
    {
        this.employeeId=id;
    }
     public void setEmployeeName(String str)
    {
        this.employeeName=str;
    }
     public void setEmployeeSalary(BigDecimal sss)
    {
        this.employeeSalary=sss;
    }
    public void setEmployeeDepartmentId(int id)
    {
        this.employeeDepartmentId=id;
    }
    public void setEmployeeDateOfJoining(LocalDate dt)
    {
        this.employeeDateOfJoining=dt;
    }
    public void setEmployeeEmail(String mail)
    {
        this.employeeEmail=mail;
    }
    public void setEmployeePhoneNumber(String phone)
    {
        this.employeePhoneNumber=phone;
    }
    public void setEmployeeDesignation(String designation)
    {
        this.employeeDesignation=designation;
    }



    //getter function
    public int getEmployeeId()
    {
        return employeeId;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public BigDecimal getEmployeeSalary()
    {
        return employeeSalary;
    }
    public int getEmployeeDepartmentId()
    {
        return employeeDepartmentId;
    }
    public LocalDate getEmployeeDateOfJoining()
    {
        return employeeDateOfJoining;
    }
    public String getEmployeeEmail()
    {
        return employeeEmail;
    }
    public String getEmployeePhoneNumber()
    {
        return employeePhoneNumber;
    }
    public String getEmployeeDesignation()
    {
        return employeeDesignation;
    }

}
