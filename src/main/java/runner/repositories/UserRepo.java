package runner.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import runner.entities.User;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {

    User findUserById(Long id);
    List<User> findAll();
}
