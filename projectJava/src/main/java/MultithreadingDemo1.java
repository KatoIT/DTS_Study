public class MultithreadingDemo1 extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        MultithreadingDemo1 t1 = new MultithreadingDemo1();
        t1.start();
    }
}
