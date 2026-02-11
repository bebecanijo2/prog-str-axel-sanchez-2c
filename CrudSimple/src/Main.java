import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("____________");
        Persona[] personas = new Persona[20];
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();


        personas[0]=persona1;
        personas[1]=persona2;
        personas[2]=persona3;




        for (int i = 0; i < sc; i++) {
            System.out.print("Introduce tu id, usuario: " + i );
            personas[i] = sc.nextInt(); // 3. Guardar input en el slot i
        }







        for (Persona persona : personas){

            try{
                System.out.println("__________");
                System.out.println(persona.getId());
                System.out.println(persona.getNombre());
                System.out.println(persona.isActiva());
            }catch (Exception e){
                System.out.println("Hay un null");

            }

            }



    }
}