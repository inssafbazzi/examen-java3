import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{


    private int teacherId;
    private String department;

    private List<String> courses;

    public Teacher(String Fullname, int age, boolean isMale, String adressMail, int teacherId, String department, List<String> courses) {
        super(Fullname, age, isMale, adressMail);
        this.teacherId = teacherId;
        this.department = department;
        this.courses = courses;
    }

    public Teacher(String Fullname, int age, boolean isMale, int teacherId, String department) {
        super(Fullname, age, isMale);
        this.teacherId = teacherId;
        this.department = department;
        this.courses = new ArrayList<>();
    }


    public int getTeacherId() {
        return teacherId;

    }



    public void  setTeacherId(int teacherId) {
        this.teacherId = teacherId;

    }



    public String getDepartment() {
        return department;

    }



    public void setDepartment(String department) {
        this.department = department;
    }




    public List<String> getCourses() {
        return courses;
    }



    public void  setCourses(List<String> courses) {
        this.courses = courses;
    }
}
