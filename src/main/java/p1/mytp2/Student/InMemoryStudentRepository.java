package p1.mytp2.Student;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

// le probleme avec cette implementation c'est que on doit redefinir
// toutes les methodes existe dans JpaRepository<Student, Long>
// et non pas avec StudentRepository seluement
@Repository
public class InMemoryStudentRepository implements StudentRepository {
    // Simulation du stockage en mémoire des étudiants
    private final Map<Long, Student> studentMap = new HashMap<>();
    private long nextId = 1;

    @Override
    public Student save(Student student) {
        if (student.getId() == null) {
            // Attribution d'un nouvel ID si l'ID de l'étudiant est nul
            student.setId(nextId++);
        }
        // Enregistrement de l'étudiant dans la map
        studentMap.put(student.getId(), student);
        return student;
    }

    @Override
    public Optional<Student> findById(Long id) {
        // Recherche de l'étudiant par son ID dans la map
        return Optional.ofNullable(studentMap.get(id));
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public <S extends Student> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        // Récupération de tous les étudiants dans la map
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public List<Student> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        // Suppression de l'étudiant par son ID dans la map
        studentMap.remove(id);
    }

    @Override
    public void delete(Student entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Student> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Student> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Student> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Student> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Student getOne(Long aLong) {
        return null;
    }

    @Override
    public Student getById(Long aLong) {
        return null;
    }

    @Override
    public Student getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Student> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Student> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Student> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Student> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Student> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Student> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Student, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public List<Student> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Student> findAll(Pageable pageable) {
        return null;
    }
}
