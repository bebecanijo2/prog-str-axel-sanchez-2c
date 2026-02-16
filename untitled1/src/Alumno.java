public class Alumno {

    public Alumno() {}

    //basicamente esta clase sirve para poder asignarle varios datos al array, sin esta clase solo se nos permitiria asignarle un solo tipo de dato

    private int id;
    private String nombre;
    private double promedio;
    private boolean activa;

    public Alumno(int id, String nombre, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
        this.activa = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", promedio=" + promedio +
                ", activa=" + activa +
                '}';
    }
}
