import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj wiek");
        int wiek = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj PESEL");
        String pesel = scanner.nextLine();
        try {
            Person person1 = new Person(imie, nazwisko, wiek, pesel);
            System.out.println(person1);
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        } catch (IncorrectAgeException e1) {
            System.out.println(e1.getMessage());
        }
    }
}
