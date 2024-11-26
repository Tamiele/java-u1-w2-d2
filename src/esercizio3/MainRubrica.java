package esercizio3;

import java.util.HashMap;

public class MainRubrica {
    public static void main(String[] args) {

        RubricaTelefonica contatto1 = new RubricaTelefonica("Mario", 358668);

        RubricaTelefonica contatto2 = new RubricaTelefonica("Gianni", 025245);

        HashMap<String, Integer> rubrica = new HashMap<>();

        rubrica.put(contatto1.getNome(), contatto1.getNumeroDiTelefono());
        rubrica.put(contatto2.getNome(), contatto2.getNumeroDiTelefono());

        stampaRubrica(rubrica);
        aggiungiContatto(rubrica, "Giovanni", 35699785);
        rimuoviContatto(rubrica, "Mario");
        stampaRubrica(rubrica);

    }


    public static void stampaRubrica(HashMap<String, Integer> rubrica) {
        System.out.println("Rubrica:");
        for (HashMap.Entry<String, Integer> entry : rubrica.entrySet()) {
            String nome = entry.getKey();
            Integer numero = entry.getValue();
            System.out.println(nome + ": " + numero);
        }
    }

    public static void aggiungiContatto(HashMap<String, Integer> rubrica, String nome, int numero) {
        rubrica.put(nome, numero);
        System.out.println("Contatto aggiunto: " + nome + " -> " + numero);
    }



    public static void rimuoviContatto(HashMap<String, Integer> rubrica, String nome) {
        if (rubrica.containsKey(nome)) {
            rubrica.remove(nome);
            System.out.println("Contatto rimosso: " + nome);
        } else {
            System.out.println("Contatto non trovato: " + nome);
        }
    }
}
