import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/favCity/results")
public class FavCityServletResults extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String favoriteCity = req.getParameter("city");
        resp.getWriter().println("<h1>" + favoriteCity + " is awesome!" + "<h1>");
    }
}