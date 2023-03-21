import java.util.*;

public class Esercizio3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, Integer> rubrica = new HashMap<String, Integer>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il nome");
            String nome = scanner.next();
            System.out.println("Inserisci il numero");
            int numero = scanner.nextInt();
            rubrica.put(nome, numero);
        }
        System.out.println(rubrica.toString());
        System.out.println("Quale contatto vuoi cancellare?");
        String nomeDaCancellare = scanner.next();
        rubrica.remove(nomeDaCancellare);
        System.out.println(rubrica.toString());
        System.out.println("Ricerca per nome!");
        String nomeDaRicercare = scanner.next();
        ricercaDaNome((Map) rubrica, nomeDaRicercare);
        System.out.println("");
        System.out.println("Ricerca per numero!");
        int numeroDaRicercare = scanner.nextInt();
        ricercaDaNumero((Map) rubrica, numeroDaRicercare);
    }
    public static void ricercaDaNome(Map list, String x) {
        System.out.print(list.get(x));
    }
    public static void ricercaDaNumero(Map list, int x) {
       System.out.println(getKey(list, x));
    }
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
