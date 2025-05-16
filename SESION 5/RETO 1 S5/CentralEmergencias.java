public class CentralEmergencias {
    public static void main(String[] args) {
        Operador operador1 = new Operador("Carlos");
        Operador operador2 = new Operador("María");
        Operador operador3 = new Operador("Luis");

        Ambulancia ambulancia = new Ambulancia("Ambulancia 1", operador1);
        Patrulla patrulla = new Patrulla("Patrulla 2", operador2);
        UnidadBomberos bomberos = new UnidadBomberos("Unidad Bomberos 3", operador3);

        ambulancia.iniciarOperacion();
        patrulla.iniciarOperacion();
        bomberos.iniciarOperacion();
    }
}
