import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        int userInput;
        do {
            System.out.print("Введіть два будь-яких позитивних числа: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            result = num1 * num2;
            System.out.println("Результат множення цих чисел: " + result);
            System.out.print("Ви хочете продовжити? Введіть 1 для продовженя, 0 для закінчення: ");
            userInput = scanner.nextInt();
        } while (userInput == 1);
    }
}