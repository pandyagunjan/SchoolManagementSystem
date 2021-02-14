package runner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runner.entities.Staff;
import runner.services.StaffServices;
@RequestMapping("/staff")
@RestController
public class StaffController {
    @Autowired
    private StaffServices staffServices;

    @GetMapping(value = "/fetch/{id}")
    public ResponseEntity<?> readById(@PathVariable Long id)  {
        Staff staff = staffServices.readStaff(id);
        if(staff!=null)
        return new ResponseEntity<>(staff, HttpStatus.OK);
        else
        return new ResponseEntity<>("Staff not found", HttpStatus.NOT_FOUND);

    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> saveTheUser(@RequestBody Staff staff) {
        int result= staffServices.createStaff(staff);
        if( result == 0)
            return new ResponseEntity<>(staff, HttpStatus.OK);
        else
        if(result ==1)
            return new ResponseEntity<>("Staff already exist" , HttpStatus.ALREADY_REPORTED);
        else
            return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
    }

    @PutMapping(value = "/modify")
    public ResponseEntity<?> modifyTheUser(@RequestBody Staff staff) {
        return new ResponseEntity<>(staffServices.updateStaff(staff), HttpStatus.OK);
    }
    @DeleteMapping(value = "/remove/{id}")
    public ResponseEntity<?> deleteTheUser(@PathVariable Long id) {
        boolean resultForDelete = staffServices.removeTheStaff(id);
        if(resultForDelete)
            return new ResponseEntity<>("Staff has been deleted", HttpStatus.OK);
        else
            return new ResponseEntity<>("Staff not found", HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/home")
    public String displayHome() {
        return "Hello World";
    }
}
