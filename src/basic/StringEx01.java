package basic;

import java.util.Arrays;

/**
 * Created by kyojin on 18.06.17.
 */
public class StringEx01 {

    public static void main(String[] args) {
        //Создание строк
        //Простая форма записи
        String str1 = "Первая строка";
        String str2 = "Вторая строка";
        String str3 = "Первая строка";

        //Сравнение ссылок
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        //Сравнение строк по содержимому
        System.out.println("str1 = str2? : " + str1.equals(str2));
        System.out.println("str1 = str3? : " + str1.equals(str3));
        //Альтернативный вариант создания строки
        String str4 = new String("Вторая строка");
        System.out.println(str4 == str2);
        System.out.println("str2 = str4? : " + str4.equals(str2));
        //Создание подстроки на основании строки
        // будет создана подстрока начиная с 5-го символа
        // и до конца строки
        String str5 = str4.substring(5);
        System.out.println(str5);
        str5 = str4.substring(2, 8); //Будут вкдючены символы со 2-го по 7-ой
        System.out.println(str5);
        //Получение символа под указаным индексом
        System.out.println(str4.charAt(3)); //Вернется символ под индексом 3
        System.out.println(str4.charAt(8)); //тип значения char
        // Преобразование строки к массиву char[]
        char[] str = str4.toCharArray();
        System.out.println(Arrays.toString(str));
        //Поиск символа в строке
        System.out.println(str4.contains("р"));
        System.out.println(str4.contains("е"));
        System.out.println(str4.contains("стр"));
        //Всегда нужно помнить про язык
        char ch1 = 'c', ch2 = 'с';
        //ENG != RUS
        System.out.println(ch1 == ch2);
        System.out.println((int) ch1 + " " + (int) ch2);
        //Разделение строк
        String[] words = str4.split(" ");
        System.out.println(Arrays.toString(words));
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str6 = new String(chars);
        System.out.println(str6);
        //Получение индекса элемента по значению
        System.out.println(str6.indexOf('l'));
        System.out.println(str6.lastIndexOf('l'));
        //Замена символов либо строк
        System.out.println(str4);
        String str7 = str4.replace('о', 'О');
        System.out.println(str7);
        str7 = str4.replace("ор", "***");
        System.out.println(str7);
        //конкатенация строк
        String str8 = str1 + "\n" + str2;
        System.out.println(str8);
    }
}
