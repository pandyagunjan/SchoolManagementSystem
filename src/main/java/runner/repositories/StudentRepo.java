package runner.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import runner.entities.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long> {
}
