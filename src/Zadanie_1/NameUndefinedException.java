package Zadanie_1;

public class NameUndefinedException extends Exception {

    public NameUndefinedException() {
        super("Imię i Nazwisko musi posiadać, co najmniej 3 litery");
    }
}
