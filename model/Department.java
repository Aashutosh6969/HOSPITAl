package model;

public class Department extends Hospital{

    String department_name;
    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }



    public Department(String department_name) {
        this.department_name = department_name;
    }

    public void getInfo(){
        System.out.println("Department name :" + this.getDepartment_name());
    }







}
