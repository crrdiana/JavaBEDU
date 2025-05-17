import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ProcesadorDeErrores {

    public static void main(String[] args) {
        // Ruta del archivo de logs
        String rutaArchivo = "errores.txt";
        
        // Contadores para errores y advertencias
        int totalLineas = 0;
        int cantidadErrores = 0;
        int cantidadAdvertencias = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            
            // Leer el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                totalLineas++; // Aumentar el contador de líneas
                if (linea.contains("ERROR")) {
                    cantidadErrores++; // Incrementar contador de errores
                } else if (linea.contains("WARNING")) {
                    cantidadAdvertencias++; // Incrementar contador de advertencias
                }
            }

            // Mostrar el resumen
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + cantidadErrores);
            System.out.println("Cantidad de advertencias: " + cantidadAdvertencias);
            
            // Calcular y mostrar el porcentaje de errores y advertencias
            if (totalLineas > 0) {
                double porcentajeErrores = (double) cantidadErrores / totalLineas * 100;
                double porcentajeAdvertencias = (double) cantidadAdvertencias / totalLineas * 100;
                System.out.println("Porcentaje de líneas con errores: " + porcentajeErrores + "%");
                System.out.println("Porcentaje de líneas con advertencias: " + porcentajeAdvertencias + "%");
            } else {
                System.out.println("No se leyeron líneas en el archivo.");
            }
            
        } catch (IOException e) {
            // Si ocurre un error al leer el archivo, guardar el mensaje en un archivo de fallos
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("registro_fallos.txt"))) {
                bw.write("El archivo de entrada no existe: " + rutaArchivo);
            } catch (IOException ex) {
                System.out.println("Error al escribir en el archivo de fallos: " + ex.getMessage());
            }
        }
    }
}
