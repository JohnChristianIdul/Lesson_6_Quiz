import java.util.Scanner;
//
//class Point{
//    int x;
//    int y;
//    double distance;
//
//    public void setX(int x) {
//        this.x = x;
//    }
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public int getX() {
//        return x;
//    }
//    public int getY() {
//        return y;
//    }
//
//    public void calculateDistance(int x,int y){
//        this.distance = Math.sqrt((x*x) + (y*y));
//    }
//    public void printCoordinates(){
//        System.out.println("(" + x + "," + y + ")");
//        System.out.print(String.format("%.2f",distance));
//    }
//
//}
//
//class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Point p = new Point();
//
//        System.out.print("Enter x: ");
//        int x = in.nextInt();
//        System.out.print("Enter y: ");
//        int y = in.nextInt();
//
//        p.setX(x);
//        p.setY(y);
//        p.calculateDistance(x,y);
//        p.printCoordinates();
//    }
//}

import java.util.Scanner;

//class Phone {
//    public void call(){
//        System.out.println("Calling Emergency services...");
//    }
//
//}
//
//class Number extends Phone{
//    String number;
//
//    public void setNumber(String number) {
//        this.number = number;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    @Override
//    public void call(){
//        System.out.println("Calling number " + number + "...");
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Number n = new Number();
//        Phone p = new Phone();
//
//        System.out.print("Enter number: ");
//        String num = in.nextLine();
//
//        n.setNumber(num);
//        if(num.charAt(0) == '0' && num.length() == 1){
//            p.call();
//        }
//        else {
//            n.call();
//        }
//    }
//}
//
//Instructions:
//
//        1.Create a class named “Animal” that has the method sound() which prints “Animals make sound.”
//
//        2.Create a class named “Cat”, “Dog”, “Pig”, “Rat” which all extends the “Animal” class.
//
//        3.Override the sound() method from Animal. These are the sound of the animals:
//
//        Cat - prints "*meow meow*"
//        Dog - prints "*barf barf*"
//        Pig - prints "*oink oink*"
//        Rat - prints "*squeak squeak*"
//        4.Call the sound() methods in the same order as stated in #3.

import java.util.Scanner;


