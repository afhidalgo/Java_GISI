import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private static final String FILE_NAME = "agenda.txt";

    public static void main(String[] args) {
        List<Contacto> contactos = cargarContactos();
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Añadir contacto");
                System.out.println("2. Listar contactos");
                System.out.println("3. Salir");
                String option = consoleReader.readLine();

                switch (option) {
                    case "1":
                        añadirContacto(contactos, consoleReader);
                        guardarContactos(contactos);
                        break;
                    case "2":
                        listarContactos(contactos);
                        break;
                    case "3":
                        System.out.println("Saliendo del programa.");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, elija 1, 2 o 3.");
                        break;
                }
            }
        } catch (IOException ex) {
            System.out.println("Ocurrió un error durante la ejecución del programa.");
            ex.printStackTrace();
        } finally {
            try {
                if (consoleReader != null) {
                    consoleReader.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar el recurso de entrada.");
                ex.printStackTrace();
            }
        }
    }

    // Método para añadir un contacto
    private static void añadirContacto(List<Contacto> contactos, BufferedReader consoleReader) throws IOException {
        System.out.println("Introduce el nombre del contacto:");
        String nombre = consoleReader.readLine();
        System.out.println("Introduce el email del contacto:");
        String email = consoleReader.readLine();
        System.out.println("Introduce el número de teléfono del contacto:");
        String telefono = consoleReader.readLine();

        Contacto nuevoContacto = new Contacto(nombre, email, telefono);
        contactos.add(nuevoContacto);
        System.out.println("Contacto añadido con éxito.");
    }

    // Método para listar los contactos
    private static void listarContactos(List<Contacto> contactos) {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            System.out.println("Listado de contactos:");
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }

    // Método para cargar los contactos desde el archivo
    private static List<Contacto> cargarContactos() {
        List<Contacto> contactos = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return contactos;
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                contactos.add(Contacto.fromCSV(line));
            }
        } catch (IOException ex) {
            System.out.println("Error al cargar los contactos.");
            ex.printStackTrace();
        }

        return contactos;
    }

    // Método para guardar los contactos en el archivo
    private static void guardarContactos(List<Contacto> contactos) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Contacto contacto : contactos) {
                writer.println(contacto.toCSV());
            }
        } catch (IOException ex) {
            System.out.println("Error al guardar los contactos.");
            ex.printStackTrace();
        }
    }
}
