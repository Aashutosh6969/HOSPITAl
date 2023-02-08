package model;



public class Hospital {



        String hospital_name ="Laxmi Ratna Baskota";
        String hospital_address ="Sifal" ;
        String hospital_telephone_1 = "1234567" ;
        String hospital_telephone_2 = "1234567" ;
        String hospital_telephone_3 = "1234567";


        public void printFormat(){
            System.out.println("Welcome to"+" "+ this.hospital_name);
            System.out.println("We are located at"+" "+ this.hospital_address);
            System.out.println("Contact details:"+" "+this.hospital_telephone_1+", "+this.hospital_telephone_2+", "+this.hospital_telephone_3);
            System.out.println("Laxmi Ratna Baskota Hospital was created with the vision to fill an existing void in the Nepali healthcare industry. It is dedicated to the seamless delivery of quality, patient-centric healthcare which means supplying everything a patient may need, " +
                    "from acute critical care to rehabilitation to transitional care to home healthcare services at an affordable cost. Our goal is to establish in this country a culture of continuous improvement in healthcare not only by providing excellent healthcare services but" +
                    " also by conducting community health education seminars, outreach programs, and wellness programs in several parts of Nepal." +
                    "The hospital is a 300 bedded, state of the art health care facility offering a wide range of medical, surgical and diagnostic services. The hospital has special features like a Wellness Center to help our community stay healthy. With latest in technology and a network of qualified physicians and staff, Laxmi Ratna Baskota Hospital is your destination for the best healthcare services the country has to offer.");
       }
public void info(){
    System.out.println("Welcome to"+" "+ this.hospital_name);
    System.out.println("We are located at"+" "+ this.hospital_address);
    System.out.println("Contact details:"+" "+this.hospital_telephone_1+", "+this.hospital_telephone_2+", "+this.hospital_telephone_3);
    System.out.println("Laxmi Ratna Baskota Hospital was created with the vision to fill an existing void in the Nepali healthcare industry.");
    System.out.println(" It is dedicated to the seamless delivery of quality, patient-centric healthcare which means supplying everything a patient may need, ");
    System.out.println( "from acute critical care to rehabilitation to transitional care to home healthcare services at an affordable cost.");
}
    }

