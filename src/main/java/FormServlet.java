//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet(name = "FormServlet", urlPatterns = "/order-form")
//public class FormServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        resp.setHeader("content-type", "text/html");
////        resp.setContentType("text/html");
//        String output = "";
//        output += "<h1>ORDER FORM:</h1>";
//        output += "<form method=\"POST\" action=\"/order-summary>";
//        output += "<label for=\"product\">Product</label>";
//        output += "<input id=\"product\" name=\"product\" type=\"text\">";
//        output += "<br>";
//        output += "<label for=\"quantity\">Quantity</label>";
//        output += "<input id=\"quantity\" name=\"quantity\" type=\"password\">";
//        output += "<br>";
//        output += "<input type=\"submit\">";
//        output += "</form>";
//        out.println(output);
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//        String product = req.getParameter("product");
//        String quantity = req.getParameter("quantity");
//        System.out.printf("Product: %s%nQuantity: %s", product, quantity);
//    }
//}
