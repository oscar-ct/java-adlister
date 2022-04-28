import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/pizza-upgraded.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String pizza = request.getParameter("pizza");
//        System.out.println(pizza);
//        response.sendRedirect("/pizza-order");

        String size = request.getParameter("pizza-size");
        String crust = request.getParameter("pizza-crust");
        String sauce = request.getParameter("pizza-sauce");
        String[] toppings = request.getParameterValues("pizza-toppings");
        String address = request.getParameter("address");

        System.out.println();
        System.out.println("**** Pizza Order  ****");
        System.out.println("Size: " + size);
        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.println("Toppings: ");

        for (int i = 0; i < toppings.length; i++) {
            System.out.println(toppings[i]);
        }
        System.out.println("Address: " + address);



        response.sendRedirect("/pizza-order");


    }

}
