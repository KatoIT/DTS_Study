package multithreading;

import log.LogCustom;

public class MultiDemo {
    private LogCustom log = new LogCustom(this.getClass().getName());

    public void start(){
        MultiExtends multiOne = new MultiExtends();
        MultiExtends multiThree = new MultiExtends();
        MultiImplements multiTwo = new MultiImplements();
        multiOne.start();
        multiThree.start();
//        multiTwo.run();
    }
}
