import java.io.*;

public class LineWriter {
    public static void main(String[] args) {
        File outputFile = new File("output.txt");
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        try {
            // Creamos el BufferedReader para leer las líneas del usuario
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            printWriter = new PrintWriter(outputFile);
            String line;
            System.out.println("Introduce líneas de texto. Escribe 'x' para salir.");
            while (true) {
                line = bufferedReader.readLine();
                if (line.equalsIgnoreCase("x")) {
                    break;
                }
                // Escribimos la línea en el archivo
                printWriter.println(line);
            }
            System.out.println("Las líneas se han almacenado en 'output.txt'.");
        } catch (IOException ex) {
            System.out.println("Error durante el proceso de escritura");
            ex.printStackTrace();
        } finally {
            // Cerramos el PrintWriter y BufferedReader en el bloque finally
            if (printWriter != null) {
                printWriter.close();
            }
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar los recursos");
                ex.printStackTrace();
            }
            System.out.println("Programa finalizado.");
        }
    }
}
