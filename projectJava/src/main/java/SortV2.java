public abstract class SortV2<E> {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SortV2<String> sort = new SortV2<String>() {
            @Override
            boolean compareTo(String element1, String element2) {
                return element1.compareTo(element2) < 0;
            }
        };
        String[] strings = {"A", "D", "B", "0"};
        printArray(sort.bubbleSort(strings));


    }

    abstract boolean compareTo(E element1, E element2);

    private E[] bubbleSort(E[] array) {
        for (int indexOne = 0; indexOne < array.length; indexOne++) {
            for (int indexTwo = indexOne; indexTwo < array.length; indexTwo++) {
                if (compareTo(array[indexOne], array[indexTwo])) {
                    E temp = array[indexOne];
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
