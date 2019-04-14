import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float ListPrice = Float.parseFloat(request.getParameter("Price"));
        float Discount = Float.parseFloat(request.getParameter("Discount"));

        float DiscountAmount = (float) (ListPrice *Discount*0.01);
        float DiscountPrice = ListPrice  - DiscountAmount;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("Discount Amount : " + DiscountAmount + "<br>");
        writer.println("Discount Price : " + DiscountPrice + "<br>");
        writer.println("</html>");

    }
}
