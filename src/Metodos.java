import java.util.List;

public class Metodos {

    public void bubbleSort(list<Integer>list){

    
        for(int i = 0; i<list.size();i++){
            boolean swap = false;
            for(int j= 0; j<list.size;j++){
                if (lis.get(j) > list.get(j+1)){
                    int temo = list.get(j);
                    list.set(j, list.get8j+1);
                    list.set(j+1, temp);
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
    }

    public void metodo2(int[]list){
        if (arr == null || arr.length <= 1) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }




    public void selectioSort(list<Integer>list){

        for(int i = 0; i < list.size; i++){
            int minimo = i;
            for(int j = i +1 ; j < list.size; j++){
                if(list.get(j)<list.get(minimo)){
                    minimo = j;
                }

            }
            if(minimo != i){
                int aux = list.get(i);
                list.set(i, list.get(minimo));
                list.set(minimo, aux );


            }
        }
    }

    public void insertionSort(list<Integer>list){
        for(int i = 0; i<list.size;i++){
            int kay = list.get(i);
        }
    }
    


    
}