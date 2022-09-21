import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "xmlservlet",urlPatterns = "/api")
public class XMLServlet extends HttpServlet {
    XmlMapper mapper = new XmlMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //TODO: Fill in
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       //TODO: Fill in
    }
}
