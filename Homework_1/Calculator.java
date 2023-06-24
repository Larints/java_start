package Homework_1;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int number_1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number_2 = scanner.nextInt();
        System.out.print("Введите оператор: ");
        char ch = scanner.next().charAt(0);
        printResult(number_1, number_2, ch);
    }

    static int sum(int number_1, int number_2) {
        return number_1 + number_2;
    }

    static int sub(int number_1, int number_2) {
        return number_1 - number_2;
    }

    static int mul(int number_1, int number_2) {
        return number_1 * number_2;
    }

    static int div(int number_1, int number_2) {
        return number_1 / number_2;
    }

    static int mod(int number_1, int number_2) {
        return number_1 % number_2;
    }

    static int pow(int number_1, int number_2) {
        return number_1 ^ number_2;
    }

    static void printResult(int number_1,  int number_2, char ch) {
        switch (ch) {
            case '+':
                System.out.println(sum(number_1, number_2));
                break;
            case '-':
                System.out.println(sub(number_1, number_2));
                break;
            case '*':
                System.out.println(mul(number_1, number_2));
                break;
            case '/':
                System.out.println(div(number_1, number_2));
                break;
            case '%':
                System.out.println(mod(number_1, number_2));
                break;
            case '^':
                System.out.println(pow(number_1, number_2));
                break;
        }
    }
}


