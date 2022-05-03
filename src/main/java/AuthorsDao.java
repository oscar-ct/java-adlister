import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDao implements Authors {
    private Connection connection;

    public AuthorsDao() throws SQLException {
        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(), config.getUser(), config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Author> all() {
        List<Author> authors = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.authors");
            while(rs.next()) {
                Author author = new Author(
                        rs.getLong("id"),
                        rs.getString("author_name")
                );
                authors.add(author);
            }

        } catch (SQLException sqle) {
            throw new RuntimeException("error connecting to database", sqle);
        }
        return authors;
    }



    @Override
    public Author getAuthorById(long author_id) {
        Author author = null;

        try {

            Statement statement1 = connection.createStatement();
            ResultSet rs1 = statement1.executeQuery("SELECT * FROM codeup_test_db.authors WHERE id =" + author_id);

            while (rs1.next()) {
                author = new Author(
                        rs1.getLong("id"),
                        rs1.getString("author_name")
                );
            }
        } catch (SQLException sqle) {
            throw new RuntimeException("error connecting to database", sqle);
        }



        return author;
    }



    @Override
    public long insert(Author author) {
        String author_name = author.getAuthor_name();
        String query = "INSERT INTO codeup_test_db.authors (author_name) VALUES ('" + author_name + "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            long key = rs.getLong(1);
            return key;
        } catch (SQLException sqle) {
            throw new RuntimeException("error connecting to database", sqle);
        }

    }






}
