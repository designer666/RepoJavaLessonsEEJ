package concurrencyapi.part1.runnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by kyojin on 09.06.17.
 */
public class InvokeAllEx {

    public static void main(String[] args) {
        List<Callable<Integer>> tasks = new  ArrayList();
        //создаем 3 задачи
        Callable<Integer> task1 = () -> {
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Task1");
            return 100;
        };
        Callable<Integer> task2 = () -> {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Task2");
            return 200;
        };
        Callable<Integer> task3 = () -> {
            TimeUnit.SECONDS.sleep(7);
            System.out.println("Task3");
            return 300;
        };
        //помещаем их в коллекцию
        tasks.addAll(Arrays.asList(task1, task2, task3, task3));
        //Создаем сервис с тремя активными потоками
        ExecutorService es = Executors.newFixedThreadPool(3);
        try {
            //с помощью метода invokeAll передаем созданные задачи для обработки в сервис-исполнитель
            List<Future<Integer>> future = es.invokeAll(tasks);
        //обработка полученного рез-та
            for (Future<Integer> f: future) {
                try {
                    System.out.println(f.get());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        es.shutdown();
    }
}