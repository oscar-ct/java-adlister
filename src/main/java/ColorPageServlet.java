import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ColorPageServlets", urlPatterns = "/pickcolor")
public class ColorPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/color-selector.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String favoriteColor = request.getParameter("color");
        request.setAttribute("color", favoriteColor);

        response.sendRedirect("/viewcolor?color=" + favoriteColor);


//        This is an alternative method to reproduce the above query
//        request.getRequestDispatcher("/color-viewer.jsp").forward(request, response);


    }
}
