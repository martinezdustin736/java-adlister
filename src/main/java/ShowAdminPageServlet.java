import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import javax.servlet.ServletException;

@WebServlet(name = "ShowAdminPageServlet", urlPatterns = "/secret-admin-page")
public class ShowAdminPageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        if((Boolean) session.getAttribute("isAdmin") == false){
            response.sendRedirect("/login");
            return;
        }
        request.getRequestDispatcher("/secret-admin-page.jsp").forward(request, response);

    }
}