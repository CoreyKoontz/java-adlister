import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ChooseColorServlet", urlPatterns = "/choose-color")
public class ChooseColorServlet extends HttpServlet {

    String color;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String output = "";
        output += "<h1>Pick a Color:</h1>";
        output += "<form method='POST' action='/choose-color'>";
        output += "<label for='color'>Color: </label>";
        output += "<input id='color' name=color type='text'>";
        output += "<input type='submit'>";
        output += "</form>";
        out.println(output);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        color = req.getParameter("color");
        resp.sendRedirect("/view-color?color=" + color);

    }
}
