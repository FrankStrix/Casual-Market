import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Negozio negozio = new Negozio("Negozio di Costruzioni");

        Modello modello1 = new Modello("Modello A", 2018, 6, 12, 500, 100, 50.0f);
        Modello modello2 = new Modello("Modello B", 2020, 8, 14, 300, 80, 40.0f);
        Modello modello3 = new Modello("Modello C", 2019, 10, 16, 700, 120, 70.0f);

        // 1) Inserimento dei modelli
        negozio.inserisciModello(modello1);
        negozio.inserisciModello(modello2);
        negozio.inserisciModello(modello3);

        System.out.println("Tutti i modelli presenti nel negozio:");
        for (Modello modello : negozio.getModelli()) {
            System.out.println(modello);
        }

        // 2) Modello più recente
        System.out.println("\nModello più recente:");
        System.out.println(negozio.modelloRecente());

        // 3) Prezzo minimo, medio e massimo dei singoli pezzi
        System.out.println("\nPrezzo minimo per pezzo:");
        System.out.println(negozio.minPrezzoPezzo());

        System.out.println("\nPrezzo massimo per pezzo:");
        System.out.println(negozio.maxPrezzoPezzo());

        System.out.println("\nPrezzo medio per pezzo:");
        System.out.printf("%.2f\n", negozio.mediaPrezzoPezzo());

        // 4) Scatole adatte a una certa età
        int eta = 7;
        System.out.println("\nScatole adatte per età " + eta + ":");
        for (Modello modello : negozio.scatoleEta(eta)) {
            System.out.println(modello);
        }

        // 5) Acquisto massimo di pezzi con un budget
        double budget = 100.0;
        System.out.println("\nAcquisto massimo di pezzi con un budget di " + budget + "€:");
        ArrayList<Modello> acquisti = negozio.acquistoMaxPezzi(budget);
        for (Modello modello : acquisti) {
            System.out.println(modello);
        }
    }
}
