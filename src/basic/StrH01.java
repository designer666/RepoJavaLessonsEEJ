package basic;

import java.util.Scanner;

/**
 * Created by kyojin on 18.06.17.
 */
public class StrH01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String stroka = scan.nextLine();
        reverse(stroka);
    }

    public static void reverse(String str) {
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
