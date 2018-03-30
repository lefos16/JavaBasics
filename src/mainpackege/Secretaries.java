package mainpackege;

import java.util.Map;

public class Secretaries extends Users {

    private String phoneNum;

    public Secretaries(){

        super();
    }
    public Secretaries(String username,String password, String name, String surmane,String department,String phoneNum){
        super(username,password,name,surmane,department);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void CreateProf(){
        Professors prof = new Professors();
    }
    public void CreateStud(int regNum){
        Students std = new Students(regNum);
    }
    public void CreateCourse(){
        Courses course = new Courses();
    }
    public void addCourse(Courses course, Professors prof){
        prof.addCourse(course);

    }

    public void addGrades(Grades grd,Map<Integer,Integer> grades){
        grd.setGrades(grades);

    }

}
