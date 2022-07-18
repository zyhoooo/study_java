package JDBC;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @Description TODO
 * @ClassName ConnMysql
 * @Author 钟宇豪
 * @Date 2022/7/18 12:48
 * @Version 1.0
 */
public class ConnMysql {
    public static void main(String[] args) throws Exception {
        InputStream is = ConnMysql.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(is);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("connection = " + connection);

    }
}
