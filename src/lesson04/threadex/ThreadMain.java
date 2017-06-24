package lesson04.threadex;

/**
 * Created by kyojin on 09.06.17.
 */
public class ThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        SomeThread thread = new SomeThread();
        thread.start();
    }
}
