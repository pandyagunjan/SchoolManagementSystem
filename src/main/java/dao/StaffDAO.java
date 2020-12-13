package dao;

import dto.Staff;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StaffDAO {

    ConnectionFactory connection = ConnectionFactory.getInstance();
    public List findAllStaff() {

            try{
                Statement statement = connection.getConnection().createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM staff");
                List<Staff> staffMembers = new ArrayList<Staff>();
                while(resultSet.next()){
                    Staff staff = extractCarFromResultSet(resultSet);
                    staffMembers.add(staff);
                }
                return staffMembers;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }


    private Staff extractCarFromResultSet(ResultSet resultSet) throws SQLException {
        Staff staff = new Staff();
        staff.setStaffId(resultSet.getInt("staffId"));
        staff.setFirstName(resultSet.getString("firstName"));
        staff.setLastName(resultSet.getString("lastName"));
        staff.setEmail(resultSet.getString("email"));
        staff.setGender(resultSet.getString(5));
        staff.setDOB(resultSet.getDate("DOB"));
        staff.setSalary(resultSet.getDouble("salary"));
        staff.setContactNumber(resultSet.getString("contactNumber"));
        return staff;
    }

}
