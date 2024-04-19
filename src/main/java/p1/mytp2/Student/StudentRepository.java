package p1.mytp2.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Recherche d'un étudiant par son ID
    Optional<Student> findById(Long id);

}




