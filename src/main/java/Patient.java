import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ws.rs.GET;

import javax.xml.bind.annotation.XmlRootElement;


@jakarta.xml.bind.annotation.XmlRootElement
public class Patient {

    private String name;
    private String CPR;

    public String getName() {return name;}
    public void setName(String newName){
        this.name = newName;
    }
    public String getCPR() {return CPR;}
    public void setCPR(String newCPR){
        this.CPR = newCPR;
    }

}
