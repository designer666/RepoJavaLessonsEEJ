package basic;

import java.util.ArrayList;

/**
 * Created by kyojin on 18.06.17.
 */
public class ArrayListExam {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList(10);

        System.out.println(list.size());
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println("Колличество элементоов: " + list.size());

        list.add(1, 1000);

        System.out.println(list);
        System.out.println("Колличество элементоов: " + list.size());

        //замена элемента
        Integer old = list.set(1, 2000);
        System.out.println(list);
        System.out.println("Колличество элементоов: " + list.size());
        System.out.println("Старое значение: " + old);

        //извлечение элемента по индексу
        System.out.println("list(0) = " + list.get(0));
        System.out.println("list(2) = " + list.get(2));
        System.out.println("list(3) = " + list.get(3));

        //поиск элемента
        System.out.println(list.contains(20));
        System.out.println(list.contains(40));

        System.out.println(list.indexOf(20));
        System.out.println(list.indexOf(40));

        //удаление элемента
        old = list.remove(1);
        System.out.println(list);
        System.out.println("Колличество элементоов: " + list.size());
        System.out.println("Старое значение: " + old);

    }

}
