package runner.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String username;
    String password;

@JsonBackReference(value = "staff")
@OneToOne
//@PrimaryKeyJoinColumn
//@JoinColumn//(name = "staff_id")
   private Staff staff;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//    public Boolean getStaff() {
//        return isStaff;
//    }
//
//    public void setStaff(Boolean staff) {
//        isStaff = staff;
//    }
//
//    public Integer getStaffId() {
//        return staffId;
//    }
//
//    public void setStaffId(Integer staffId) {
//        this.staffId = staffId;
//    }
//
//    public Integer getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(Integer studentId) {
//        this.studentId = studentId;
//    }
}
