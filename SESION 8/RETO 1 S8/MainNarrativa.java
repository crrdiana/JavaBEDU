public class MainNarrativa {

    private TransicionHistoria transicionHistoria;
    private GestorDialogo gestorDialogo;
    private LogicaDecision logicaDecision;

    public MainNarrativa(TransicionHistoria transicionHistoria, GestorDialogo gestorDialogo, LogicaDecision logicaDecision) {
        this.transicionHistoria = transicionHistoria;
        this.gestorDialogo = gestorDialogo;
        this.logicaDecision = logicaDecision;
    }

    public void iniciarEscena() {
        System.out.println("Iniciando una nueva escena...");
        gestorDialogo.mostrarDialogo("Narrador", "El héroe está en un cruce de caminos.");
        
        boolean decision = logicaDecision.tomarDecision();
        
        if (decision) {
            gestorDialogo.mostrarDialogo("Héroe", "He decidido tomar el camino de la izquierda.");
            transicionHistoria.realizarTransicion();
        } else {
            gestorDialogo.mostrarDialogo("Héroe", "He decidido tomar el camino de la derecha.");
            transicionHistoria.realizarTransicion();
        }
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa narrativa = new MainNarrativa(transicion, dialogo, decision);
        narrativa.iniciarEscena();
    }
}
