package runner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runner.controllers.LoginController;
import runner.entities.Login;
import runner.repositories.LoginRepo;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class LoginServices {
    @Autowired
    private LoginRepo loginRepo;

    private final static Logger logger = Logger.getLogger(LoginController.class.getName());

    public int createUser(Login login)
    {
        logger.log(Level.INFO, "User has been created!" + login.getUsername());
        List<Login> logins = fetchAll();
        for(Login loginFromList : logins)
        {
            if(loginFromList.getUsername().equals(login.getUsername()))
            {
                return 1;
            }
        }
         loginRepo.save(login);
         return 0; // User is successfully created
    }
    public Login readUser(Long id)
    {
        return loginRepo.findUserById(id);
    }

    public Login updateUser(Login login)
    {
        Login fetchLogin =readUser(login.getId());
        if(fetchLogin !=null)
        {
            login.setId(fetchLogin.getId());
            loginRepo.save(login);
            logger.log(Level.INFO, "User has been updated");
            return login;
        }
        logger.log(Level.WARNING, "User not found , null is being returned");
        return null;
    }


    public boolean removeTheUser(Long id) {
        Login login =readUser(id);
        if(login !=null)
        {
            loginRepo.delete(login);
            logger.log(Level.INFO, "User has been deleted");
            return true;
        }
        logger.log(Level.WARNING, "User not found , null is being returned");
        return false;
    }

    public List<Login> fetchAll()
    {
        return loginRepo.findAll();
    }
}
