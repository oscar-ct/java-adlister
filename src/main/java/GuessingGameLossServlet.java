import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LossGuessingGameServlet", urlPatterns = "/incorrect")
public class GuessingGameLossServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String results = "Unfortunately, you guessed the incorrect number!";
        request.setAttribute("results", results);

        request.getRequestDispatcher("/guessing-game-viewer.jsp").forward(request, response);

    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

}
