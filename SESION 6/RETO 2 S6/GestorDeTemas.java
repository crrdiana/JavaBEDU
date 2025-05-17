import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

class Tema implements Comparable<Tema> {
    private String titulo;
    private int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

public class GestorDeTemas {

    public static void main(String[] args) {

        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Historia universal", 2));
        temas.add(new Tema("Geometría básica", 1));
        temas.add(new Tema("Educación emocional", 3));

        System.out.println("Temas ordenados por título:");
        Collections.sort(temas);
        for (Tema t : temas) {
            System.out.println(t);
        }

        System.out.println("\nTemas ordenados por prioridad:");
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema t : temas) {
            System.out.println(t);
        }

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Historia universal", "https://recursos.edu/historia");
        recursos.put("Geometría básica", "https://recursos.edu/geometria");
        recursos.put("Educación emocional", "https://recursos.edu/emociones");

        System.out.println("\nRepositorio de recursos:");
        for (String titulo : recursos.keySet()) {
            System.out.println(titulo + " → " + recursos.get(titulo));
        }
    }
}
