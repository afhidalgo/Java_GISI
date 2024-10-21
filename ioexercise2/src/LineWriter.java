import java.io.*;

public class LineWriter {
    public static void main(String[] args) {
        File outputFile = new File("output.txt");
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Listar el contenido del archivo");
                System.out.println("2. Introducir líneas de texto");
                System.out.println("3. Salir");
                String option = consoleReader.readLine();

                switch (option) {
                    case "1":
                        listFileContent(outputFile);
                        break;
                    case "2":
                        writeToFile(outputFile, consoleReader);
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
            System.out.println("Error durante la ejecución del programa");
            ex.printStackTrace();
        } finally {
            try {
                if (consoleReader != null) {
                    consoleReader.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar el recurso de entrada");
                ex.printStackTrace();
            }
        }
    }

    // Método para listar el contenido del archivo
    private static void listFileContent(File file) {
        if (!file.exists()) {
            System.out.println("El archivo no existe. Intente introducir líneas primero.");
            return;
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Contenido del archivo:");
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
            ex.printStackTrace();
        }
    }

    // Método para escribir en el archivo
    private static void writeToFile(File file, BufferedReader consoleReader) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(file, true));
            String line;
            System.out.println("Introduce líneas de texto. Escribe 'x' para volver al menú principal.");
            while (true) {
                line = consoleReader.readLine();
                if (line.equalsIgnoreCase("x")) {
                    break;
                }
                printWriter.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Error durante la escritura en el archivo");
            ex.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}
