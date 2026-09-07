package DollarConvert;

import java.util.Locale;
import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("What is the dollar price? ");
        CurrencyConverter.price = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        CurrencyConverter.amount = sc.nextDouble();


        System.out.println("Amount to be paid in reais: "+CurrencyConverter.taxAmount());

        sc.close();

    }
}