package model;



public class Doctor extends Department {
   String Dr_name;
    String available_time ;
    String Dr_info;



    public String getDr_name() {
        return Dr_name;
    }

    public void setDr_name(String dr_name) {
        Dr_name = dr_name;
    }

    public String getAvailable_time() {
        return available_time;
    }

    public void setAvailable_time(String available_time) {
        this.available_time = available_time;
    }

    public String getDr_info() {
        return Dr_info;
    }

    public void setDr_info(String dr_info) {
        Dr_info = dr_info;
    }

    public Doctor(String department_name, String dr_name, String available_time, String dr_info) {
        super(department_name);
        Dr_name = dr_name;
        this.available_time = available_time;
        Dr_info = dr_info;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Doctor Name :" + this.getDr_name());
        System.out.println("Doctor Name :" + this.getAvailable_time());
        System.out.println("Doctor Name :" + this.getDr_info());

    }

public void info(){
        super.info();
}


}
