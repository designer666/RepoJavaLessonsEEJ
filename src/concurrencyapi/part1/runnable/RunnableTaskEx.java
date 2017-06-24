package concurrencyapi.part1.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by kyojin on 09.06.17.
 */
public class RunnableTaskEx {

    public static void main(String[] args) {
        Runnable task = () -> {
            //устаревший вариант - Время указывается в милисекундах
            try {
                //Thread.currentThread().sleep(1000);

                TimeUnit.SECONDS.sleep(3);
                System.out.println("Задача для выполнения");
            } catch (InterruptedException e) {
                //исключение будет сгенерировано только в том случае, когда мы попытаемся досрчно завершить работу спящего потока
                e.printStackTrace();
            }
        };

        //Создание исполнителя
        //Класс Executors позволяет создавать объекты исполнителей с уже заранее подготовленными настройками
        //newSingleThreadExecutor () - создает исполнителя с одним потоком в пуле
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(task);

        //вежливая остановка сервиса
        service.shutdown();

        if (!service.isTerminated()) {
            System.out.println("Подготовка к досрочному завершению работы");
            //даем таймаут на завершение процессов
            try {
                service.awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                //досрочное прекращение работы потоков вне зависимости от состояния
                service.shutdownNow();
            }
        }
    }
}
