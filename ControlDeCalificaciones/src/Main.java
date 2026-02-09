import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        GradeService gradeService = new GradeService();
        InputValidator inputValidator = new InputValidator();
        Reporte reporte = new Reporte();
        //IPO
        //I
        String nombreDelAlumno = inputValidator.leerTextoNoVacio("Cual es tu nombre?: ", sc);
        int asistencia = inputValidator.leerIntEnRango("Con cuantas asistencias cuentas? 0-100 :", sc, 0, 100);
        boolean entregaProyecto = inputValidator.leerBoolean("Entregaste proyecto? true/false :", sc);
        double parcial1 = inputValidator.leerDoubleEnRango("Cuanto sacaste en el parcial 1?: 0-10.0", sc, 0, 10.0);
        double parcial2 = inputValidator.leerDoubleEnRango("Cuanto sacaste en el parcial 2?: 0-10.0", sc, 0, 10.0);
        double parcial3 = inputValidator.leerDoubleEnRango("Cuanto sacaste en el parcial 3?: 0-10.0", sc, 0, 10.0);

        //P
        double promedioParciales = gradeService.calcularPromedioParciales(parcial1, parcial2, parcial3);
        double calificacionFinal = gradeService.calcularCalificacionFinal(asistencia, promedioParciales);
        String estado = reporte.determinarEstado(calificacionFinal, asistencia, entregaProyecto);

        //O
        reporte.imprimirReporte(nombreDelAlumno, asistencia, promedioParciales, calificacionFinal, entregaProyecto, estado);

    }
}