package runner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import runner.entities.User;
import runner.services.UserServices;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class UserController {
    @Autowired
    private UserServices userServices;

    private final static Logger logger = Logger.getLogger(UserController.class.getName());

    @GetMapping(value = "/read/{id}")
    public ResponseEntity<User> readById(@PathVariable Long id) throws Exception {
        logger.log(Level.INFO, "This is an information !");
        logger.log(Level.SEVERE, "Terrible Error!");
        logger.log(Level.WARNING, "Not So Bad Error , Its Warning!");
        return new ResponseEntity<>(userServices.readUser(id), HttpStatus.OK);
    }


    @GetMapping(value = "/home")
    public String displayHome() {
        return "Hello World";
    }
}
