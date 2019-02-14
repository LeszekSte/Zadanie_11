package Zadanie_dod;

public class TempratureAlarmException extends RuntimeException {
//    public TempratureAlarmException(String ex){
//        super("Za duże taktowanie - UWAGA Przegrzanie  ") ;
//    }

    public TempratureAlarmException() {
        super("Za duże taktowanie procesora  - Przegrzanie  ");
    }
}
