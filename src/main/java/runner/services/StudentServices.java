package runner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runner.entities.Student;
import runner.repositories.StudentRepo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class StudentServices {
    @Autowired
    private StudentRepo studentRepo;

    private final static Logger logger = Logger.getLogger(StaffServices.class.getName());

    public int createStudent(Student student) {
        logger.log(Level.INFO, "Student has been created!" + student.getFirstName());
        studentRepo.save(student);
        return 0; // Student is successfully created
    }

    public Student readStudent(Long id) {
        return studentRepo.findStudentById(id);
    }

    public Student updateStudent(Student student) {
        Student fetchLogin = readStudent(student.getId());
        if (fetchLogin != null) {
            student.setId(fetchLogin.getId());
            studentRepo.save(student);
            logger.log(Level.INFO, "Student has been updated");
            return student;
        }
        logger.log(Level.WARNING, "Student not found , null is being returned");
        return null;
    }


    public boolean removeTheStudent(Long id) {
        Student fetchLogin = readStudent(id);
        if (fetchLogin != null) {
            studentRepo.delete(fetchLogin);
            logger.log(Level.INFO, "Student has been deleted");
            return true;
        }
        logger.log(Level.WARNING, "Student not found , null is being returned");
        return false;
    }

    public List<Student> fetchAll() {
        return studentRepo.findAll();
    }

}
