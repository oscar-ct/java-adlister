import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessingGameServlet", urlPatterns = "/guess")
public class GuessingGameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/guessing-game.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String number = request.getParameter("number");
        int parsedNumber = Integer.parseInt(number);

        int randomNumber = (int) (Math.random() * 3 + 1);


        if (parsedNumber == randomNumber) {
            response.sendRedirect("/correct");
        } else {
            response.sendRedirect("/incorrect");
        }


    }
}