import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "QuotesServlet", urlPatterns = "/quotes")
public class QuotesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Quotes quotesDao = null;
        try {
            quotesDao = DaoFactory.getQuotesDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        List<Quote> quotes = quotesDao.all();

        req.setAttribute("quotes", quotes);
        req.getRequestDispatcher("/WEB-INF/quotes/quotes.jsp").forward(req, resp);
    }
}
