package runner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runner.entities.Login;
import runner.services.LoginServices;

@RequestMapping("/login")
@RestController
public class LoginController {
    @Autowired
    private LoginServices userServices;

    @GetMapping(value = "/fetch/{id}")
    public ResponseEntity<?> readById(@PathVariable Long id)  {
        return new ResponseEntity<>(userServices.readUser(id), HttpStatus.OK);
    }


}
