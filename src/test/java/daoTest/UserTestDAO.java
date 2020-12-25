//package daoTest;
//
//import runner.repositories.UserRepo;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class UserTestDAO {
//
//    ConnectionFactory connection = ConnectionFactory.getInstance();
//    UserRepo userDAO= new UserRepo();
//    runner.entities.User user =new runner.entities.User();
//    @Test
//    public void getUserTest() throws SQLException {
//        //Given
//        user.setUserId(11);
//        user.setUserName("GunjanP");
//        user.setUserPassword("test");
//        user.setStaff(false);
//        user.setStudentId(0);
//        user.setStaffId(101);
//       // Statement statement= connection.getConnection().createStatement();
//        PreparedStatement pstmt = connection.getConnection().prepareStatement("SELECT * FROM users WHERE userName like ?",ResultSet.TYPE_SCROLL_SENSITIVE,
//                ResultSet.CONCUR_READ_ONLY);
//        //ResultSet.CLOSE_CURSORS_OVER_COMMIT);
//        pstmt.setString(1, "GunjanP");
//        ResultSet resultSet = pstmt.executeQuery();
//       // resultSet.beforeFirst();
//       // ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE userName like "+user.getUserName());
//        resultSet.next();
//        //When
//
//        runner.entities.User actual = userDAO.extractCarFromResultSet(resultSet);
//
//        //Then
//        Assert.assertEquals(user,actual);
//    }
//}
