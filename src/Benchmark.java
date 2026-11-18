public class Benchmark {
    public static long medir(Runnable accion, String nombre) {
        System.out.println("Funcion"+nombre);
        //tiempo actual
        long tiempoActual = System.nanoTime();

        //accion
        accion.run();

        //tiempo final
        long tiempoFinal = System.nanoTime();

        //retornar el tiempo de duracion
        return tiempoFinal - tiempoActual;

        Results results = new Results(nombre, (tiempoFinal - tiempoActual), "Muestra de prueba");
        return results;
    }
}
 