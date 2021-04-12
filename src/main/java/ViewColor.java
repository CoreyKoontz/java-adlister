import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/viewcolor")
public class ViewColor extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String color = req.getParameter("color"); //Pulling the req.parameter so we can change it into the attribute value in the jsp.
        req.setAttribute("color", color); //Have to use setAttribute instead of setParameter because it is being plugged into the html in the jsp???
        req.getRequestDispatcher("viewcolor.jsp").forward(req, resp); //Pointing user along with pickcolor val to viewcolor view

    }
}
