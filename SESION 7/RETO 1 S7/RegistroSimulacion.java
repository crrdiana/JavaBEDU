import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class RegistroSimulacion {

    public static void main(String[] args) {
        try {
            Path rutaArchivo = Paths.get("config/parametros.txt");

            guardarParametros(rutaArchivo);
            if (Files.exists(rutaArchivo)) {
                System.out.println("Archivo creado correctamente.\n");
                String contenido = leerParametros(rutaArchivo);
                System.out.println("Contenido del archivo:");
                System.out.println(contenido);
            } else {
                System.out.println("El archivo no fue creado.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static void guardarParametros(Path ruta) throws IOException {
        Path carpeta = ruta.getParent();
        if (!Files.exists(carpeta)) {
            Files.createDirectories(carpeta);
        }

        String parametros = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        Files.write(ruta, parametros.getBytes(StandardCharsets.UTF_8));
    }

    public static String leerParametros(Path ruta) throws IOException {
        return Files.readString(ruta, StandardCharsets.UTF_8);
    }
}
