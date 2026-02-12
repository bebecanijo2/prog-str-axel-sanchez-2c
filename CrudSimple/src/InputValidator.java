import java.util.Scanner;

public class InputValidator {
    public InputValidator() {
    }
    Scanner sc = new Scanner(System.in);



    public int validarEntero(String mensaje, Scanner sc){
        int value;
        while (true){
            System.out.println(mensaje);
            if (sc.hasNextInt()){
                value = sc.nextInt();

                if (value>0){
                    return value;
                }
                System.out.println("El numero no es mayor a 0");
            }else {
                System.out.println("Eso no es un numero");
                sc.nextLine();
            }
        }
    }


}
