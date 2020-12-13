package dtoTest;

import dto.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
  User user = new User();
    @Test
    public void setAndGetUserNameTest()
    {
        //Given
        String expected = "TEST";

        //When
        user.setUserName(expected);
        String actual = user.getUserName();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setAndGetPasswordTest()
    {
        //Given
        String expected = "Password";

        //When
        user.setUserPassword(expected);
        String actual = user.getUserPassword();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAndGetStudentIdTest()
    {
        //Given
        Integer expected = 125;

        //When
        user.setStudentId(expected);
        Integer actual = user.getStudentId();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setAndGetStaffIdTest()
    {
        //Given
        Integer expected = 100;

        //When
        user.setStaffId(expected);
        Integer actual = user.getStaffId();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setAndGetIsStaffTest()
    {
        //Given
        Boolean expected = true;

        //When
        user.setStaff(expected);
        Boolean actual = user.getStaff();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void toStringTest()
    {
        //Given
        user.setUserName("DhruvP");
        user.setUserPassword("pass");
        user.setStaff(true);
        user.setStudentId(0);
        user.setStaffId(125);

        String expected = "User{" +
                "userName='" + user.getUserName() + '\'' +
                ", userPassword='" + user.getUserPassword() + '\'' +
                ", isStaff=" + user.getStaff() +
                ", staffId=" + user.getStaffId() +
                ", studentId=" + user.getStudentId() +
                '}';

        //When

        String actual = user.toString();

        //Then
        Assert.assertEquals(expected,actual);
    }
}
