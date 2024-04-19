package p1.mytp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import p1.mytp2.Configuration.ApplicationConfig;
import p1.mytp2.Student.Student;
import p1.mytp2.Student.StudentService;

public class Main {
    public static void main(String[] args) {
        // Créer un contexte Spring en utilisant la classe de configuration ApplicationConfig
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Récupérer le bean StudentService du contexte
        StudentService studentService = context.getBean(StudentService.class);

        // Utiliser les méthodes du service StudentService
        // Par exemple, créer un nouvel étudiant
        Student newStudent = new Student("kaoutar", "laouaj", 23, "kaoutar.laouaj@ump.ac.ma");
        Student student1 = new Student("Alice", "Smith", 22, "alice.smith@example.com");
        Student student2 = new Student("Bob", "Johnson", 21, "bob.johnson@example.com");
       // La creation :
        studentService.createStudent(newStudent);
        studentService.createStudent(student1);
        studentService.createStudent(student2);
        // Récupérer un étudiant par son ID
        Long studentId = 1L;
        studentService.getStudentById(studentId)
                .ifPresent(student -> System.out.println("Student with ID " + studentId + ": " + student));

        // Récupérer tous les étudiants
        System.out.println("All students:");
        studentService.getAllStudents().forEach(System.out::println);

        // Supprimer un étudiant par son ID
        // Par exemple, supprimer l'étudiant avec l'ID 1
        studentService.deleteStudentById(1L);

        // Afficher tous les étudiants après la suppression
        System.out.println("All students after deletion:");
        studentService.getAllStudents().forEach(System.out::println);
        // Fermer le contexte Spring
        context.close();
    }
}
