package Zadanie_1;

import java.util.Scanner;
import java.util.SortedMap;



public class TestClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");



        String firstName = scanner.nextLine();
        System.out.println("Podaj Nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj pesel");
        String pesel = scanner.nextLine();

        Preson preson = new Preson(firstName,lastName,age,pesel );

        System.out.println(preson.toString());

    }


}
