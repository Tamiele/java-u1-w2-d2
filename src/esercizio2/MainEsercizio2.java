package esercizio2;

import java.util.*;

public class MainEsercizio2 {
    public static void main(String[] args) {

        int n = 3;

        List<Integer> listaCasuale = listaCasuale(n);
        System.out.println("lista oridnata" + listaCasuale);

        List<Integer> listReverse = stampaLista(listaCasuale);
        System.out.println("lista ordinata e invertita" + listReverse);

        boolean stampa = true;
        listaPariDispari(listaCasuale, stampa);



    }


    public static List<Integer> listaCasuale(int n) {

        List<Integer> lista = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {

            lista.add(random.nextInt(101));
        }
        return lista;
    }

    public static List<Integer> stampaLista(List<Integer> listaPrimaria) {


        List<Integer> newList = new ArrayList<>(listaPrimaria);
        List<Integer> listReverse = new ArrayList<>(listaPrimaria);

        Collections.reverse(listReverse);
        newList.addAll(listReverse);
        return newList;
    }


    public static void listaPariDispari(List<Integer> listaNumeri, boolean stampaPari) {
        System.out.println("Valori in posizioni:" + (stampaPari ? "pari" : "dispari"));
        for (int i = 0; i < listaNumeri.size(); i++) {
            if (stampaPari && i % 2 == 0) {
                System.out.println(listaNumeri.get(i));
            } else if (!stampaPari && i % 2 != 0) {
                System.out.println(listaNumeri.get(i));
            }
        }
    }
}
