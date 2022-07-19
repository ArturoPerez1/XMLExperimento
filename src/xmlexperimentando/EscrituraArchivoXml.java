package xmlexperimentando;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class EscrituraArchivoXml {

    public EscrituraArchivoXml() {
    }

    public void EscribirArchivoXML(Personas datosPersonas) {
        try {
            JAXBContext context = JAXBContext.newInstance(Personas.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            try {
                marshaller.marshal(datosPersonas, new FileWriter("DatosPersona.xml"));
            } catch (IOException ex) {
                Logger.getLogger(EscrituraArchivoXml.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (JAXBException ex) {
            Logger.getLogger(EscrituraArchivoXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
