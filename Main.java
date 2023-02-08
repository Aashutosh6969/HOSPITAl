

import java.util.Date;
import model.Doctor;
import model.Medicine;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int input1;
        int input2;
        int input3;
        int input4;
        String med_type;
        String med_name;
        String user_name;
        String name;
        int age;
        int phone;
        String address;
        String ward;
        boolean more_med;
        String med_type2;
        String med_name2;


        Date date = new Date();





        Doctor d1 = new Doctor("Dental","Dhan ratna Baskota","8 a.m - 10 a.m","Prosthodontist");
        Doctor d2 = new Doctor("Dental","Man Ratna Baskota","10 a.m - 12 p.m","Prosthodontist");
        Doctor d3 = new Doctor("Dental","Kabi ratna Baskota","12 p.m - 4 p.m","Prosthodontist");
        Doctor d4 = new Doctor("Physician","Ram ratna Baskota","8 a.m - 10 a.m","Prosthodontist");
        Doctor d5 = new Doctor("Physician","Hari ratna Baskota","10 a.m - 12 p.m","Prosthodontist");
        Doctor d6 = new Doctor("Physician","Madhu ratna Baskota","12 p.m - 4 p.m","Prosthodontist");
        Doctor d7 = new Doctor("Psychiatrist","Ratna ratna Baskota","8 a.m - 10 a.m","Prosthodontist");
        Doctor d8 = new Doctor("Psychiatrist","Shyam ratna Baskota","10 a.m - 12 p.m","Prosthodontist");
        Doctor d9 = new Doctor("Psychiatrist","Laxman ratna Baskota","12 p.m - 4 p.m","Prosthodontist");



        ArrayList<Doctor>dental= new ArrayList<>();
        dental.add(d1);
        dental.add(d2);
        dental.add(d3);

        ArrayList<Doctor> physician= new ArrayList<>();
        physician.add(d4);
        physician.add(d5);
        physician.add(d6);

        ArrayList<Doctor>psychiatrist= new ArrayList<>();
        psychiatrist.add(d7);
        psychiatrist.add(d8);
        psychiatrist.add(d9);
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Welcome To Laxmi Ratna Baskota");
        System.out.println("Please enter a number based on your need");
        System.out.println("1 Appointment");
        System.out.println("2 Buy medicine");
        System.out.println("3 Admit");
        System.out.println("4 Info");
        System.out.println("Enter");input1 = scanner.nextInt();

        if (input1 == 1){
            System.out.println("In which department will you like to make an appointment");
            System.out.println("1 Dental");
            System.out.println("2 Physician");
            System.out.println("2 Psychiatrist");

            System.out.println("Enter");input2 = scanner.nextInt();
            if (input2 == 1){
                System.out.println("Press 1 to select ");
                  d1.getInfo();
                System.out.println("Press 2 to select ");
                d2.getInfo();
                System.out.println("Press 3 to select ");
                d3.getInfo();

                input3 = scanner.nextInt();
                if (input3 == 1){
                    System.out.println("Your appointment is set with " + d1.getDr_name() +" at " + d1.getAvailable_time() + " at" + date);
                }
                if (input3 == 2){
                    System.out.println("Your appointment is set with " + d2.getDr_name() +" at " + d2.getAvailable_time() + " at" + date);
                }
                if (input3 == 3){
                    System.out.println("Your appointment is set with " + d3.getDr_name() +" at " + d3.getAvailable_time() + " at" + date);
                }

            }
            if (input2 == 2){
                System.out.println("Press 1 to select");
                d4.getInfo();
                System.out.println("Press 2 to select");
                d5.getInfo();
                System.out.println("Press 3 to select");
                d6.getInfo();
                input4 = scanner.nextInt();
                if (input4 == 1){
                    System.out.println("Your appointment is set with " + d4.getDr_name() +" at " + d4.getAvailable_time() + " at" + date);
                }
                if (input4 == 2){
                    System.out.println("Your appointment is set with " + d5.getDr_name() +" at " + d5.getAvailable_time() + " at" + date);
                }
                if (input4 == 3){
                    System.out.println("Your appointment is set with " + d6.getDr_name() +" at " + d6.getAvailable_time() + " at" + date);
                }
            }
            if (input2 == 3){
                System.out.println("Press 1 to select");
                d7.getInfo();
                System.out.println("Press 2 to select");
                d8.getInfo();
                System.out.println("Press 3 to select");
                d9.getInfo();
               int input5 = scanner.nextInt();
                if (input5 == 1){
                    System.out.println("Your appointment is set with " + d7.getDr_name() +" at " + d7.getAvailable_time() + " at" + date);
                }
                if (input5 == 2){
                    System.out.println("Your appointment is set with " + d8.getDr_name() +" at " + d8.getAvailable_time() + " at" + date);
                }
                if (input5 == 3){
                    System.out.println("Your appointment is set with " + d9.getDr_name() +" at " + d9.getAvailable_time() + " at" + date);
                }
            }

        }
        if (input1==2){
            System.out.println("Enter the type of medicine");
             med_type = scanner1.nextLine();
            System.out.println("Enter name");
             med_name = scanner1.nextLine();
            Medicine med1 = new Medicine(med_type,med_name,1000,2000);

            System.out.println("Do you want more medicine?");
            more_med = scanner1.nextBoolean();
            if(more_med == true){
                System.out.println("Enter the type of medicine");
                med_type2 = scanner2.nextLine();
                System.out.println("Enter name");
                med_name2 = scanner2.nextLine();
                Medicine med2 = new Medicine(med_type2,med_name2,1001,2000);

                int a  = med1.getPrice();
                int b = med2.getPrice();
                int total = a+b;
                boolean ward_room;
                System.out.println("Have you used ward room?");
                ward_room = scanner2.nextBoolean();
                if (ward_room == true){
                    int total2 = total + 2000;

                    med1.printFormat();
                    med2.printFormat();
                    System.out.println("Total price : "+ total2);
                }
                else {
                    med1.printFormat();
                    med2.printFormat();
                    System.out.println(" Total price :" + total);
                }

            }
            else {
                med1.printFormat();
                System.out.println("Total Price :" + med1.getPrice());
            }




        }
        if (input1 == 3){
            System.out.println("Enter username");
            user_name = scanner1.nextLine();
            System.out.println("Enter name");
            name = scanner1.nextLine();
            System.out.println("Enter Address");
            address = scanner1.nextLine();
            System.out.println("Enter ward you were suggested");
            ward = scanner1.nextLine();
            System.out.println("Enter your phone number");
            phone = scanner1.nextInt();

            Patient pD = new Patient(ward,user_name,name,address,phone);
            pD.printFormat2();
            System.out.println("Your admission is successful");



        }
        if (input1==4){
            d1.info();
        }




    }




}