import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        final double PERCENTAGE_TO_LOWER_PRICE = 0.2;
        var keyboard = new Scanner(System.in);
        var title = keyboard.nextLine();
        var author = keyboard.nextLine();
        var price = keyboard.nextDouble();
        var pages = keyboard.nextInt();
        keyboard.nextLine();
        var book1 = new Book(title, author, price, pages);
        book1.setPrice(book1.getPrice() * (1 - PERCENTAGE_TO_LOWER_PRICE));
        var title2 = keyboard.nextLine();
        var author2 = keyboard.nextLine();
        var price2 = keyboard.nextDouble();
        var pages2 = keyboard.nextInt();
        var book2 = new Book(title2, author2, price2, pages2);
        book2.setPrice(book2.getPrice() * (1 - PERCENTAGE_TO_LOWER_PRICE));
        System.out.println(book2);
        System.out.println(book1);
    }
}
