package sort;

import log.LogCustom;

import java.util.Arrays;
import java.util.List;

public class SortDemo {
    private LogCustom log = new LogCustom(this.getClass().getName());

    public void start() {
        List<Integer> list = Arrays.asList(1, 2, 3, 7, 9, 3, 6, 8, 3, 3, 6);
        Sort<Integer> sort = new Sort<>();
        sort.bubbleSort(list, (e1, e2) -> e1 - e2);
        log.info("List sorted:");
        for (Integer val : list) {
            log.info(String.valueOf(val));
        }
    }
}
