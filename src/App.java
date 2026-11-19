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
        Benchmark b = new Benchmark();
        Metodos m = new Metodos();

        List<Integer> list = Generador.generate(1000);
        System.out.println(list);
        
        Runnable x = () -> Generador.generate(1000);

        //Toda la funcion en x puede ser
        Results benGenlist = Benchmark.medir(() -> Generador.generate(100000),"Generar listado", "100");

            System.out.println(benGenlist);



        //Los 3 ARREGLOS BASE

        //10000
        int[] list1 = Generador.generate( 10000);

        //50000
        int[] list2 = Generador.generate(50000);

        //100000
        int[] list3 = Generador.generate(100000);

        // 1 -> List<List<Integer>> listas = listas.of(Lista1, lista2, lista3);
        // 2 _> List<Interger>[] listas = new List<Integer>[]{lista1};

        int[] copia1 = lista1.clone();
        int[] copia2 = lista1.clone();
        int[] copia3 = lista1.clone();


        System.out.println("Metodo Burbuja");
        m.bubbleSort(copia1);
        m.bubbleSort(copia2);
        m.bubbleSort(copia3);

        System.out.println("Metodo Quick sort");
        m.metodo2(copia1);
        m.metodo2(copia2);
        m.metodo2(copia3);

        System.out.println("Metodo Selection");
        m.selectioSort(copia1);
        m.selectioSort(copia2);
        m.selectioSort(copia3);


        

        Results resultaM1S1 = Benchmark.medir(
                () -> m.bubbleSort(copia1), "Burbuja ", "10.000");
        Results resultsM1S2 = Benchmark.medir(
                () -> m.bubbleSort(copia2), "Burbuja", "50.000");
        Results resultsM1S3 = Benchmark.medir(
                () -> m.bubbleSort(copia3), "Burbuja", "100.000");

        Results resultsM2S1 = Benchmark.medir(
                () -> m.metodo2(copia1), "Quick sort" , "10.000" );
        Results resultsM2s2 = Benchmark.medir(
                () -> m.metodo2(copia2), "QUick sort" , "50.000" );
        Results resultsM2s3 = Benchmark.medir(
                () -> m.metodo2(list3),"Quick sort" , "100.000" );

        Results resultsM3S1 = Benchmark.medir(
                () -> m.selectioSort(copia1), "Selection" , "10.000" );
        Results resultsM3s2 = Benchmark.medir(
                () -> m.selectioSort(copia2), "Selection" , "50.000" );
        Results resultsM3s3 = Benchmark.medir(
                () -> m.selectioSort(list3),"Selection" , "100.000" );
        

        


    }
}
