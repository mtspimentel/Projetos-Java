package DollarConvert;


public class CurrencyConverter {

    public static double price;
    public static double amount;


    public static double totalDollar() {
        return price * amount;
    }

    public static double taxAmount() {
        return totalDollar() + (totalDollar() * 6 / 100);
    }
}
