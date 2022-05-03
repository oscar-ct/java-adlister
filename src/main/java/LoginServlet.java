import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

///////////////////  example  /////////////////////////////////
//        if ((boolean)request.getSession().getAttribute("isAdmin") == false) {
//            response.sendRedirect("/login");
//            return;
//        }
//        request.getRequestDispatcher("/secret-admin-page.jsp").forward(request, response);
//    }
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        String title = request.getParameter("ad-title");
//        String description = request.getParameter("ad-desc");
//
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

///////////////////  example  /////////////////////////////////
//        if (isAdmin) {
//            request.getSession().setAttribute("isAdmin", true);
//        }


        if (validAttempt) {

            ArrayList<Ad> ads = new ArrayList<>();

            request.getSession().setAttribute("user", username);
            request.getSession().setAttribute("wishlist", ads);

//            ads.add(new Ad (title, description));


            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }


    }
}
