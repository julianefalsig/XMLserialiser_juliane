import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.ws.rs.*;
import java.io.IOException;
import java.lang.constant.Constable;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("patient")

public class PatientService {
    XmlMapper mapper = new XmlMapper();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Patient getPatient() throws JsonProcessingException {
        Patient patient = new Patient();
        patient.setName("hanne");
        patient.setCPR("12345");
        //String xmlString = mapper.writeValueAsString(patient);
        //return xmlString;
        return patient;
    }
}








