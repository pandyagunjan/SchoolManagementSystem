package runner.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import runner.entities.Staff;
import runner.entities.Student;

import java.util.List;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long> {


    Student findStudentById(Long Id);
    List<Student> findAll();
}
