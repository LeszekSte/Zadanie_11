package Zadanie_dod;

public class TempratureAlarmException extends RuntimeException {
    public TempratureAlarmException(String ex){

    }

    public TempratureAlarmException() {
        super("Za duże taktowanie procesora  - Przegrzanie  ");
    }
}
