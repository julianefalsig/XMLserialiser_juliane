import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.POST;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "xmlservlet", urlPatterns = "/api")
public class XMLServlet extends HttpServlet {
    XmlMapper mapper = new XmlMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = new User();
        user.setPassWord("Test Pass");
        user.setUserName("Test User");
        String xmlString = mapper.writeValueAsString(user);
        PrintWriter writer = resp.getWriter();
        writer.write(xmlString);
        writer.flush();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //TODO: Fill in
        resp.setContentType("text/html");


        PrintWriter writer = resp.getWriter();
        User user = null;
        try {
            user = mapper.readValue(req.getInputStream(), User.class);
        } catch (Exception e) {
            writer.write("Error:" + e);
        }
        writer.write("tak for brugeren:" + user);
        writer.close();
    }
   //     System.out.println(user);
     //   resp.getWriter().write("Tak for brugeren: " + user);



}


