import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/authors")
public class AuthorsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            Authors authorsDao = DaoFactory.getAuthorsDao();
            List<Author> authors = authorsDao.all();
            req.setAttribute("authors", authors);

            req.getRequestDispatcher("/WEB-INF/quotes/authors.jsp").forward(req, resp);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String author = req.getParameter("author_name");
        try {
            Authors authorsDao = DaoFactory.getAuthorsDao();
            authorsDao.insert(new Author(0, author));
            resp.sendRedirect("/authors");


        } catch (SQLException e) {
            e.printStackTrace();
        }




    }
}
