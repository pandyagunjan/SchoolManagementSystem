package runner.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.CascadeType.ALL;

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

   @JsonBackReference(value = "login")
   @OneToOne(mappedBy = "customer", cascade = ALL,fetch = FetchType.EAGER)
   @PrimaryKeyJoinColumn //sharing primary key with user login since creating a new user requires a login anyways
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
