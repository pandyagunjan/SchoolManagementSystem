package dao;

import dto.Staff;
import dto.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    ConnectionFactory connection = ConnectionFactory.getInstance();
    public Boolean checkUserPassword(String userName , String userPassword) {


        List<User> users= findAllUsers();
       for(int i = 0 ;i <users.size() ; i++) {
        //   System.out.println(users.get(i).toString());
           if(users.get(i).getUserName().equalsIgnoreCase(userName) && users.get(i).getUserPassword().equals(userPassword))
               return true;
       }
        return false;

    }


    public List findAllUsers() {

        try{
            Statement statement = connection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            List<User> staffMembers = new ArrayList<User>();
            while(resultSet.next()){
                User user = extractCarFromResultSet(resultSet);
                staffMembers.add(user);
            }
            return staffMembers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public User extractCarFromResultSet(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setUserName(resultSet.getString("userName"));
        user.setUserPassword(resultSet.getString("userPassword"));
        user.setStaff(Boolean.valueOf(resultSet.getString("isStaff")));
        user.setStaffId(resultSet.getInt("staffId"));
        user.setStudentId(resultSet.getInt("studentId"));
        return user;
    }
}
