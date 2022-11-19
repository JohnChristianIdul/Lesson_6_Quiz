package number_4;
import java.text.DecimalFormat;
import java.util.Scanner;

class Book {
    String publisher;
    int year_published;
    double price;
    String title;

    public Book(String publisher, int year_published, double price, String title) {
        this.publisher = publisher;
        this.year_published = year_published;
        this.price = price;
        this.title = title;
    }
    private static final DecimalFormat dec = new DecimalFormat("0.00");
    static void display(String p, int y, double price, String t){
        System.out.print(t + " is published by " + p + " on " + y + ". It sells at the price of Php" + dec.format(price) + "." );
    }
}

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book b;
        System.out.print("Published: ");
        String p = in.nextLine();
        System.out.print("Year: ");
        int y = in.nextInt();
        System.out.print("Price: ");
        double price = in.nextDouble();
        in.nextLine();
        System.out.print("Book Title: ");
        String t = in.nextLine();

        b = new Book(p, y, price, t);
        b.display(p,y,price,t);
    }
}