import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> numeri = createHashSet();
        String cinque = "cinque";
        numeri.add(cinque);
        System.out.println("Cinque è stato aggiunto alla lista? " + numeri.contains("cinque"));
    }

    public static HashSet<String> createHashSet(){
        HashSet<String> lista = new HashSet<String>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        return lista;
    }
}