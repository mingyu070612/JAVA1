import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int price, amount, tax;

        System.out.print("판매금액 : ");
        price = keyboard.nextInt();

        amount = price * 10 / 11;
        tax = price - amount;

        System.out.printf("금액 : %,d원\n", amount);
        System.out.printf("세금 : %,d원\n", tax);
    }
}
