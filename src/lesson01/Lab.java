package lesson01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kyojin on 31.05.17.
 */
public class Lab {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

        System.out.println("Добавление элементов: ");
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            array.add(i);
        }
        long end = System.currentTimeMillis();
        long arrTime = end - begin;
        begin = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        end = System.currentTimeMillis();
        long lnkTime = end - begin;

        System.out.println(arrTime > lnkTime ? "LinkedList" : "ArrayList " + arrTime);

        System.out.println("Добавление элементов (в начало): ");

        begin = System.currentTimeMillis();
        array.add(0, 1000);
        end = System.currentTimeMillis();
        arrTime = end - begin;

        begin = System.currentTimeMillis();
        array.add(0, 1000);
        end = System.currentTimeMillis();
        lnkTime = end - begin;

        System.out.println(arrTime > lnkTime ? "LinkedList" : "ArrayList " + arrTime);

        System.out.println("Добавление элементов (в середину): ");

        begin = System.currentTimeMillis();
        array.add(5_000_000, 1000);
        end = System.currentTimeMillis();
        arrTime = end - begin;

        begin = System.currentTimeMillis();
        array.remove(0);
        end = System.currentTimeMillis();
        lnkTime = end - begin;

        System.out.println(arrTime > lnkTime ? "LinkedList" : "ArrayList " + arrTime);

        System.out.println("Удаление элементов (в начало): ");

        begin = System.currentTimeMillis();
        array.remove(0);
        end = System.currentTimeMillis();
        arrTime = end - begin;

        begin = System.currentTimeMillis();
        array.add(5_000_000, 1000);
        end = System.currentTimeMillis();
        lnkTime = end - begin;

        System.out.println(arrTime > lnkTime ? "LinkedList" : "ArrayList " + arrTime);






    }
}
