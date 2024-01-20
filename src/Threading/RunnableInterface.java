package Threading;

public class RunnableInterface implements Runnable {
    int para;

    @Override
    public void run() {
        try {
            Thread.sleep(10000);

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Threading " + para);
    }

    public static void main(String[] args) {
        RunnableInterface r = new RunnableInterface();
        // r.run();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 5; i++) {
        }
        System.out.println("Main Thread");
    }
}
