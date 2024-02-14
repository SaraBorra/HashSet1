import java.util.HashSet;
import java.util.Set;

public class Main {

    // Funzione che restituisce un HashSet riempito
    public static Set<String> creaEriempiHashSet() {
        Set<String> set = new HashSet<>();
        set.add("Elemento1");
        set.add("Elemento2");
        set.add("Elemento3");
        return set;
    }

    public static void main(String[] args) {
        // Crea e riempi l'HashSet
        Set<String> mioSet = creaEriempiHashSet();

        // Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
        String nuovoElemento = "Elemento2";

        // Verificare che l'elemento sia parte del Set e stampare il risultato
        if (mioSet.contains(nuovoElemento)) {
            System.out.println(nuovoElemento + " è parte dell'HashSet.");
        } else {
            System.out.println(nuovoElemento + " non è parte dell'HashSet.");
        }
    }
}