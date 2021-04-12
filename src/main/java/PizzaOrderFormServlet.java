import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderFormServlet", urlPatterns = "/pizza-order")
public class PizzaOrderFormServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("order.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Crust: " + req.getParameter("crust-selection"));
        System.out.println("Sauce: " + req.getParameter("sauce-selection"));
        System.out.println("Size: " + req.getParameter("size-selection"));
    }
}
