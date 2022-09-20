package sort;

import java.util.List;

public class Sort<E> {
    public E[] bubbleSort(E[] array, Compare<E> compare) {
        for (int indexOne = 0; indexOne < array.length; indexOne++) {
            for (int indexTwo = indexOne; indexTwo < array.length; indexTwo++) {
                if (compare.compareTo(array[indexOne], array[indexTwo]) > 0) {
                    E temp = array[indexOne];
                    array[indexOne] = array[indexTwo];
                    array[indexTwo] = temp;
                }
            }
        }
        return array;
    }

    public void bubbleSort(List<E> list, Compare<E> compare) {
        for (int indexOne = 0; indexOne < list.size(); indexOne++) {
            for (int indexTwo = indexOne; indexTwo < list.size(); indexTwo++) {
                if (compare.compareTo(list.get(indexOne), list.get(indexTwo)) > 0) {
                    E temp = list.get(indexOne);
                    list.set(indexOne, list.get(indexTwo));
                    list.set(indexTwo, temp);
                }
            }
        }
    }
}
