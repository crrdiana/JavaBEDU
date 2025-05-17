import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class RegistroDeMuestras {

    public static void main(String[] args) {
        
        ArrayList<String> listaDeMuestras = new ArrayList<>();
        listaDeMuestras.add("Homo sapiens");
        listaDeMuestras.add("Mus musculus");
        listaDeMuestras.add("Arabidopsis thaliana");
        listaDeMuestras.add("Homo sapiens");
        
        HashSet<String> especiesUnicas = new HashSet<>(listaDeMuestras);
        
        HashMap<String, String> idMuestraAInvestigador = new HashMap<>();
        idMuestraAInvestigador.put("M-001", "Dra. López");
        idMuestraAInvestigador.put("M-002", "Dr. Hernández");
        idMuestraAInvestigador.put("M-003", "Dra. Sánchez");

        System.out.println("Lista completa de muestras (en orden de llegada):");
        for (String muestra : listaDeMuestras) {
            System.out.println("- " + muestra);
        }

        System.out.println("\nEspecies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\nRelación ID de muestra → Investigador:");
        for (String id : idMuestraAInvestigador.keySet()) {
            String investigador = idMuestraAInvestigador.get(id);
            System.out.println(id + " → " + investigador);
        }

        System.out.println("\nBúsqueda por ID de muestra:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un ID de muestra (ej. M-002): ");
        String idBuscado = scanner.nextLine();

        if (idMuestraAInvestigador.containsKey(idBuscado)) {
            System.out.println("El investigador responsable es: " + idMuestraAInvestigador.get(idBuscado));
        } else {
            System.out.println("No se encontró una muestra con ese ID.");
        }

        scanner.close();
    }
}
