import java.io.*;
public class Example4 {
    public static void main(String[] args) {
        File file1 = new File("original.txt");
        File file2 = new File("copia.txt");
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        try {
            fileInputStream = new FileInputStream(file1);
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String texto = bufferedReader.readLine();
            printWriter = new PrintWriter(file2);
            do {
                System.out.println(texto);
                printWriter.println(texto);
            } while ((texto = bufferedReader.readLine()) != null);
        } catch (IOException ex) {
            System.out.println("Error durante el proceso de copia");
            ex.printStackTrace();
        } finally {
            // Cierre de recursos
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (printWriter != null) {
                    printWriter.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar los recursos");
                ex.printStackTrace();
            }
            System.out.println("Programa finalizado.");
        }
    }
}