import java.io.*;

public class WordSearch {
    public static void main(String[] args) {
        // Verificamos que se pasen dos argumentos: el archivo y la palabra
        if (args.length != 2) {
            System.out.println("Uso: java WordSearch <archivo> <palabra>");
            return;
        }

        String fileName = args[0];
        String wordToSearch = args[1];

        File file = new File(fileName);

        // Comprobamos si el archivo existe
        if (!file.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        // Procesamiento: contamos las apariciones de la palabra
        int count = countWordOccurrences(file, wordToSearch);

        // Salida: mostramos el resultado
        displayResult(wordToSearch, count);
    }

    // Método que cuenta las ocurrencias de una palabra en un archivo
    private static int countWordOccurrences(File file, String word) {
        BufferedReader fileReader = null;
        int wordCount = 0;

        try {
            fileReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = fileReader.readLine()) != null) {
                // Dividimos la línea en palabras usando espacios en blanco y otros delimitadores
                String[] words = line.trim().split("\\W+");
                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        wordCount++;
                    }
                }
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

    // Método para mostrar el resultado en pantalla
    private static void displayResult(String word, int count) {
        System.out.println("La palabra '" + word + "' aparece " + count + " veces en el archivo.");
    }
}
