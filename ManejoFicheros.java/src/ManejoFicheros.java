import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ManejoFicheros {
    public static void main(String[] args) {
        String rutaArchivo = "datos.dat";

        // 1. ESCRITURA con FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(rutaArchivo)) {
            String texto = "Segunda version, probando el flujo de ramas de Git.";
            // Convertimos el texto a un array de bytes y lo escribimos
            fos.write(texto.getBytes());
            System.out.println("Archivo .dat creado y escrito con éxito.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }

        // 2. LECTURA con FileInputStream
        try (FileInputStream fis = new FileInputStream(rutaArchivo)) {
            System.out.println("\nLeyendo el contenido del archivo .dat:");
            int byteLeido;
            // fis.read() lee byte a byte hasta devolver -1 (Fin de archivo / EOF)
            while ((byteLeido = fis.read()) != -1) {
                System.out.print((char) byteLeido);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}