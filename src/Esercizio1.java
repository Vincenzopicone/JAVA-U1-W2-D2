import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //// ESERCIZIO 1
        Set<String> parole = new HashSet<String>();
        Set<String> paroleDuplicate = new HashSet<String>();
        System.out.println("Quante parole vuoi inserire?");
        int numeroParole = scanner.nextInt();
        int contatore = 0;

        for (int i = 0; i < numeroParole; i++) {
            System.out.println("Inserisci stringa: ");
            String parola = scanner.next();
            boolean add = parole.add(parola);
            if (add == false) {
                System.out.println(parola);
                paroleDuplicate.add(parola);
                System.out.println("Numero parole distinte: " + contatore);
            } else if (add == true) {
                System.out.println(parola);
                contatore++;
                System.out.println("Numero parole distinte: " + contatore);
            }
            System.out.println("Lista parole distinte: "+ parole.toString());
            System.out.println("Lista parole duplicate: "+ paroleDuplicate.toString());
        };

        /// ESERCIZO 2


    }
    public static void esercizio2(int n) {

    };
}