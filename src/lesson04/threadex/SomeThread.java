package lesson04.threadex;

/**
 * Created by kyojin on 09.06.17.
 */
public class SomeThread extends Thread {
    @Override
    public void run() {
        System.out.println("Код для рараллельного выполнения");
        System.out.println(Thread.currentThread().getName());
    }
}
