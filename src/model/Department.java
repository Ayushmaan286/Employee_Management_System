package model;
public class Department {

   private int departmentId;
   private String departmentName;

    public Department(int departmentId,String departmentName)
   {
    this.departmentId=departmentId;
    this.departmentName=departmentName;
   }
   public void setDepartmentId(int id)
   {
    this.departmentId=id;
   }
   public void setDepartmentName(String name)
   {
    this.departmentName=name;
   }
   public int getDepartmentId()
   {
    return departmentId;
   }
   public String getDepartmentName()
   {
    return departmentName;
   }

   

}
