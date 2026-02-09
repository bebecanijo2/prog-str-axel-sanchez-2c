public class Reporte {
    public Reporte(){}

    private final double NUMERO_DE_PARCIALES = 3;

    public String determinarEstado(double calificacionFinal, int asistencia, boolean entregaProyecto){

        if (calificacionFinal<70){
            return "REPROBADO POR CALIFICACION";
        }else if (asistencia<80){
            return "REPROBADO POR ASISTENCIA";
        } else if (entregaProyecto == false) {
            return "REPROBADO POR PROYECTO";
        } else {
            return "APROBADO";
        }
    }

    public void imprimirReporte(String nombreDelAlumno,int asistencia,double promedioParciales,double calificacionFinal,boolean entregaProyecto,String estado){


        System.out.println("Nombre del alumno: "+nombreDelAlumno);
        System.out.println("Cantidad de parciales: "+NUMERO_DE_PARCIALES);
        System.out.println("Promedio de los tres parciales: "+promedioParciales);
        System.out.println("Asistencias del alumno: "+asistencia);
        System.out.println("Entrego proyecto: "+entregaProyecto);
        System.out.println("La calificacion final fue de: "+calificacionFinal);
        System.out.println("ESTADO: "+ estado);

    }
}