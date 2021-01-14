package runner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runner.entities.User;
import runner.services.UserServices;

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
    public ResponseEntity<?> saveTheUser(@RequestBody User user) {
        int result= userServices.createUser(user);
        if( result == 0)
            return new ResponseEntity<>(user, HttpStatus.OK);
        else
         if(result ==1)
            return new ResponseEntity<>("User already exist" , HttpStatus.ALREADY_REPORTED);
         else
            return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
    }

    @PutMapping(value = "/modify")
    public ResponseEntity<?> modifyTheUser(@PathVariable User user) {
        return new ResponseEntity<>(userServices.updateUser(user), HttpStatus.OK);
    }
    @DeleteMapping(value = "/remove/{id}")
    public ResponseEntity<?> deleteTheUser(@PathVariable Long id) {
        boolean resultForDelete = userServices.removeTheUser(id);
        if(resultForDelete)
        return new ResponseEntity<>("User has been deleted", HttpStatus.OK);
        else
        return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/home")
    public String displayHome() {
        return "Hello World";
    }
}
