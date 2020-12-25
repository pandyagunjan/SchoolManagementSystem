package runner.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
 public class Staff {
    @Id
    Long id;
    @Column(nullable = false)
    String firstName;
    @Column(nullable = false)
    String lastName;
    @Column(nullable = false)
    String email;
    @Column(nullable = false)
    String gender;
    @Column(nullable = false)
    Date DOB;
    @Column(nullable = true)
    Double salary;
    @Column(nullable = false)
    String contactNumber;

    public Staff() {
    }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
