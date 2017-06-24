package basic;

import java.util.Scanner;

/**
 * Created by kyojin on 18.06.17.
 */
public class StrH02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scan.nextLine();

        System.out.print("Строка является палиндромом? " + palindrom(str));
    }

    public static boolean palindrom(String str) {
        char[] chrs = str.toCharArray();
        for (int i = 0, j = chrs.length - 1;
             i < chrs.length / 2; i++, j--) {
            if (chrs[i] != chrs[j]) {
                return false;
            }
        }
        return true;
    }
}
