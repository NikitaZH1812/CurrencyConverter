package CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args1) {

        final double commission = 0.01;
        final double exchange_rate = 36.6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть суму до конвертації:");

        int usd_amount = sc.nextInt();

        CurrencyConverter currencyConverter = new CurrencyConverter(commission, exchange_rate);
        double total_amount = currencyConverter.calculateTotalAmount(usd_amount);

        System.out.println("Сума до виплати: " + total_amount);

    }
}