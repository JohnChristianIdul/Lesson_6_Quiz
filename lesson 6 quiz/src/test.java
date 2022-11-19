import java.util.Scanner;

//class Rectangle{
//    int length;
//    int width;
//    int area;
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//    public void setWidth(int width) {
//        this.width = width;
//    }
//    public void Area(int length, int width) {
//        area = length*width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//    public int getWidth() {
//        return width;
//    }
//    public int getArea() {
//        return area;
//    }
//
//    public void display(){
//        System.out.println("Dimension: " + length + " x " + width);
//        System.out.println("Area: " + this.getArea());
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Rectangle r = new Rectangle();
//        System.out.print("Length: ");
//        int l = in.nextInt();
//        System.out.print("Width: ");
//        int w = in.nextInt();
//
//        System.out.println("");
//        r.setLength(l);
//        r.setWidth(w);
//        r.Area(l, w);
//        r.display();
//    }
//}


//class Game {
//    private String name;
//    private int yearPublished;
//    private String publisher;
//
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setYearPublished(int yearPublished){
//        this.yearPublished = yearPublished;
//    }
//    public void setPublisher(String publisher){
//        this.publisher = publisher;
//    }
//
//    public String getName(){
//        return name;
//    }
//    public int getYearPublished(){
//        return yearPublished;
//    }
//    public String getPublisher(){
//        return publisher;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Game g = new Game();
//        System.out.print("Enter game name: ");
//        String n = in.nextLine();
//        System.out.print("Enter year published: ");
//        int year = in.nextInt();
//        in.nextLine();
//        System.out.print("Enter game publisher: ");
//        String p = in.nextLine();
//
//        g.setName(n);
//        g.setYearPublished(year);
//        g.setPublisher(p);
//
//        System.out.println();
//        System.out.print( g.getName() + " is published on " + g.getYearPublished() + " by " + g.getPublisher() + ".");
//    }
//}