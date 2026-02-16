import java.util.Scanner;

public class AlumnoService {

    public AlumnoService(){}

    Scanner sc = new Scanner(System.in);
    InputValidator input =  new InputValidator();

    public void alta(Scanner sc, Alumno[] alumnos){
        int id = input.validarEntero("Ingresa un id para empezar el alta", sc);
        int indiceIncercion = obtenerIndice(alumnos);
        if (indiceIncercion==-1){
            System.out.println("El arreglo esta lleno");
            return;
        }

        if (id<0){
            System.out.println("No se aceptan ids menores a 1");
            return;
        }

        if (verificarId(alumnos, id)){
            System.out.println("El id ya existe dentro del arreglo");
            return;
        }

        sc.nextLine();

        System.out.println("Ingresa el nombre: ");
        String name = sc.nextLine();
        if (name.isBlank()){
            System.out.println("No aceptamos vacios en el nombre");
            return;
        }

        System.out.println("Ingresa el promedio inicial: ");
        double promedio = 0;
        if (sc.hasNextDouble()) {
            promedio = sc.nextDouble();
        } else {
            sc.next();
            System.out.println("Formato inválido, se asignará 0.0");
        }

        if (promedio < 0 || promedio > 10) {
            System.out.println("Promedio fuera de rango (0-10). Se asignará 0.0");
            promedio = 0;
        }

        Alumno nuevoAlumno = new Alumno(id, name, promedio);
        alumnos[indiceIncercion] = nuevoAlumno;
        System.out.println("Alumno dado de alta");

    }


    //este metodo permite al momento de dar el alta, buscar una casilla vacia dentro del array, si no hay espacio nos devolvera un -1
    public int obtenerIndice(Alumno[] alumnos){
        for (int i =0; i< alumnos.length; i++){
            if (alumnos[i]==null){
                return i;
            }
        }
        return -1;
    }


    public boolean verificarId(Alumno[] alumnos, int id){

        //este ciclo lo que hace es que recorre el arreglo completamente, lo uso para hacer la comprobacion de si hay otro id igual
        for (Alumno alumno : alumnos){

            //aqui pedimos que se cumplan 2 condiciones para verificar si existe otro id igual, si encuentra una casilla que no este vacia y en estas hay un id igual al introducido nos dara true, o sea qie no esta disponible ese id
            if (alumno != null && id == alumno.getId()){
                return true;
            }
        }

        //arroja false, significa que no hay ninguna coincidencia con ese id
        return false;
    }

    public void actualizarPromedio(Scanner sc, Alumno[] alumnos){
        int id = input.validarEntero("Ingresa ID para actualizar el promedio del alumno", sc);

        for (Alumno alumno : alumnos){

            //aqui estoy poniendo una comprobacion de 3 condiciones, primero checa si las casillas no estan vacias, despues si el id que se introdujo coincide con alguno de las casillas y despues si el alumno esta activo
            if (alumno != null && alumno.getId() == id && alumno.isActiva()){
                sc.nextLine();
                System.out.println("Ingresa el nuevo promedio");
                double nuevoPromedio = sc.nextDouble();

                if (nuevoPromedio < 0 || nuevoPromedio> 10){
                    System.out.println("Promedio fuera de rango 0-10");
                    return;

                }

                alumno.setPromedio(nuevoPromedio);
                System.out.println("Promedio actualizado");
                return;
            }
        }

    }
    public void bajaLogica(Scanner sc, Alumno[] alumnos){
        int id = input.validarEntero("Ingresa ID para la baja logica: ", sc);

        //creamos un ciclo para buscar en el array
        for (Alumno alumno : alumnos){

            //checamos en las casillas no vacias si el id introducido coincide con alguno dentro del array
            if (alumno != null && alumno.getId() == id){

                //"si el alumno no esta activo"
                if (!alumno.isActiva()){
                    System.out.println("El alumno ya no esta activo");
                }else {
                    alumno.setActiva(false);
                    System.out.println("Dado de baja logicamente");
                }
                return;
            }
        }
        System.out.println("Id no encontrado");
    }

    public void buscarPorId(Scanner sc, Alumno[] alumnos){
        int id = input.validarEntero("Ingresa el ID a buscar: ", sc);

            for (Alumno alumno : alumnos){
                if (alumno != null && alumno.getId() == id && alumno.isActiva()){
                    System.out.println("Alumno encontrado: "+ alumno);
                    return;
                }
            }
            System.out.println("Alumno no encontrado");
        }
    public void listarActivas(Alumno[] alumnos){
        System.out.println("Alumnos activos: ");
        boolean hayAlumnos = false;
        for (Alumno alumno : alumnos){
            if (alumno != null && alumno.isActiva()){
                System.out.println(alumno);
                hayAlumnos = true;
            }
        }
        if (!hayAlumnos){
            System.out.println("No hay alumnos activos");
        }
    }


    public void imprimirReporte(Alumno[] alumnos) {
        System.out.println("Reporte de los alumnos");
        int totalActivos = 0;
        double sumaPromedios = 0;
        int promediosDeOcho = 0;
        Alumno alumnoMayor = null;
        Alumno alumnoMenor = null;

        for (Alumno alumno : alumnos) {
            if (alumno != null && alumno.isActiva()) {

                totalActivos++;
                double promedio = alumno.getPromedio();
                sumaPromedios += promedio;

                if (promedio >= 8.0) {
                    promediosDeOcho++;
                }

                if (alumnoMayor == null || promedio > alumnoMayor.getPromedio()) {
                    alumnoMayor = alumno;
                }

                if (alumnoMenor == null || promedio < alumnoMenor.getPromedio()) {
                    alumnoMenor = alumno;
                }
            }
        }

        if (totalActivos > 0) {
            double promedioGeneral = sumaPromedios / totalActivos;
            System.out.println("-Promedio general: " + promedioGeneral);
            System.out.println("-Alumno con mayor promedio: "+alumnoMayor.getId() + " "+ alumnoMayor.getNombre() + " con promedio de: " + alumnoMayor.getPromedio());
            System.out.println("-Alumno con menor promedio: "+alumnoMenor.getId() + " "+alumnoMenor.getNombre() + " con promedio de: " + alumnoMenor.getPromedio());
            System.out.println("-Cantidad de alumnos con promedio de ocho para arriba: " + promediosDeOcho);
        } else {
            System.out.println("No hay alumnos para generar reportes");
        }
    }
}








