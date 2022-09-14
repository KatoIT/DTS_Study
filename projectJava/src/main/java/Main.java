public class Main {
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

        double a = -1;


    }

    private static void printArray(Object[] objects) {
        for (Object object :
                objects) {
            System.out.println(object);
        }
    }
}
