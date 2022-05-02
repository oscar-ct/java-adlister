import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

///////////////////  example  /////////////////////////////////
//        if (isAdmin) {
//            request.getSession().setAttribute("isAdmin", true);
//        }
        if (validAttempt) {
            request.getSession().setAttribute("user", username);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }


    }
}
