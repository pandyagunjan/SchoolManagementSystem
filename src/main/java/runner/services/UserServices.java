package runner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runner.entities.User;
import runner.repositories.UserRepo;

import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepo userRepo;

    public User createUser(User user)
    {
        return (User) userRepo.save(user);
    }
    public User readUser(Long id)
    {
        return userRepo.findUserById(id);
    }


}
