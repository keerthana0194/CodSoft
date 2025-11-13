import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Currencies: USD, INR, EUR");
        System.out.print("From: ");
        String from = sc.next().toUpperCase();
        System.out.print("To: ");
        String to = sc.next().toUpperCase();
        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        double rate = 0;
        if (from.equals("USD") && to.equals("INR")) rate = 88.7;
        else if (from.equals("INR") && to.equals("USD")) rate = 0.0113;
        else if (from.equals("USD") && to.equals("EUR")) rate = 0.86;
        else if (from.equals("EUR") && to.equals("USD")) rate = 1.16;
        else if (from.equals("INR") && to.equals("EUR")) rate = 0.0097;
        else if (from.equals("EUR") && to.equals("INR")) rate = 102.9;
        else System.out.println("Conversion not supported.");

        System.out.printf("%.2f %s = %.2f %s\n", amount, from, amount * rate, to);
        sc.close();
    }
}