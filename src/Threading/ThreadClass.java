package Threading;

public class ThreadClass extends Thread {
    int para;

    ThreadClass(int para) {
        this.para = para;
    }

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(1000);
            // thread id's and names are given to thread at the time of initialization of
            // thread (default)
            System.out.println(getName() + " " + getId() + " " + para);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        ThreadClass tc = new ThreadClass(20);
        ThreadClass[] t = new ThreadClass[5];
        for (int i = 0; i < 5; i++) {
            t[i] = new ThreadClass(i);

            // we can set name of thread manually
            // t.setName("Thread " + i);

            t[i].start();
        }
        for (int i = 0; i < t.length; i++) {
            t[i].wait();
            System.out.println(t[i].getState());
        }
        tc.start();

        // cannot rerun thread once started or completed
        // tc.start();

        System.out.println("Main Threading");
    }
}
