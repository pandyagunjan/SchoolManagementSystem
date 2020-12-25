package runner.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import runner.entities.Staff;

@Repository
public interface StaffRepo extends CrudRepository<Staff,Long> {



}
