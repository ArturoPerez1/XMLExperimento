package xmlexperimentando;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DatosPersonas")
@XmlType(propOrder = {"personas"})
public class Personas {

    private ArrayList<Persona> personas;

    public Personas() {
        this.personas = new ArrayList<>();
    }

    public void AgregarPersona(Persona persona_p) {
        personas.add(persona_p);
    }

    @XmlElementWrapper(name = "personas")
    @XmlElement(name = "persona")
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

}
