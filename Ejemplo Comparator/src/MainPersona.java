import java.util.ArrayList;
import java.util.Collections;

public class MainPersona {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Jorge", 41));
        personas.add(new Persona("Juan", 21));
        personas.add(new Persona("Marisela", 33));

        for (Persona p1 : personas
             ) {

            System.out.println(p1);

        }

        System.out.println("------------------------");

        Collections.sort(personas, ComparatorPersona.compararEdad);

        for (Persona persona : personas) {

            System.out.println(persona);

        }

        System.out.println("------------------------");

        Collections.sort(personas, ComparatorPersona.compararEdadAscendente);

        for (Persona persona : personas) {

            System.out.println(persona);

        }
    }
}
