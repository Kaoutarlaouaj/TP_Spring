package p1.mytp2.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import p1.mytp2.Student.InMemoryStudentRepository;
import p1.mytp2.Student.StudentRepository;
import p1.mytp2.Student.StudentService;
import p1.mytp2.Student.StudentServiceImpl;

@Configuration
@ComponentScan(basePackages = "p1.mytp2")
public class ApplicationConfig {

    // Définition d'un bean avec @Bean
    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImpl(studentRepository);
    }

    // Si vous voulez créer un bean personnalisé sans utiliser les annotations spécifiques,
    // vous pouvez simplement créer une méthode et annoter avec @Bean
    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }
}


