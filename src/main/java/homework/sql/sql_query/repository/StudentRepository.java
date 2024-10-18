package homework.sql.sql_query.repository;

import homework.sql.sql_query.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findByAgeBetween(Long min, Long max);
    @Override
    Student getById(Long id);
}
