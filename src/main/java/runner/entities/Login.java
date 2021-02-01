package runner.entities;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String userName;
    String userPassword;
//    @Column(name= "isStaff")
//    Boolean isStaff;
//    Integer staffId;
//   // @OneToOne(cascade = ALL, fetch = FetchType.EAGER)
//   // Staff staff;
//    //Look into this
//    Integer studentId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
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
