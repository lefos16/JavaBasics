package mainpackege;

import java.util.ArrayList;
import java.util.List;

public class Professors extends Users {

    private String email;
    private List<Courses> courses = new ArrayList<>();



    public Professors(){
        super();

    }

    public Professors(String username,String password, String name, String surmane,String department,String email){
        super(username,password,name, surmane,department);
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void addCourse(Courses course){
        courses.add(course);
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }
    public void setGrades(){}
    public void getGrades(){}
}
