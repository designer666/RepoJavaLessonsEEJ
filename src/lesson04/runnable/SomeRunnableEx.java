package lesson04.runnable;

/**
 * Created by kyojin on 09.06.17.
 */
public class SomeRunnableEx implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable - поток");
    }
}
