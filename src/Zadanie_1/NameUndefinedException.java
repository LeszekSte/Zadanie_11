package Zadanie_1;

public class NameUndefinedException extends RuntimeException {
    public NameUndefinedException(String ex) {
        super();
        System.out.println("Nazwisko i Imię musi mięć co najmniej 3 litery");
    }

    public NameUndefinedException() {

    }
}
