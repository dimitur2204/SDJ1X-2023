public class Book {
    private String author;
    private String title;
    private double price;
    private int pages;
    public Book(){
        this.author = null;
        this.title = null;
        this.price = 0;
        this.pages = 0;
    }
    public Book(String author, String title, double price, int pages){
        this.author = author;
        this.title = title;
        this.price = price;
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String toString(){
        return String.format("Title: %s, Author: %s, Price: %.2f, Pages: %d", title, author, price, pages);
    }
}

