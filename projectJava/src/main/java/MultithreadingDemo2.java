public class MultithreadingDemo2 implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        MultithreadingDemo2 m1 = new MultithreadingDemo2();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
