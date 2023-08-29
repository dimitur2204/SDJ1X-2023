import java.util.Scanner;

public class Exercise208 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.println("How many shares did Joe purchase?");
        final var NUMBER_OF_SHARES = keyboard.nextInt();
        System.out.println("What was the purchase price per share?");
        final var PURCHASE_PER_PRICE_SHARE = keyboard.nextDouble();
        System.out.println("What was the purchase commission percentage?");
        final var PURCHASE_COMMISSION = keyboard.nextDouble() / 100;
        System.out.println("What was the sale price per share?");
        final var SALE_PRICE_PER_SHARE = keyboard.nextDouble();
        System.out.println("What was the sale commission percentage?");
        final var SALE_COMMISSION = keyboard.nextDouble() / 100;
        var purchasePrice = NUMBER_OF_SHARES * PURCHASE_PER_PRICE_SHARE;
        var purchaseCommissionAmount = purchasePrice * PURCHASE_COMMISSION;
        var salePrice = NUMBER_OF_SHARES * SALE_PRICE_PER_SHARE;
        var saleCommissionAmount = salePrice * SALE_COMMISSION;
        var profit = salePrice - saleCommissionAmount - purchasePrice - purchaseCommissionAmount;
        System.out.println("Joe paid $" + purchasePrice + " for the stock.");
        System.out.println("Joe paid $" + purchaseCommissionAmount + " in commission when he bought the stock.");
        System.out.println("Joe sold the stock for $" + salePrice + ".");
        System.out.println("Joe paid $" + saleCommissionAmount + " in commission when he sold the stock.");
        System.out.println("Joe made $" + profit + " in profit.");
    }
}
