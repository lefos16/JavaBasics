package mainpackege;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateUsers {
    public static void main(String[] args) {

        CreateUsers cc = new CreateUsers();

        Users user1 = new Users("pachulia", "pach07", "Markos", "Pacho", "Department of Economics");

        Students std1 = new Students("lefos", "aboo16", "Lefteris", "Simos", "Department of Informatics", 12142, 12);

        Professors prof1 = new Professors("pachulia", "pach07", "Markos", "Pacho", "Department of Economics", "cmit@mail.com");

        Secretaries secr1 = new Secretaries("uri", "ur1123", "Alex", "Diako", "Department of Tourism Studies", "21412424123");

        System.out.println("User created with username: " + user1.getUsername() + " , password: " + user1.getPassword() + " , name: " + user1.getName() + " , surname: " + user1.getSurname() + " , department: " + user1.getDepartment() + "\n");
        System.out.println("Student created with username: " + std1.getUsername() + " , password: " + std1.getPassword() + " , name: " + std1.getName() + " , surname: " + std1.getSurname() + " , department: " + std1.getDepartment() + " , registrationNumber: " + std1.getRegistrationNumber() + " , semester: " + std1.getSemester() + "\n");
        System.out.println("Professor created with username: " + prof1.getUsername() + " , password: " + prof1.getPassword() + " , name: " + prof1.getName() + " , surname: " + prof1.getSurname() + " , department: " + prof1.getDepartment() + " , email: " + prof1.getEmail() + "\n");
        System.out.println("Secretary created with username: " + secr1.getUsername() + " , password: " + secr1.getPassword() + " , name: " + secr1.getName() + " , surname: " + secr1.getSurname() + " , department: " + secr1.getDepartment() + " , phone: " + secr1.getPhoneNum() + "\n");

        cc.CreateStudent();

    }
        protected void CreateStudent() {
            System.out.println("Create a Student account");
            Inputhelper help = new Inputhelper();
            String userNam = help.Input("Give username :");
            String passW = help.Input("Give password :");
            String name = help.Input("Give name :");
            String surName = help.Input("Give surname:");
            String depart = help.Input("Give department:");

            try{
                String regNum = help.Input("Give registration number:");
                int regNumber = Integer.parseInt(regNum);
                String semes = help.Input("Give semester:");
                int semester = Integer.parseInt(semes);
                Students std2 = new Students(userNam,passW,name,surName,depart,regNumber,semester);
                System.out.println("Student created with username: " + std2.getUsername() + " , password: " + std2.getPassword() + " , name: " + std2.getName() + " , surname: " + std2.getSurname() + " , department: " + std2.getDepartment() + " , registrationNumber: " + std2.getRegistrationNumber() + " , semester: " + std2.getSemester() + "\n");
            }catch (NumberFormatException e){
                System.out.println("sorry expected integer for registration number and semester");
            }

            try{
                List<Students> students = new ArrayList<>();
                InputStream inp = new FileInputStream("files/students.txt");
                Scanner sc = new Scanner(inp);
                while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] kkk = line.split("-");
                int regNum = Integer.parseInt(kkk[5]);
                int semest = Integer.parseInt(kkk[6]);
                 students.add(new Students(kkk[0],kkk[1],kkk[2],kkk[3],kkk[4],regNum,semest));
                }
                for (Students std:students){
                    System.out.println("Student created with username: " + std.getUsername() + " , password: " + std.getPassword() + " , name: " + std.getName() + " , surname: " + std.getSurname() + " , department: " + std.getDepartment() + " , registrationNumber: " + std.getRegistrationNumber() + " , semester: " + std.getSemester() + "\n");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (NumberFormatException e){
                System.out.println("sorry expected integer for registration number and semester");
            }


        }

    class Inputhelper{
        public String Input(String messege){
            Scanner sc = new Scanner(System.in);
            System.out.println(messege);
            return sc.nextLine();

        }
    }
}
