import java.io.*;

public class FileComparator {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Pedimos los nombres de los archivos al usuario
            System.out.println("Introduce el nombre del primer archivo:");
            String fileName1 = bufferedReader.readLine();
            System.out.println("Introduce el nombre del segundo archivo:");
            String fileName2 = bufferedReader.readLine();

            File file1 = new File(fileName1);
            File file2 = new File(fileName2);

            // Comprobamos si los archivos son iguales
            if (compareFiles(file1, file2)) {
                System.out.println("Los archivos son iguales.");
            } else {
                System.out.println("Los archivos no son iguales.");
            }

        } catch (IOException ex) {
            System.out.println("Ocurrió un error al leer los nombres de los archivos.");
            ex.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar el recurso de entrada.");
                ex.printStackTrace();
            }
        }
    }

    // Método para comparar dos archivos byte a byte
    private static boolean compareFiles(File file1, File file2) {
        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        try {
            fis1 = new FileInputStream(file1);
            fis2 = new FileInputStream(file2);

            int byte1, byte2;
            // Leemos los archivos byte a byte
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    return false; // Los archivos no son iguales
                }
            }

            // Comprobamos si ambos archivos han llegado al final
            return fis1.read() == -1 && fis2.read() == -1;

        } catch (IOException ex) {
            System.out.println("Error al leer los archivos.");
            ex.printStackTrace();
            return false;
        } finally {
            // Cerramos los FileInputStream si no son nulos
            try {
                if (fis1 != null) {
                    fis1.close();
                }
                if (fis2 != null) {
                    fis2.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar los archivos.");
                ex.printStackTrace();
            }
        }
    }
}
