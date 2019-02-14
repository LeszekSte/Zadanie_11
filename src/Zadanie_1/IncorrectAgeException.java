package Zadanie_1;

public class IncorrectAgeException extends Exception {

    public IncorrectAgeException() {
        super("Wiek musi być większy od 0");
    }
}
