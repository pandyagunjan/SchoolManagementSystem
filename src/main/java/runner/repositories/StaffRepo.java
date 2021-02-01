package runner.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import runner.entities.Staff;

import java.util.List;

@Repository
public interface StaffRepo extends CrudRepository<Staff,Long> {

Staff findStaffById(Long Id);
Staff findStaffByLoginUsername(String name);
List<Staff> findAll();


}
