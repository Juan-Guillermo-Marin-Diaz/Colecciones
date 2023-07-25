import java.util.Comparator;

public class ComparatorPersona {

    public static Comparator<Persona> compararEdad = new Comparator<Persona>() {
        @Override
        public int compare(Persona o1, Persona o2) {
            return o2.getEdad().compareTo(o1.getEdad());
        }
    };

    public static Comparator<Persona> compararEdadAscendente = new Comparator<Persona>() {
        @Override
        public int compare(Persona o1, Persona o2) {
            return o1.getEdad().compareTo(o2.getEdad());
        }
    };


}
