import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

/// Java Database Connectivity
public class JDBCTest {

    private static List<String> getAuthors() throws SQLException {
        Config config = new Config();
        List<String> authors = new ArrayList<>();
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
             config.getUrl(), config.getUser(), config.getPassword()
     );
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT author_name FROM codeup_test_db.authors");

        while (rs.next()) {
            authors.add(rs.getString("author_name"));
        }
    return authors;
    }

    public static void main(String[] args) throws SQLException {
        List<String> authors = getAuthors();

        for (String name : authors) {
            System.out.println(name);
        }

    }

}
