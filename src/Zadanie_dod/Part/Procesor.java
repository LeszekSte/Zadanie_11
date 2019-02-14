package Zadanie_dod.Part;

import Zadanie_dod.PatrtMotherBoard;
import Zadanie_dod.TempratureAlarmException;

import java.awt.*;

public class Procesor extends PatrtMotherBoard {
    private int timing;
    static private final int STEP_PROC = 10;

    public Procesor(String nameModel, String producer, String serialNumber, double tempetature, int maxTemp, int timing) {
        super(nameModel, producer, serialNumber, tempetature, maxTemp);
        this.timing = timing;
    }

    @Override
    public void increase(int jump) {
        double temp = getTempetature() + (jump/100)*STEP_PROC;
        if (temp>= getMaxTemp()){
            throw new TempratureAlarmException();
        }
        setTempetature(temp);
        this.timing+=jump;
    }

    @Override
    public String toString() {
        return  "Procesor{" +
                "Temp " + getTempetature()+
                ", timing=" + timing +
                '}';
    }
}
