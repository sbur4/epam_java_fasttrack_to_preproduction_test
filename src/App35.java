import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class App35 {

    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();
        try {
            System.out.println("Go");
            lock1.lock();
            System.out.println("In");
        } finally {
            lock2.unlock();
            System.out.println("Un");
        }
    }
}

// /-/ Go In dead /+/ -> +