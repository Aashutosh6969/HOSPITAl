package model;
import model.Patient;

import java.util.ArrayList;

public class Ward extends Hospital{

    String ward_name;
    public String getWard_name() {
        return ward_name;
    }

    public void setWard_name(String ward_name) {
        this.ward_name = ward_name;
    }


    public Ward(String ward_name) {
        this.ward_name = ward_name;
    }

public void printFormat2(){
    System.out.println("Ward Name :"+this.getWard_name());
}


}
