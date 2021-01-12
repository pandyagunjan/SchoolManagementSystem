package runner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runner.controllers.UserController;
import runner.entities.User;
import runner.repositories.UserRepo;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UserServices {
    @Autowired
    private UserRepo userRepo;

    private final static Logger logger = Logger.getLogger(UserController.class.getName());

    public User createUser(User user)
    {
        logger.log(Level.INFO, "User has been created!" + user.getId());
        return userRepo.save(user);
    }
    public User readUser(Long id)
    {
        return userRepo.findUserById(id);
    }

    public User updateUser(User user)
    {
        User fetchUser=readUser(user.getId());
        if(fetchUser!=null)
        {
            user.setId(fetchUser.getId());
            userRepo.save(user);
            return user;
        }
        logger.log(Level.WARNING, "User not found , null is being returned");
        return null;
    }


    public boolean removeTheUser(Long id) {
        User user=readUser(id);
        if(user!=null)
        {
            userRepo.delete(user);
            return true;
        }
        logger.log(Level.WARNING, "User not found , null is being returned");
        return false;

    }
}
