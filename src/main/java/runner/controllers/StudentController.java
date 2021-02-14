package runner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runner.entities.Student;
import runner.services.StudentServices;

@RequestMapping("/student")
@RestController
public class StudentController {
    @Autowired
    private StudentServices studentServices;

    @GetMapping(value = "/fetch/{id}")
    public ResponseEntity<?> readStudentById(@PathVariable Long id)  {
        Student student = studentServices.readStudent(id);
        if(student!=null)
            return new ResponseEntity<>(student, HttpStatus.OK);
        else
            return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);

    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> saveTheStudent(@RequestBody Student student) {
        int result= studentServices.createStudent(student);
        if( result == 0)
            return new ResponseEntity<>(student, HttpStatus.OK);
        else
        if(result ==1)
            return new ResponseEntity<>("Student already exist" , HttpStatus.ALREADY_REPORTED);
        else
            return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
    }

    @PutMapping(value = "/modify")
    public ResponseEntity<?> modifyTheStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentServices.updateStudent(student), HttpStatus.OK);
    }
    @DeleteMapping(value = "/remove/{id}")
    public ResponseEntity<?> deleteTheStudent(@PathVariable Long id) {
        boolean resultForDelete = studentServices.removeTheStudent(id);
        if(resultForDelete)
            return new ResponseEntity<>("Student has been deleted", HttpStatus.OK);
        else
            return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
    }


}
