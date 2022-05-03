import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuotesDao implements Quotes {
    private Connection connection;

    public QuotesDao() throws SQLException {
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
    public List<Quote> all() {
        List<Quote> quotes = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.quotes");
            while(rs.next()) {

                long author_id = rs.getLong("author_id");
                AuthorsDao authors = new AuthorsDao();

                Quote quote = new Quote(
                        rs.getLong("id"),
                        rs.getString("content"),
                        authors.getAuthorById(author_id)
                );
                quotes.add(quote);
            }

        } catch (SQLException sqle) {
            throw new RuntimeException("error connecting to database", sqle);
        }
        return quotes;
    }



//    @Override
//    public List<Quote> all() {
//        List<Quote> quotes = new ArrayList<>();
//
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.quotes");
//            while(rs.next()) {
/////////////////////////////////////////////////////////////////////////////////////
//                long author_id = rs.getLong("author_id");
//                Author author = null;
//
//                Statement statement1 = connection.createStatement();
//                ResultSet rs1 = statement1.executeQuery("SELECT * FROM codeup_test_db.authors WHERE id =" + author_id);
//
//                while(rs1.next()) {
//                    author = new Author(
//                            rs1.getLong("id"),
//                            rs1.getString("author_name")
//                    );
//                }
////////////////////////////////////////////////////////////////////////////////////////
//                Quote quote = new Quote(
//                        rs.getLong("id"),
//                        rs.getString("content"),
//                        author
//                );
//                quotes.add(quote);
//            }
//
//        } catch (SQLException sqle) {
//            throw new RuntimeException("error connecting to database", sqle);
//        }
//        return quotes;
//    }



    @Override
    public void insert(Quotes quotes) {

    }
}
