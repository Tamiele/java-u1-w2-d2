package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainEsercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quante frasi vuoi inserire");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> paroleSingole = new TreeSet<>();
        Set<String> paroleRipetute = new TreeSet<>();
        Set<String> paroleNellaFrase = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.println("inserisci Frase");

            String frase = scanner.nextLine();

            String[] arrayParole = frase.split(" ");


            for (String parola : arrayParole) {
                if (paroleNellaFrase.add(parola)) {
                    paroleSingole.add(parola);

                } else {
                    paroleRipetute.add(parola);
                }
            }
        }
        paroleSingole.removeAll(paroleRipetute);

        System.out.println("parole ripetute");
        for (String parola : paroleRipetute) {
            System.out.println(parola);
        }


        System.out.println("numero parole singole:" + paroleSingole.size());
        for (String parola : paroleSingole) {
            System.out.println(parola);
        }
    }
}
