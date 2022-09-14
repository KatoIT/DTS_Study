public class Sort {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Sort sort = new Sort();
        String[] arrayString = {"B", "C", "A", "D"};
        Integer[] arrayInt = {1, 3, 2};
        Double[] arrayDouble = {1.0, 3.0, 2.0};
        arrayString = sort.bubbleSort(arrayString);
        arrayInt = sort.bubbleSort(arrayInt);
        arrayDouble = sort.bubbleSort(arrayDouble);
        printArray(arrayString);
        printArray(arrayInt);
        printArray(arrayDouble);


    }

    private String[] bubbleSort(String[] array) {
        for (int indexOne = 0; indexOne < array.length; indexOne++) {
            for (int indexTwo = indexOne; indexTwo < array.length; indexTwo++) {
                if (array[indexOne].compareTo(array[indexTwo]) > 0) {
                    String temp = array[indexOne];
                    array[indexOne] = array[indexTwo];
                    array[indexTwo] = temp;
                }
            }
        }
        return array;
    }

    private Integer[] bubbleSort(Integer[] array) {
        for (int indexOne = 0; indexOne < array.length; indexOne++) {
            for (int indexTwo = indexOne; indexTwo < array.length; indexTwo++) {
                if (array[indexOne] > array[indexTwo]) {
                    Integer temp = array[indexOne];
                    array[indexOne] = array[indexTwo];
                    array[indexTwo] = temp;
                }
            }
        }
        return array;
    }

    private Double[] bubbleSort(Double[] array) {
        for (int indexOne = 0; indexOne < array.length; indexOne++) {
            for (int indexTwo = indexOne; indexTwo < array.length; indexTwo++) {
                if (array[indexOne] > array[indexTwo]) {
                    Double temp = array[indexOne];
                    array[indexOne] = array[indexTwo];
                    array[indexTwo] = temp;
                }
            }
        }
        return array;
    }

    private static void printArray(Object[] objects) {
        for (Object object :
                objects) {
            System.out.println(object);
        }
    }
}
