import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int Idstudent;
    private String department;
    private List<String> SpokenLanguages ;
    private List<String> Degree ;
    private List<String> courses;
    private List<String> Competence ;

    private float average;


    public Student(String Fullname, int age, boolean isMale, String adressMail, int Idstudent, String department, List<String> courses, List<String> Competence, List<String> SpokenLanguages, List<String> Degree, float average) {
        super(Fullname, age, isMale, adressMail);
        this.Idstudent = Idstudent;
        this.department = department;
        this.courses = courses;
        this.Competence = Competence;
        this.SpokenLanguages = SpokenLanguages;
        this.Degree = Degree;
        this.average = average;
    }

    public Student(String Fullname, int age, boolean isMale, int Idstudent, String department) {
        super(Fullname, age, isMale);
        this.Idstudent = Idstudent;
        this.department = department;

        this.courses = new ArrayList<>();
        this.average = 0;
    }


    public int getIdstudent() {
        return Idstudent;
    }


    public void setIdstudent(int Idstudent) {
        this.Idstudent = Idstudent;
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

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }



    public List<String> getCompetence() {
        return Competence;
    }

    public void setCompetence(List<String> Competence) {
        this.Competence = Competence;
    }




    public List<String> getSpokenLanguages() {
        return SpokenLanguages;
    }

    public void setSpokenLanguages(List<String> SpokenLanguages) {
        this.SpokenLanguages = SpokenLanguages;
    }



    public List<String> getDegree() {
        return Degree;
    }

    public void setSDegree(List<String> Degree) {
        this.Degree = Degree;
    }




    public float getAverage() {
        return average;
    }


    public void setAverage(float average) {
        this.average = average;
    }

}
