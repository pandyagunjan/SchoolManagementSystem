package runner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runner.entities.User;
import runner.services.UserServices;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping(value = "/fetch/{id}")
    public ResponseEntity<?> readById(@PathVariable Long id)  {

        return new ResponseEntity<>(userServices.readUser(id), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> saveTheUser(@PathVariable User user) {

        return new ResponseEntity<>(userServices.createUser(user), HttpStatus.OK);
    }

    @PutMapping(value = "/modify")
    public ResponseEntity<?> modifyTheUser(@PathVariable User user) {

        return new ResponseEntity<>(userServices.updateUser(user), HttpStatus.OK);
    }
    @DeleteMapping(value = "/remove/{id}")
    public ResponseEntity<?> deleteTheUser(@PathVariable Long id) {

        return new ResponseEntity<>(userServices.removeTheUser(id), HttpStatus.OK);
    }
    @GetMapping(value = "/home")
    public String displayHome() {
        return "Hello World";
    }
}
