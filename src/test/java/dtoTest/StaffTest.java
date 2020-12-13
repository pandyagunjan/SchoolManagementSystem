package dtoTest;

import dto.Staff;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class StaffTest {
Staff staff = new Staff();
    @Test
    public void setAndGetFirstNameTest()
    {
        //Given
        String expected = "BABA";

        //When
        staff.setFirstName(expected);
        String actual = staff.getFirstName();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setAndGetLasttNameTest()
    {
        //Given
        String expected = "SEHGAL";

        //When
        staff.setLastName(expected);
        String actual = staff.getLastName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAndGetEmailTest()
    {
        //Given
        String expected = "baba.sehgal@gmail.com";

        //When
        staff.setEmail(expected);
        String actual = staff.getEmail();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setAndGetContactNumberTest()
    {
        //Given
        String expected = "512-458-8854";

        //When
        staff.setContactNumber(expected);
        String actual = staff.getContactNumber();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setAndGetStaffIdTest()
    {
        //Given
        Integer expected = 512;

        //When
        staff.setStaffId(expected);
        Integer actual = staff.getStaffId();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAndGetGenderTest()
    {
        //Given
        String expected = "Male";

        //When
        staff.setGender(expected);
        String actual = staff.getGender();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAndGetSalaryTest()
    {
        //Given
        Double expected = 1254545.00;

        //When
        staff.setSalary(expected);
        Double actual = staff.getSalary();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAndGetDateTest()
    {
        //Given
        Date expected = new Date();

        //When
        staff.setDOB(expected);
        Date actual = staff.getDOB();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void toStringTest()
    {
        //Given
        staff.setDOB(new Date());
        staff.setSalary(234234d);
        staff.setGender("Male");
        staff.setStaffId(125);
        staff.setContactNumber("233-333-4444");
        staff.setEmail("test@gmail.com");;
        staff.setLastName("LASTNAME");
        staff.setFirstName("FIRSTNAME");


        String expected = "Staff{" +
                "staffId=" + staff.getStaffId() +
                ", firstName='" + staff.getFirstName() + '\'' +
                ", lastName='" + staff.getLastName() + '\'' +
                ", email='" + staff.getEmail() + '\'' +
                ", gender='" + staff.getGender() + '\'' +
                ", DOB=" + staff.getDOB() +
                ", salary=" + staff.getSalary() +
                ", contactNumber='" + staff.getContactNumber() + '\'' +
                '}';

        //When

        String actual = staff.toString();

        //Then
        Assert.assertEquals(expected,actual);
    }
}
