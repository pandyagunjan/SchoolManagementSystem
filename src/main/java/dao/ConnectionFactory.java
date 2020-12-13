package dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static java.sql.Connection connection;
    private ConnectionFactory() {
        this.connection=getConnection();
    }

    static String USER = "gunjan";
    static String PASS = "zipcode0";
    static String URL = "jdbc:mysql://localhost:3306/school";
    private static ConnectionFactory connect;//= new ConnectionFactory();

    public static ConnectionFactory getInstance()
    {
        if(connect==null)
            connect=new ConnectionFactory();
        return connect;
    }

    public static java.sql.Connection getConnection()
    {
        if(connection==null) {
            try {
                // DriverManager.registerDriver(new Driver());
                connection= DriverManager.getConnection(URL, USER, PASS);

            } catch (SQLException ex) {
                throw new RuntimeException("Error connecting to the database", ex);
            }
            //  return connection;
        }
        return connection;
    }

}
