package runner.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import runner.entities.Login;

import java.util.List;

@Repository
public interface LoginRepo extends CrudRepository<Login,Long> {

    Login findUserById(Long id);
    List<Login> findAll();
}
