import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("1 Lancer l application");
        System.out.println("2 Quitter l application");

        System.out.print("Entrez votre choix SVP: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Lancement de l application");

                // objet Person
                Person person = new Person("inssaf bazzi", 23, false, "inssabazzi@gmail.com");

                // Cobjet Student
                List<String> courses = new ArrayList<>();
                courses.add("math");
                courses.add("phisic");

                Student student = new Student("jack lobert", 20, true, 13656, "departement 1");
                student.setCourses(courses);

                Student student2 = new Student("anna sali", 19, false, 6541, "departement 2");
                courses.add("Espagnole");
                courses.add("Programmation");
                student2.setCourses(courses);

                // object Teacher
                List<String> teacherCourses = new ArrayList<>();
                teacherCourses.add("Anglais");
                teacherCourses.add("Informatique");
                Teacher teacher = new Teacher("Jon lobi", 44, true, "lobert@ss.ss", 4545, "Social", teacherCourses);



                // objet Secretary
                Person Secretary = new Secretary("ilam", 20, true,"ilam@gmail.com" ,"social");


                // Affichage des informations
                System.out.println("Personne : " + person.getFullname() + " (" + person.getAge() + " ans, " + (person.isMale() ? "Homme" : "Femme") + ")");
                System.out.println("Etudiant: " + student.getFullname() + " (" + student.getAge() + " ans, " + (student.isMale() ? "Homme" : "Femme") + ", id: " + student.getIdstudent() + ", departement: " + student.getDepartment() + ", cours: " + student.getCourses() + ")");
                System.out.println("Prof: " + teacher.getFullname() + ", " + teacher.getAge() + ", " + teacher.isMale() + ", " + teacher.getadressMail() + ", " + teacher.getTeacherId() + ", " + teacher.getDepartment() + ", " + teacher.getCourses());

                //classe peopleManager
                PeopleManager peopleManager = new PeopleManager();
                peopleManager.addStudent(student);
                peopleManager.addStudent(student2);
                peopleManager.displayStudents();

                // trouver un etudiant par son ID
                Student foundStudent = peopleManager.findStudentById(13656);
                System.out.println("Etudiant Trouvé : " + foundStudent.getFullname());

                // Supprimer un etudiant
                peopleManager.removeStudent(student);
                peopleManager.displayStudents();


                peopleManager.addTeacher(teacher);
                peopleManager.displayTeachers();

                break;
            case 2:
                System.out.println("Au revoir ");
                break;

            default:
                System.out.println("Choix incorrecte.");
                break;
        }



    }
}