package number_3;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Phone p;
        System.out.print("Brand: ");
        String brand = in.next();
        System.out.print("Storage: ");
        int storage = in.nextInt();
        System.out.print("Price: ");
        double price = in.nextDouble();
        p = new Phone(brand, storage, price);

        System.out.println("");
        System.out.println(p.brand + " has a memory of " + p.storage + " GB and a price of Php" + p.price + "!");
    }
}

class Phone {
    String brand;
    int storage;
    double price;

    Phone(String brand, int storage, double price) {
        this.brand = brand;
        this.storage = storage;
        this.price = price;
    }
}
