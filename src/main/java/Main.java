import org.df.modelos.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona =new Persona();
        persona.setNombre("Juan");
        persona.setEdad(Integer.parseInt("20"));
        persona.setGenero("Masculino");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getGenero());
    }
}
