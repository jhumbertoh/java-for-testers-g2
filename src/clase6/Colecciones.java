package clase6;

import java.util.*;

public class Colecciones {

    public static void main(String[] args) {
        //setDemo();
        //listDemo();
        //queueDemo();
        mapDemo();
    }

    public static void setDemo() {

        Set<String> frutas = new HashSet<>();
        frutas.add("manzana");
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");


        System.out.println(frutas.size());
        System.out.println(frutas);
        System.out.println();

        Iterator i = frutas.iterator();
        while (i.hasNext()) {
            System.out.println("Fruta: " + i.next());
        }

        System.out.println();

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println();

        frutas.forEach(fruta -> System.out.println(fruta));

        System.out.println();

        frutas.forEach(System.out::println);
    }

    public static void listDemo() {
        List frutas = new ArrayList();
        frutas.add("manzana");
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");


        System.out.println(frutas.get(2));
        System.out.println(frutas.size());
        System.out.println(frutas);
        System.out.println();

    }

    public static void queueDemo() {

        Queue frutas = new LinkedList();
        frutas.add("manzana");
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");

        System.out.println(frutas.size());
        System.out.println(frutas);

        frutas.remove();
        System.out.println(frutas.size());
        System.out.println(frutas);
        System.out.println(frutas.peek());
    }

    public static void mapDemo() {
        Map<String, Integer> frutaCalorias = new HashMap<>();
        frutaCalorias.put("manzana", 95);
        frutaCalorias.put("limon", 20);
        frutaCalorias.put("platano", 105);
        frutaCalorias.put("naranja", 45);
        frutaCalorias.put("limon", 17);

        System.out.println(frutaCalorias.size());
        System.out.println(frutaCalorias);

        System.out.println(frutaCalorias.get("limon"));
        System.out.println(frutaCalorias.entrySet());

        System.out.println();

        for (Map.Entry<String, Integer> entry : frutaCalorias.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "; Valor: " + entry.getValue());
        }

        System.out.println();

        frutaCalorias.forEach(
                (k, v) -> System.out.println("Fruta: " + k + "; Calorias: " + v)
        );

    }
}
