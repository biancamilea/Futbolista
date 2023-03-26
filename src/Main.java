import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de futbolistas
        List<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(new Futbolista("9419148G", "Lionel Messi", 34, 710));
        futbolistas.add(new Futbolista("8759562N", "Cristiano Ronaldo", 37, 780));
        futbolistas.add(new Futbolista("9568754V", "Neymar Jr", 29, 225));
        futbolistas.add(new Futbolista("8696965M", "Kylian Mbappé", 21, 88));
        futbolistas.add(new Futbolista("8659561N", "Erling Haaland", 21, 85));

        // Ordenar la lista por dni
        Collections.sort(futbolistas);

        System.out.println("Futbolistas ordenados por DNI:");
        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista.toString());
        }

        // Ordenar la lista por nombre
        Collections.sort(futbolistas, Futbolista.comparadorPorNombre);

        System.out.println("\nFutbolistas ordenados por nombre:");
        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista.toString());
        }

        // Ordenar la lista por edad
        Collections.sort(futbolistas, Futbolista.comparadorPorEdad);

        System.out.println("\nFutbolistas ordenados por edad:");
        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista.toString());
        }

        // Ordenar la lista por edad y nombre
        Collections.sort(futbolistas, Futbolista.comparadorPorEdadAndNombre);

        System.out.println("\nFutbolistas ordenados por edad y nombre:");
        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista.toString());
        }

    }
}