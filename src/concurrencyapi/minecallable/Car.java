package concurrencyapi.minecallable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by kyojin on 09.06.17.
 */
public class Car {

    public static void main(String[] args) {
        List<Callable<String>> cars = new ArrayList<>();

        Callable<String> car1 = () -> {
            TimeUnit.SECONDS.sleep(4);
            System.out.println("Car1");
            return "true";
        };
        Callable<String> car2 = () -> {
            TimeUnit.SECONDS.sleep(7);
            System.out.println("Car2");
            return "true";
        };
        Callable<String> car3 = () -> {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Car3");
            return "true";
        };

        cars.addAll(Arrays.asList(car1, car2, car3));

        ExecutorService es = Executors.newFixedThreadPool(3);

        try {
            List<Future<String>> future = es.invokeAll(cars);
            for (Future<String> f : future) {
                try {
                    System.out.println(f.get());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {


        } finally {
            es.shutdown();
        }

    }

}
