public class PagoEfectivo extends MetodoPago implements Autenticable {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return true; 
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago en efectivo procesado.");
    }
}
