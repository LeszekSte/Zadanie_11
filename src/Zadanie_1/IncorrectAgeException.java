package Zadanie_1;

public class IncorrectAgeException extends Exception {
    public  IncorrectAgeException(String message  ){
        message = "Wiek musi być większy od 0";
    }


    public IncorrectAgeException() {

    }
}
