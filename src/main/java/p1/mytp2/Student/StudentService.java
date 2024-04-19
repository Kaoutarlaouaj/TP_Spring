package p1.mytp2.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    // Création d'un nouvel étudiant
    Student createStudent(Student student);

    // Recherche d'un étudiant par son ID
    Optional<Student> getStudentById(Long id);

    // Récupération de tous les étudiants
    List<Student> getAllStudents();

    // Suppression d'un étudiant par son ID
    void deleteStudentById(Long id);
}

