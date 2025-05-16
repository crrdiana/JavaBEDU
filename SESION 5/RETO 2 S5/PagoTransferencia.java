public class PagoTransferencia extends MetodoPago implements Autenticable {

    public PagoTransferencia(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
    
        return Math.random() > 0.5; 
    }

    @Override
    public void procesarPago() {
        if (autenticar()) {
            System.out.println("Pago por transferencia procesado.");
        } else {
            System.out.println("Validación bancaria fallida.");
        }
    }
}
