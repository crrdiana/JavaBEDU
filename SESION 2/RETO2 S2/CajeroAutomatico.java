import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;
        int opcion;
        
        do {
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + saldo);
                    break;
                    
                case 2:
                    System.out.print("Ingrese el monto a depositar: $");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado. Nuevo saldo: $" + saldo);
                    break;
                    
                case 3:
                    System.out.print("Ingrese el monto a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Error: saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro realizado. Nuevo saldo: $" + saldo);
                    }
                    break;
                    
                case 4:
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
        } while (opcion != 4);
        
        scanner.close();
    }
}
