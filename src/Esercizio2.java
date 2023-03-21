import java.util.*;

public class Esercizio2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> listaNumeri = new ArrayList<Integer>();
        Random random = new Random();
        System.out.println("Quanti numeri vuoi generare?");
        int quantità = scanner.nextInt();
        for (int i = 0; i < quantità; i++) {
            int number = random.nextInt(100);
            listaNumeri.add(number);
        }
        System.out.println(quantità + " Numeri casuali: " + listaNumeri.toString());
        Collections.sort(listaNumeri);
        System.out.println(quantità + " Numeri ordinati: " + listaNumeri.toString());
        ordineInverso(listaNumeri);
    }
    public static void ordineInverso(List lista) {
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Lista numeri ordine inverso: " + lista.toString());
        ordinePariDispari(lista, false );
    }
    public static void ordinePariDispari(List list, boolean b) {
        if (b = true) {
            System.out.println("Posizione pari");
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    System.out.print(list.get(i) + ",");
                }
            }
        } else {
            System.out.println("Posizione dispari");
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 != 0) {
                    System.out.print(list.get(i) + ",");
                }
            }
        }
    }
}
