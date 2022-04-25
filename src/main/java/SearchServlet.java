import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<h1>Search Page</h1>");
        String html = "<form method='POST'>";
        html += "<label for='search'>Search</label>";
        html += "<input name='search' id='search' placeholder='Enter search term'>";
        html += "<br>";
        html += "<button>Submit</button>";
        html += "</form>";
        response.getWriter().println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        String searchTerm = req.getParameter("search");
        response.sendRedirect("/search/results?search=" + searchTerm);
    }
}
