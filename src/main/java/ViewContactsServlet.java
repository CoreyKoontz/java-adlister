import users.Contact;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet ("/view-contacts")
public class ViewContactsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Contact> contacts = Arrays.asList(
                new Contact("mike", "mike@email.com", "123 main st", "234-234-2345", false),
                new Contact("pam", "pam@email.com", "456 main st", "567-567-5678", true),
                new Contact("jim", "jim@email.com", "456 main st", "789-789-7890", true),
                new Contact("dwight", "dwight@email.com", "897 main st", "345-456-6547", true)
        );
        req.setAttribute("contacts", contacts);
        req.getRequestDispatcher("contacts.jsp").forward(req, resp);


        // M - WHAT IS M ???
        // C - Controller - server controlling what to do on http request
        // V - View - details of what that presentation will eventually look like
    }
}
