import java.util.Scanner;

public class PersonaService {

    public PersonaService() {}

    Scanner sc = new Scanner(System.in);


    public void alta(Scanner sc, Persona[] personas){
        InputValidator input = new InputValidator();
        int id= input.validarEntero("Ingresa un id para empezar el alta",sc);
        if(id<0){
            System.out.println("No aceptamos valores menores que 1");
            return;
        }
        if (verificarId(personas, id)){
            System.out.println("El id ya existe dentro del arreglo");
            return;
        }
        sc.nextLine();
        String name = sc.nextLine();
        if (name.isBlank()){
            System.out.println("No aceptamos vacíos en el nombre");
            return;
        }

        Persona nuevaPersona = new Persona(id, name);


        int indiceInsercion=obtenerIndice(personas);
        if (indiceInsercion==-1){
            System.out.println("El arreglo eesta lleno");
        }
    }



    public int obtenerIndice(Persona[] personas){
        for (int i=0; i< personas.length;i++){
            if (personas[i]==null){
                return i;
            }
        }
        return -1;
    }




    public boolean verificarId(Persona[] personas, int id){
        for (Persona persona: personas){
            if (id==persona.getId()){
                return true;
            }
        }
        return false;
    }

}
