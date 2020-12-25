package runner.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    Long id;
    String userName;
    String userPassword;
    Boolean isStaff;
    Integer staffId;
    Integer studentId;

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }
}
