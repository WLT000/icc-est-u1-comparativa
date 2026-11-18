import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /** 
        long nanoTime = System.nanoTime();
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Nano Time: " + nanoTime);
        System.out.println("Current Time Millis: " + currentTimeMillis);

        Runnable funcion = () -> {
            System.out.println("Ejecutar tarea 1 ");
            System.out.println("Ejecutar tarea 2 ");
        };

        List<Integer> list = new ArrayList<>();
        MetodosOrd mO = new MetodosOrd();
        mO.burbuja(list);
        //Runnable IMPORTANTE
        Runnable burbujaOrden = () -> mO.burbuja(list);

        // Callable<T>
        System.out.println("Ejecucion de la funcion Runnable");
        funcion.run();
        */

        Generador g = new Generador();
        List<Integer> list = g.generate(100);
        System.out.println(list);
        


    }
}
