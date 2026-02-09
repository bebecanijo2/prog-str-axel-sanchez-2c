import java.util.Scanner;

public class InputValidator {
    public InputValidator(){}

    Scanner sc = new Scanner(System.in);

    public String leerTextoNoVacio(String mensaje, Scanner sc){
        String value;
        while (true){
            System.out.println(mensaje);
            value = sc.nextLine();
            if (!value.equals("")){
                return value;
            }else {
                System.out.println("No puedes dejar vacío este apartado");
            }

        }
    }

    public double leerDoubleEnRango(String mensaje, Scanner sc, double min, double max){
        double value;
        while (true){
            System.out.println(mensaje);
            if (sc.hasNextDouble()){
                value = sc.nextDouble();
                if (value>min && value <= max){
                    return value;
                }
                System.out.println("El numero no esta dentro de "+min +" y de " + max);
            }else {
                System.out.println("Eso no es un numero");
                sc.nextLine();
            }
        }

    }

    public int leerIntEnRango(String mensaje, Scanner sc, int min, int max){
        int value;
        while (true){
            System.out.println(mensaje);
            if (sc.hasNextInt()){
                value = sc.nextInt();
                if (value>min && value <= max){
                    return value;
                }
                System.out.println("El numero no esta dentro de "+min +" y de " + max);
            }else {
                System.out.println("Eso no es un numero");
                sc.nextLine();
            }
        }
    }
    public boolean leerBoolean(String mensaje, Scanner sc){
        boolean value;
        while (true){
            System.out.println(mensaje);
            if (sc.hasNextBoolean()){
                return value =sc.nextBoolean();
            }else {
                System.out.println("El dato no es valido, solo se acepta true/false");
                sc.nextLine();
            }
        }

    }

}
