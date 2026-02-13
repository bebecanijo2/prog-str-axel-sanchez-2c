import java.util.Scanner;
public class PersonaService {

    public PersonaService() {}

    Scanner sc = new Scanner(System.in);
    InputValidator input = new InputValidator();


    public void alta(Scanner sc, Persona[] personas){
        int id= input.validarEntero("Ingresa un id para empezar el alta",sc);
        int indiceInsercion=obtenerIndice(personas);
        if (indiceInsercion==-1){
            System.out.println("El arreglo eesta lleno");
            return;
        }

        if(id<0){
            System.out.println("No aceptamos valores menores que 1");
            return;
        }
        if (verificarId(personas, id)){
            System.out.println("El id ya existe dentro del arreglo");
            return;
        }
        sc.nextLine();
        System.out.print("Ingresa el nombre: ");
        String name = sc.nextLine();
        if (name.isBlank()){
            System.out.println("No aceptamos vacios en el nombre");
            return;
        }

        Persona nuevaPersona = new Persona(id, name);
        personas[indiceInsercion] = nuevaPersona;
        System.out.println("Persona dada de alta");
    }



public void listarActivas(Persona[] personas) {
    System.out.println("Personas activas: ");
    boolean hayPersonas = false;
    for (Persona persona : personas) {
        if (persona != null && persona.isActiva()) {
            System.out.println(persona);
            hayPersonas = true;
        }
    }
    if (!hayPersonas) System.out.println("No hay personas activas");
}

public void buscarPorId(Scanner sc, Persona[] personas) {

    int id = input.validarEntero("Ingresa ID a buscar: ", sc);

    for (Persona persona : personas) {
        if (persona != null && persona.getId() == id && persona.isActiva()) {
            System.out.println("Encontrado: " + persona);
            return;
        }
    }
    System.out.println("Persona no encontrada");
}

public void bajaLogica(Scanner sc, Persona[] personas) {
    int id = input.validarEntero("Ingresa ID para baja la logica: ", sc);

    for (Persona persona : personas) {
        if (persona != null && persona.getId() == id) {
            if (!persona.isActiva()) {
                System.out.println("La persona ya esta inactiva");
            } else {
                persona.setActiva(false);
                System.out.println("Baja logica realizada");
            }
            return;
        }
    }
    System.out.println("ID no encontrado");
}

public void actualizarNombre(Scanner sc, Persona[] personas) {
    int id = input.validarEntero("Ingresa ID para actualizar el nombre de la persona: ", sc);

    for (Persona persona : personas) {
        if (persona != null && persona.getId() == id && persona.isActiva()) {
            sc.nextLine();
            System.out.print("Ingresa el nuevo nombre: ");
            String nuevoNombre = sc.nextLine();

            if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
                System.out.println("Nombre vacío no permitido.");
                return;
            }

            persona.setNombre(nuevoNombre);
            System.out.println("Nombre actualizado correctamente");
            return;
        }
    }
    System.out.println("Persona no encontrada o inactiva, no se puede editar");
}


    public int obtenerIndice(Persona[] personas){
        for (int i=0; i< personas.length;i++){
            if (personas[i]==null){
                return i;
            }
        }
        return -1;
    }

    private boolean verificarId(Persona[] personas, int id) {
        for (Persona persona : personas) {
            if (persona != null && id == persona.getId()) {
                return true;
            }
        }
        return false;
    }

}
