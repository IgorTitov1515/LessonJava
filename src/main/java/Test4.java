import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
         /*   Задача 3
    Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.

    Например:
    если пользователь введет число 3. Программа должна посчитать сумму
     чисел от 1 до 3, то есть 1+2+3 и выдать ответ 6.
    если пользователь введет число 5. Программа должна посчитать сумму
     чисел от 1 до 5, то есть 1+2+3+4+5 и выдать ответ 15.*/

        System.out.println("Please type an integer");
        Scanner scanner = new Scanner(System.in);
        Integer intNumder = scanner.nextInt();
//        как проверить что число целое?

        int sum = 0;
        for(int i = 1; i <= intNumder; i++) {
            sum += i;
        }
            System.out.println(sum );


    }
}
