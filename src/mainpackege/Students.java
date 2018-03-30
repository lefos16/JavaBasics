package mainpackege;

import javafx.scene.control.PasswordField;

public class Students extends Users {

    private final int registrationNumber;
    private int semester;


   public Students(int registrationNumber){
       super();
       this.registrationNumber = registrationNumber;
   }

   public Students(String username, String password, String name, String surmane, String department, int registrationNumber,int semester){
       super(username,password,name,surmane,department);

       this.registrationNumber = registrationNumber;
       this.semester = semester;
   }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getRegistrationNumber() {

        return registrationNumber;
    }

    public void Seegrades(){ }

}
