package p1.mytp2.Student;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceMock implements StudentService {

    @Override
    public Student createStudent(Student student) {
        // Simulation de création d'un étudiant
        System.out.println("Creating student: " + student);
        // Supposons que l'opération de création réussisse, nous retournons simplement l'étudiant reçu
        return student;
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        // Simulation de la récupération d'un étudiant par son ID
        System.out.println("Retrieving student with ID: " + id);
        // Supposons que l'étudiant avec cet ID n'existe pas dans notre simulation
        return Optional.empty();
    }

    @Override
    public List<Student> getAllStudents() {
        // Simulation de la récupération de tous les étudiants
        System.out.println("Retrieving all students");
        // Dans cette simulation, nous retournons une liste vide
        return new ArrayList<>();
    }

    @Override
    public void deleteStudentById(Long id) {
        // Simulation de la suppression d'un étudiant par son ID
        System.out.println("Deleting student with ID: " + id);
        // Nous ne faisons rien dans cette simulation, car il s'agit d'une simulation
    }
}
