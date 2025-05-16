
public class Main {
    public static void main(String[] args) {
        // Crear la declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("RFC12345", 5000.00);
        
        // Crear la cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("RFC12345", 20000.00);
        
        // Mostrar la información
        System.out.println("Declaración de impuestos:");
        System.out.println("RFC: " + declaracion.rfcContribuyente());
        System.out.println("Monto declarado: $" + declaracion.montoDeclarado());
        
        System.out.println("\nCuenta fiscal:");
        System.out.println("RFC: " + cuenta.getRfc());
        System.out.println("Saldo disponible: $" + cuenta.getSaldoDisponible());

        // Validar si el RFC coincide
        if (cuenta.validarRFC(declaracion)) {
            System.out.println("\nEl RFC coincide con la cuenta fiscal.");
        } else {
            System.out.println("\nEl RFC NO coincide con la cuenta fiscal.");
        }
    }
}
