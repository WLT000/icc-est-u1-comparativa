import java.util.ArrayList;
import java.util.List;

public class Generador {
    
    //Generar un listado de tamanio size
    //con numero aleatorios de 0 - size
    public static int[]generate(int size){
        int[] list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            list[i] = (int)(Math.random() * size);
        }
    return list;

    }


}
