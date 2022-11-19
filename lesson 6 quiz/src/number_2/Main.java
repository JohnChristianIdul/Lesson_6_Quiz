package number_2;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        Mighty();
        Mightier(num);
    }

    static void Mighty(){
        System.out.println("I am mighty!");
    }

    static void Mightier(int num){
        System.out.println("I am " + num + " times stronger than you!");
    }


}
