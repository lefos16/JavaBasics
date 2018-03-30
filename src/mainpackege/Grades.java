package mainpackege;

import java.util.HashMap;
import java.util.Map;

public class Grades {
    private String courseName;
    private Map<Integer,Integer> grades= new HashMap<>();

    public Grades(Courses course , Map<Integer, Integer> grades){
        this.courseName = course.getName();
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Map<Integer, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<Integer, Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(Students student , int grade){
        grades.put(student.getRegistrationNumber(),grade);
    }
}
