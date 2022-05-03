import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/wishlist")
public class WishlistServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getSession().getAttribute("user") == null) {
            resp.sendRedirect("/login");
            return;
        }

        req.getRequestDispatcher("/WEB-INF/wishlist.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        ArrayList<Ad> ads = new ArrayList<>();
//        req.getSession().setAttribute("wishlist", ads);

        if (req.getParameter("clear") != null) {
            req.getSession().setAttribute("wishlist", new ArrayList<>());
            resp.sendRedirect("/wishlist");
            return;
        }

        String title = req.getParameter("ad-title");
        String description = req.getParameter("ad-desc");

        ArrayList<Ad> ads = (ArrayList<Ad>) req.getSession().getAttribute("wishlist");
        ads.add(new Ad (title, description));
        req.getSession().setAttribute("wishlist", ads);
        resp.sendRedirect("/ads");

    }

}
