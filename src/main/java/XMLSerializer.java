import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XMLSerializer {
    public static void main(String[] args)  {
        User user = new User();
        user.setUserName("juliane");
        user.setPassWord("hemmeligt password");
        XmlMapper mapper = new XmlMapper(); //opretter mapper-objekt
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try{
            String xmlString = mapper.writeValueAsString(user);
            System.out.println(xmlString);  // udskriver xml strengen
            mapper.writeValue(new File("User.xml"),user); //gemmer det til en fil
            // kode som indlæser objektet fra XML
            User userFromXML = mapper.readValue(new File("User.xml"), User.class);
            System.out.println("Read from XML: ");
            System.out.println(userFromXML);

        }catch (IOException e) {
            e.printStackTrace();
    }


    }}

