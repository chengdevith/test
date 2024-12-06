import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 18;
        String name = "jame bond !";
        System.out.println("Hello World!");
        System.out.println("This is the person information");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
        System.out.println("name: " + name);
    }
}