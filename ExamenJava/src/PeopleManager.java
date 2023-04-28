import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleManager {

    private List<Student> students;
    private List<Teacher> teachers;
    private List<Secretary> secretaries;

    public PeopleManager() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.secretaries = new ArrayList<>();
    }

    public void addStudent(Student student) {

        students.add(student);
    }

    public void removeStudent(Student student) {

        students.remove(student);
    }

    public void modifyStudent(Student student, String Fullname, int age, boolean isMale, int Idstudent, String department, List<String> courses, float average) {


        student.setFullname(Fullname);
        student.setAge(age);
        student.setMale(isMale);
        student.setIdstudent(Idstudent);
        student.setDepartment(department);
        student.setCourses(courses);
        student.setAverage(average);

    }

    public void addTeacher(Teacher teacher) {

        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {

        teachers.remove(teacher);
    }

    public void modifyTeacher(Teacher teacher, String Fullname, int age, boolean isMale, int teacherId, String department, List<String> courses) {
        teacher.setFullname(Fullname);
        teacher.setAge(age);
        teacher.setMale(isMale);
        teacher.setTeacherId(teacherId);
        teacher.setDepartment(department);
        teacher.setCourses(courses);
    }

    public void addSecretary(Secretary secretary) {
        secretaries.add(secretary);
    }

    public void removeSecretary(Secretary secretary) {
        secretaries.remove(secretary);
    }

    public void modifySecretary(Secretary secretary, String Fullname, int age, boolean isMale, String department) {
        secretary.setFullname(Fullname);
        secretary.setAge(age);
        secretary.setMale(isMale);
        secretary.setDepartment(department);
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student.getFullname() + " " + student.getIdstudent() + ")");
        }
    }

    public void displayTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getFullname() + " (" + teacher.getTeacherId() + " )");
        }
    }

    public void displaySecretaries() {
        for (Secretary secretary : secretaries) {

            System.out.println(secretary.getFullname() + " " + secretary.getDepartment() + ")");
        }
    }


    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getIdstudent() == id) {

                return student;
            }
        }
        return null;
    }

    public Teacher findTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == id) {

                return teacher;
             }
        }

        return null;
    }

    public Secretary findSecretaryByDepartment(String department) {
        for (Secretary secretary : secretaries) {
            if (secretary.getDepartment().equals(department)) {

                return secretary;}
        }
        return null;
    }


}
