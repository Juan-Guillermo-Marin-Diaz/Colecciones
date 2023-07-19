import java.util.*;

public class AgregarObjetos {

    public static void main(String[] args) {
        //Listas
        ArrayList<Integer> numerosA = new ArrayList<>();
        numerosA.add(10);
        numerosA.add(105);
        numerosA.add(0);
        numerosA.add(1);
        numerosA.add(1000);

        for (Integer elementos : numerosA
        ) {
            System.out.println(elementos);
        }
        System.out.println("-------------------------------");
        // Conjuntos
        TreeSet<String> numerosB = new TreeSet<>();
        numerosB.add("cruel");
        numerosB.add("cruel");
        numerosB.add("cruel");
        numerosB.add("cruel");
        numerosB.add("cruel");

        for (String elementos : numerosB
        ) {
            System.out.println(elementos);
        }

        System.out.println("---------------------------------");

        //Mapas
        HashMap<Integer, String> alumnos = new HashMap();
        alumnos.put(141425226, "Carlos");
        alumnos.put(141625226, "Carla");
        alumnos.put(041425226, "Carlita");
        alumnos.put(141425726, "Carlitos");
        alumnos.put(141425226, "Carlos II");

        for (Integer elementos : alumnos.keySet()
        ) {
            System.out.println(elementos);
        }

        for (String elementos : alumnos.values()
        ) {
            System.out.println(elementos);
        }

        for (Map.Entry<Integer, String> elementos : alumnos.entrySet()
        ) {
            System.out.println(elementos);
        }
    }
}
