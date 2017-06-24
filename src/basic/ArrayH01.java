package basic;

import java.util.ArrayList;

/**
 * Created by kyojin on 18.06.17.
 */
public class ArrayH01 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            list.add((int)(Math.random()*10));
        }
        System.out.println(list);
        System.out.println("Колличество: " + list.size());
        deleteElement(list);
        System.out.println(list);
        System.out.println("Колличество: " + list.size());
    }

    public static void deleteElement(ArrayList<Integer> list) {
        Integer first = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == first) {
                list.remove(i--);
            }

        }
    }
}
