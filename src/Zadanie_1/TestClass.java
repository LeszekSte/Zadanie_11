package Zadanie_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {

        Scanner scanner = new Scanner(System.in);
        String firstName = null;
        String lName = null;
        String pesel = null;
        int age = 0;

        System.out.println("Podaj imię");
        firstName = scanner.nextLine();
        System.out.println("Podaj Nazwisko");
        String lastName = scanner.nextLine();
        boolean ok = false;
        do {
            try {
                System.out.println("Podaj wiek");
                age = scanner.nextInt();
                ok = true;
            } catch (InputMismatchException ex) {
                System.out.println("Podaj wiek 1-99");
            } finally {
                scanner.nextLine();
            }
        } while (!ok);

        System.out.println("Podaj pesel");
        pesel = scanner.nextLine();

        Preson preson = new Preson(firstName, lastName, age, pesel);

        System.out.println(preson.toString());
    }
}
