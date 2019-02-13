package Zadanie_1;

import java.util.Scanner;
import java.util.SortedMap;



public class TestClass {
    public static void main(String[] args)  throws NameUndefinedException,IncorrectAgeException {

        Scanner scanner = new Scanner(System.in);
        String firstName = null;
        String lName = null;
        String pesel = null;
        int age  = 0;

        System.out.println("Podaj imię");
        firstName = scanner.nextLine();


        System.out.println("Podaj Nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wiek");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj pesel");
        pesel = scanner.nextLine();

        Preson preson = new Preson(firstName,lastName,age,pesel );

        System.out.println(preson.toString());

    }


}
