public class Sort {
    public String[] bubbleSort(String[] array) {
        for (int indexOne = 0; indexOne < array.length; indexOne++) {
            for (int indexTwo = indexOne; indexTwo < array.length; indexTwo++) {
                if (array[indexOne].compareTo(array[indexTwo]) > 0){
                    String temp = array[indexOne];
                    array[indexOne] = array[indexTwo];
                    array[indexTwo] = temp;
                }
            }
        }
        return array;
    }

    public Integer[] bubbleSort(Integer[] array) {
        for (int indexOne = 0; indexOne < array.length; indexOne++) {
            for (int indexTwo = indexOne; indexTwo < array.length; indexTwo++) {
                if (array[indexOne] > array[indexTwo]){
                    Integer temp = array[indexOne];
                    array[indexOne] = array[indexTwo];
                    array[indexTwo] = temp;
                }
            }
        }
        return array;
    }

    public Double[] bubbleSort(Double[] array) {
        for (int indexOne = 0; indexOne < array.length; indexOne++) {
            for (int indexTwo = indexOne; indexTwo < array.length; indexTwo++) {
                if (array[indexOne] > array[indexTwo]){
                    Double temp = array[indexOne];
                    array[indexOne] = array[indexTwo];
                    array[indexTwo] = temp;
                }
            }
        }
        return array;
    }
}
