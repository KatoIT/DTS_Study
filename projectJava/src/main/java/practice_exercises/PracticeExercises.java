package practice_exercises;

import log.LogCustom;

public class PracticeExercises {
    LogCustom log = new LogCustom(this.getClass().getName());

    public void star() {
        log.info(new PTBac2(1, 2, -1).ketQua());
        //
        log.info("Tính giai thừa: 5! = " + new Factorial((byte) 5).factorial());
    }
}
