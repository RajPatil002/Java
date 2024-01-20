package Threading;

public class SyncThread extends Thread {
    static int k = 0;
    int i = 0;

    SyncThread(int i) {
        this.i = i;
    }

    // synchronized keyword pause thread from accessing shared resources that are
    // used in that method i.e. static 'k' in some cases it can be object that is
    // refering to same value/space
    // synchronized void sync() throws Exception {
    // int j = 0;
    // while (j < 100) {
    // j++;
    // k++;
    // System.out.println(i + " " + k);
    // }
    // }

    void sync() throws Exception {
        int j = 0;
        while (j < 100) {
            j++;
            // this is synchronized block for synchronization of specific code block
            synchronized (this) {
                k++;
            }
            System.out.println(i + " " + k);
        }
    }

    @Override
    public void run() {
        super.run();
        try {
            sync();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            SyncThread st = new SyncThread(i * 10);
            st.start();
        }
    }
}
