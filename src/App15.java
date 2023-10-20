class App15 extends Thread {

    public void run() {
        try {
            this.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("abcS" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread App15 = new App15();
        App15.start();
    }
}

// Answer - program will never terminate /-/ RE /+/ -> -