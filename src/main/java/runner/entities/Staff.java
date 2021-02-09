package runner.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name= "Staff" ,
       uniqueConstraints = {
        @UniqueConstraint(name="staff_email_unique",columnNames="email")
       })
 public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(
            name="first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    String firstName;

    @Column(
            name="last_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    String lastName;

    @Column(
            name="email",
            nullable = false,
            columnDefinition = "TEXT"//,
          //  unique = true
    )
    String email;

    String gender;
    Date DOB;


    //private Integer age;
    Double salary;
    String contactNumber;

   @JsonBackReference(value = "staff")
   @OneToOne(cascade = ALL,fetch = FetchType.EAGER)
 //  @PrimaryKeyJoinColumn //sharing primary key with user login since creating a new user requires a login anyways
   private Login login;

   public Staff() {
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public Date getDOB() {
      return DOB;
   }

   public void setDOB(Date DOB) {
      this.DOB = DOB;
   }

   public Double getSalary() {
      return salary;
   }

   public void setSalary(Double salary) {
      this.salary = salary;
   }

   public String getContactNumber() {
      return contactNumber;
   }

   public void setContactNumber(String contactNumber) {
      this.contactNumber = contactNumber;
   }

   public Login getLogin() {
      return login;
   }

   public void setLogin(Login login) {
      this.login = login;
   }
}
