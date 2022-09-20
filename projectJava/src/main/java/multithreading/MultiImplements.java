package multithreading;

import log.LogCustom;

public class MultiImplements implements Runnable {
    private LogCustom log = new LogCustom(this.getClass().getName());
    public void run() {
        log.info("Thread is running...");
        for (int index = 0; index < 15; index++) {
            log.debug(String.valueOf(index));
        }
    }

}
