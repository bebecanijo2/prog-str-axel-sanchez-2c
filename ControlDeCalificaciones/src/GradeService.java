public class GradeService {
    public GradeService(){}

    private final double CALIFICACION_MINIMA = 7;
    public final double ASISTENCIA_PARCIALES = 0.3;
    private final double NUMERO_DE_PARCIALES = 3;
    private String nombreDelAlumno;
    private int asistencia;
    private double parcial1;
    private double parcial2;
    private double parcial3;
    private boolean entregaProyecto;
    private double promedioParciales;
    private double calificacionFinal;


    public double calcularPromedioParciales(double parcial1, double parcial2, double parcial3){
        return promedioParciales = (parcial1+parcial2+parcial3)/NUMERO_DE_PARCIALES;
    }

    public double calcularCalificacionFinal(int asistencia, double promedioParciales){
        return calificacionFinal = (promedioParciales*CALIFICACION_MINIMA)+(asistencia*ASISTENCIA_PARCIALES);
    }

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


    public String getNombreDelAlumno() {
        return nombreDelAlumno;
    }

    public void setNombreDelAlumno(String nombreDelAlumno) {
        this.nombreDelAlumno = nombreDelAlumno;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public double getParcial1() {
        return parcial1;
    }

    public void setParcial1(double parcial1) {
        this.parcial1 = parcial1;
    }

    public double getParcial2() {
        return parcial2;
    }

    public void setParcial2(double parcial2) {
        this.parcial2 = parcial2;
    }

    public double getParcial3() {
        return parcial3;
    }

    public void setParcial3(double parcial3) {
        this.parcial3 = parcial3;
    }

    public boolean isEntregaProyecto() {
        return entregaProyecto;
    }

    public void setEntregaProyecyo(boolean entregaProyecto) {
        this.entregaProyecto = entregaProyecto;
    }

    public double getPromedioParciales() {
        return promedioParciales;
    }

    public void setPromedioParciales(double promedioParciales) {
        this.promedioParciales = promedioParciales;
    }

    public double getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setCalificacionFinal(double calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }



}

