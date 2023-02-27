public class Utils {
    Utils(){

    }

    public static <N extends Number> N[] ordena(N arr[]){
        quickSort(arr, 0, arr.length-1);
        return arr;
    }

    private static <N extends Number> void quickSort(N[] arr, int left, int right){
        int index= partition(arr, left, right);
        if(left < index-1){
            quickSort(arr, left, index-1);
        }

        if(index < right){
            quickSort(arr, index, right);
        }
    }

    private static <N extends Number> int partition(N[] arr, int left, int right){
        N pivote = arr[(left + right) / 2];
        while(left <= right){
            for(; arr[left].doubleValue() < pivote.doubleValue(); left++){}

            for(; arr[right].doubleValue() > pivote.doubleValue(); right--){}

            if(left <= right){
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static <N extends Number> void swap(N[] arr, int left, int right){
        if (left != right) {
            N aux = arr[left];
            arr[left] = arr[right];
            arr[right] = aux;
        }
    }
}