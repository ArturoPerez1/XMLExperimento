package xmlexperimentando;

import java.util.Scanner;

public class MenuConsola {

    private Personas personas;
    private Persona persona;
    private EscrituraArchivoXml escritura;
    private LecturaArchivoXml lectura;
    Scanner sc;

    public void ComprobarContenido() {
        boolean menus = false;
        lectura = new LecturaArchivoXml();
        menus = lectura.VerificarContenidoArchivoEscrito();
        
        if(menus == true){
            System.out.println("hola papu\n\n");
            Menu();
        }else{
            System.out.println("hola papi\n\n");
            Menu(lectura.CargarArchivo());
        }

    }

    public void Menu() {
        sc = new Scanner(System.in);
        int opcion = 0;
        int dejarIntroducir = 0;
        personas = new Personas();

        do {
            System.out.println("MENU INTERACTIVO");
            System.out.println("1. INGRESAR PERSONA");
            System.out.println("2. MOSTRAR REGISTRO");
            System.out.println("3. SALIR");
            System.out.println("OPCION = ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        persona = new Persona();
                        System.out.println("\n\nINTRODUCIR NOMBRE =");
                        sc = new Scanner(System.in);
                        persona.setNombre(sc.nextLine());
                        System.out.println("\nINTRODUCIR APELLIDO");
                        sc = new Scanner(System.in);
                        persona.setApellido(sc.nextLine());
                        System.out.println("\nINTRODUCIR CEDULA");
                        sc = new Scanner(System.in);
                        persona.setCedula(sc.nextLine());
                        System.out.println("\nINTRODUCIR CORREO");
                        sc = new Scanner(System.in);
                        persona.setCorreo(sc.nextLine());

                        System.out.println("\n0 PARA DEJAR DE INTRODUCIR");
                        sc = new Scanner(System.in);
                        dejarIntroducir = sc.nextInt();

                        personas.AgregarPersona(persona);
                    } while (dejarIntroducir != 0);

                    escritura = new EscrituraArchivoXml();
                    escritura.EscribirArchivoXML(personas);
                    break;
                case 2:
                    lectura = new LecturaArchivoXml();
                    lectura.LeerArchivoXml();
                    break;
                case 3:
                    System.out.println("Ciao");
                    break;
                default:
                    break;
            }
        } while (opcion != 3);

    }

    public void Menu(Personas personas1) {
        sc = new Scanner(System.in);
        int opcion = 0;
        int dejarIntroducir = 0;
        personas = personas1;

        do {
            System.out.println("MENU INTERACTIVO");
            System.out.println("1. INGRESAR PERSONA");
            System.out.println("2. MOSTRAR REGISTRO");
            System.out.println("3. SALIR");
            System.out.println("OPCION = ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        persona = new Persona();
                        System.out.println("\n\nINTRODUCIR NOMBRE =");
                        sc = new Scanner(System.in);
                        persona.setNombre(sc.nextLine());
                        System.out.println("\nINTRODUCIR APELLIDO");
                        sc = new Scanner(System.in);
                        persona.setApellido(sc.nextLine());
                        System.out.println("\nINTRODUCIR CEDULA");
                        sc = new Scanner(System.in);
                        persona.setCedula(sc.nextLine());
                        System.out.println("\nINTRODUCIR CORREO");
                        sc = new Scanner(System.in);
                        persona.setCorreo(sc.nextLine());

                        System.out.println("\n0 PARA DEJAR DE INTRODUCIR");
                        sc = new Scanner(System.in);
                        dejarIntroducir = sc.nextInt();

                        personas.AgregarPersona(persona);
                    } while (dejarIntroducir != 0);

                    escritura = new EscrituraArchivoXml();
                    escritura.EscribirArchivoXML(personas);
                    break;
                case 2:
                    lectura = new LecturaArchivoXml();
                    lectura.LeerArchivoXml();
                    break;
                case 3:
                    System.out.println("Ciao");
                    break;
                default:
                    break;
            }
        } while (opcion != 3);

    }

}
