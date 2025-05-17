import java.util.HashSet;
import java.util.Set;

public class MonitorCPU {

    public static void main(String[] args) {
        Set<Integer> registrosCPU = new HashSet<>();
        int[] consumosSimulados = {45, 88, 95, 97, 88, -5, 102}; // Datos de prueba

        for (int consumo : consumosSimulados) {
            try {
                System.out.println("Registrando consumo: " + consumo + "%");

                if (registrosCPU.contains(consumo)) {
                    System.out.println("Advertencia: consumo duplicado (" + consumo + "%), no se registra.");
                    continue;
                }

                if (consumo < 0 || consumo > 100) {
                    System.out.println("Error: valor fuera de rango permitido (0-100).");
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException("Consumo crítico detectado: " + consumo + "%");
                }

                registrosCPU.add(consumo);
                System.out.println("Consumo registrado correctamente.");

            } catch (ConsumoCriticoException e) {
                System.out.println("ALERTA: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            } finally {
                System.out.println("Ciclo de validación completado.\n");
            }
        }

        System.out.println("Registros únicos válidos: " + registrosCPU);
    }
}
