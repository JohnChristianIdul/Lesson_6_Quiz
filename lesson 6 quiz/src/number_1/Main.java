package number_1;
import java.util.Scanner;

class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String nationality;

    public String greeting(){
        return "Hello, I am " + firstName + " " + lastName + ", " + age + " years old and a " + nationality + "!";
    }
}

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Person n = new Person();
        System.out.print("Enter first name: ");
        n.firstName = in.nextLine();
        System.out.print("Enter last name: ");
        n.lastName = in.nextLine();
        System.out.print("Enter age: ");
        n.age = in.nextInt();
        in.nextLine();
        System.out.print("Enter nationality: ");
        n.nationality = in.nextLine();

        System.out.println("");
        System.out.print(n.greeting());
    }
}
