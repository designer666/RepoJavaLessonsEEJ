package concurrencyapi.part2.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by kyojin on 16.06.17.
 */
public class ScheduledEx01 {
    public static void main(String[] args) {
        System.out.println("Старт метода main()");
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

        Runnable someTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Отложенная к выполнению задача");
            }
        };

        //объект ScheduledFuture позволяет нам получить оставшееся время до запуска отложенной задачи
        ScheduledFuture future = service.schedule(someTask, 5, TimeUnit.SECONDS);

        try {
            TimeUnit.SECONDS.sleep(3);
            //с помощью метода getDelay() - получаем оставшееся время в выбранной еденице измерения
            System.out.println("Время доо запуска отложенной задачи: " + future.getDelay(TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Завершение метода main()");
        service.shutdown();
    }
}
