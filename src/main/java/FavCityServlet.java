import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/favCity")
public class FavCityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Favorite City</h1>");
        String html = "<form method='POST'>";
        html += "<label for='search'></label>";
        html += "<input name='city' id='search' placeholder='Enter your favorite city here'>";
        html += "<br>";
        html += "<button>Submit</button>";
        html += "</form>";
        resp.getWriter().println(html);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String favoriteCity = req.getParameter("city");
        resp.sendRedirect("/favCity/results?city=" + favoriteCity);
        ///////  verifying that the city name has been sent to the server  ///////////
        System.out.println(favoriteCity);
    }
}

