import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    res.getWriter().println("Hello World");
    }
}


/////////////////////////////////  Mini exercises!  /////////////////////////////////

//    Checkout to the 'servlets' tag and branch off of it into a branch called 'servlets-mini-exercises'.
//
//        0. Get the HelloWorld servlet displaying "Hello World"
//
//        1. When the user goes to "/lol", the user sees an h1 that says "LOL!"
//
//        2. When the user goes to "/greeting", the user will see an h1 with the message "Howdy, null".
//        If the user adds a query string with a key of name and a value of any name, the results will be displayed as "Howdy, WHATEVER_NAME_IN_QUERY_STRING_HERE".
//
//        3. When the user goes to "/favCity", the user sees a form where they can enter their favorite city and after submitting the form, the user should see a blank page.
//        - Define your logic in a FavoriteCity servlet
//        - User System.out.println in the doPost method of servlet to verify that the city name has been sent to the server
//
//        4. (BONUS) Add logic similar to the the search lecture example where the user is redirected to a results page where they can see the output of their favorite city in the browser