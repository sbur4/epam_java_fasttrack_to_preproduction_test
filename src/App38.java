public class App38 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(Long.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
        Thread.sleep(1000);
        t.setName("My");
        t.setDaemon(true); // RE
    }
}

// /-/ Line3 /+/ -> +