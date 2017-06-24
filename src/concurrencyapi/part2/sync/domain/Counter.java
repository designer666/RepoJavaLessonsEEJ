package concurrencyapi.part2.sync.domain;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kyojin on 16.06.17.
 */
public class Counter {

    private ReentrantLock reentrantLock = new ReentrantLock();
    private int count = 0;

    public synchronized void increment() {
        //вместо synchronized можно использовать:           !!!
        //synchronized (this) {                             !!!
        //  count++;                                        !!!
        //}                                                 !!!
        count ++;
    }

    public void lockIncrement() {
        //необходимо использовать блок try - finally (catch не обязательно)
        try {
            reentrantLock.lock();
            count++;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int value() {
        return count;
    }
}
