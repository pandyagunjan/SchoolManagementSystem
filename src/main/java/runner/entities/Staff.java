package runner.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
 public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(nullable = false,name="firstname")
    String firstName;
    @Column(nullable = false,name="lastname")
    String lastName;
    @Column(nullable = false,name="email")
    String email;
    @Column(nullable = false,name="gender")
    String gender;
    @Column(nullable = true,name="DOB")
    Date DOB;
    @Column(nullable = false,name="salary")
    Double salary;
    @Column(nullable = true,name="contactnumber")
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
