package harbourspace.hw1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        isIntegerPalindrome();
    }

    static void isIntegerPalindrome() {
        System.out.print("input value: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        String aString = String.valueOf(a);
        String aStringReversed = new StringBuilder(aString).reverse().toString();
        System.out.println(aString.equals(aStringReversed));
    }
}
