import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Pedimos al usuario que introduzca el nombre del archivo
            System.out.println("Introduce el nombre del archivo:");
            String fileName = consoleReader.readLine();
            File file = new File(fileName);

            // Comprobamos si el archivo existe
            if (!file.exists()) {
                System.out.println("El archivo no existe.");
                return;
            }

            // Contamos las palabras en el archivo
            int wordCount = countWordsInFile(file);
            System.out.println("El archivo contiene " + wordCount + " palabras.");

        } catch (IOException ex) {
            System.out.println("Ocurrió un error al leer el nombre del archivo.");
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

    // Método para contar las palabras en un archivo
    private static int countWordsInFile(File file) {
        BufferedReader fileReader = null;
        int wordCount = 0;

        try {
            fileReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = fileReader.readLine()) != null) {
                // Dividimos la línea en palabras usando espacios en blanco como delimitadores
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo.");
            ex.printStackTrace();
        } finally {
            // Cerramos el BufferedReader si no es nulo
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo.");
                ex.printStackTrace();
            }
        }

        return wordCount;
    }
}
