package xmlexperimentando;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class LecturaArchivoXml {

    public void LeerArchivoXml() {
        try {
            JAXBContext context = JAXBContext.newInstance(Personas.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Personas personas = (Personas) unmarshaller.unmarshal(new File("DatosPersona.xml"));

            ArrayList<Persona> persona = personas.getPersonas();
            for (Persona l : persona) {
                System.out.println("\nNombre = " + l.getNombre() + "\nApellido = " + l.getApellido() + "\nCedula = " + l.getCedula() + "\nCorreo = " + l.getCorreo());
            }

            System.out.println("\n\n");
        } catch (JAXBException ex) {
            Logger.getLogger(LecturaArchivoXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Personas CargarArchivo() {
        Personas personas = null;
        try {
            JAXBContext context = JAXBContext.newInstance(Personas.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            personas = (Personas) unmarshaller.unmarshal(new File("DatosPersona.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(LecturaArchivoXml.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return personas;
    }

    public boolean VerificarContenidoArchivoEscrito() {
        boolean retornar = false;
        File file = new File("DatosPersona.xml");

        if (file.length() == 0) {
            retornar = true;
        } else {
            retornar = false;
        }

        return retornar;
    }
}
