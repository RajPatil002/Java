package Threading;

import java.util.concurrent.locks.ReentrantLock;

public class Lock extends Thread {
    private static int i = 0;
    private int j;
    private ReentrantLock lock = new ReentrantLock();

    Lock(int j) {
        this.j = j;
    }

    void incr() {
        int k = 0;
        // we can explicily lock/unlock to gain synchronization
        lock.lock();
        while (k < 100) {
            synchronized (this) {

                i++;
                k++;
                System.out.println(i + " " + j);
            }
        }
        lock.unlock();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        incr();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Lock t = new Lock(i);
            t.start();
        }
    }
}
